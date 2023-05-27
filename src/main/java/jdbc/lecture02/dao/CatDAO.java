package jdbc.lecture02.dao;


import jdbc.lecture02.Cat;
import jdbc.lecture02.CatOwner;
import jdbc.lecture02.ConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class CatDAO {
    private ConnectionManager connectionManager;

    public CatDAO() {
        connectionManager = new ConnectionManager();
    }

    public void addCat(Cat cat) {
        Connection connection = connectionManager.createConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO `cat_club`.`cat`" +
                    "(`breed`,`rating`,`gender`,`cat_owner_id`) VALUES(?,?,?,?)");

            preparedStatement.setString(1, cat.getBreed());
            preparedStatement.setLong(2, cat.getRating());
            preparedStatement.setBoolean(3, cat.isGender());
            if (cat.getCatOwner() != null) {
                preparedStatement.setLong(4, cat.getCatOwner().getId());
            } else {
                preparedStatement.setLong(4, 0);
            }
            preparedStatement.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Cat getCatById(long id) {
        Cat cat = new Cat();
        cat.setId(id);
        Connection connection = connectionManager.createConnection();
        try {
            PreparedStatement preparedStatement =
                    connection.prepareStatement("SELECT * " +
                            "FROM cat_club.cat " +
                            "WHERE id = ?");

            preparedStatement.setLong(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                cat.setId(rs.getLong("id"));
                cat.setBreed(rs.getString("breed"));
                cat.setRating(rs.getLong("ratting"));
                cat.setGender(rs.getBoolean("gender"));

            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return cat;
    }

    public CatOwner getCatOwnerByCatId(long catId) {
        Connection connection = connectionManager.createConnection();
        CatOwner catOwner = new CatOwner();

            try {
                PreparedStatement preparedStatement =
                        connection.prepareStatement("SELECT * FROM cat_club.cat_owner " +
                                "WHERE id IN (SELECT cat_owner_id FROM cat_club.cat WHERE id = ?)");
                preparedStatement.setLong(1, catId);

                ResultSet rs = preparedStatement.executeQuery();


                while (rs.next()) {

                    catOwner.setId(rs.getLong("id"));
                    catOwner.setAddress(rs.getString("address"));
                    catOwner.setCode(rs.getString("code"));
                    catOwner.setName(rs.getString("name"));

                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
          return catOwner;
        }
    }

