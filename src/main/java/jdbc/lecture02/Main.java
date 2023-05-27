package jdbc.lecture02;

import jdbc.lecture02.dao.CatDAO;
import jdbc.lecture02.dao.CatOwnerDAO;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CatOwner owner = new CatOwner("Owen", "Tartu", "111111111", new ArrayList<>());

        CatOwnerDAO catOwnerDAO = new CatOwnerDAO();
//        catOwnerDAO.addCatOwner(owner);
//        CatOwner catOwner = catOwnerDAO.getCatOwnerById(1);
//        System.out.println(catOwner);
//        List<CatOwner> catOwnersList = catOwnerDAO.getAllOwners();
//        System.out.println(catOwnersList);

//        CatOwner catOwner = catOwnerDAO.getCatOwnerById(1);
//        System.out.println(catOwner);
//        System.out.println(catOwner.getCats());



        CatDAO catDAO = new CatDAO();
       // catDAO.addCat(cat);
        //Cat cat1 = catDAO.getCatById(1);
        //System.out.println(cat1);
        Cat cat = new Cat();
        catDAO.addCat(cat);
        System.out.println(catDAO.getCatOwnerByCatId(0));

    }
}
