package hibernate;

import hibernate.dao.CatDAO;
import hibernate.dao.CatOwnerDAO;
import hibernate.model.Barber;
import hibernate.model.Cage;
import hibernate.model.Cat;
import hibernate.model.CatOwner;
import hibernate.ultis.HibernateUtlis;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello");
        //Session session = HibernateUtlis.getCurrentSessionFromConfig();

 //       Cat cat = new Cat();
//        cat.setId(10);
//        cat.setRating(10);
//        cat.setGender(true);
//        cat.setBreed("persian");
//
//        Transaction trn = session.beginTransaction();
//        session.save(cat);
//        trn.commit();

//        Transaction trn = session.beginTransaction();
//        Cat cat = session.load(Cat.class,1);
//        System.out.println(cat);
//        trn.commit();

//        Transaction trn = session.beginTransaction();
//    List<Cat> cats = session.createCriteria(Cat.class).list();
//        trn.commit();
//        System.out.println(cats);

//        Transaction trn = session.beginTransaction();
//        Cage cage = new Cage(1, "black", "EE1234");
//        session.save(cage);
//        trn.commit();
//        Transaction trn = session.beginTransaction();
//        Cat cat = session.load(Cat.class, 1L);
//        System.out.println(cat);
//        trn.commit();


//        Cat cat = new Cat(7, "british", 50, false);
//        Cage cage = new Cage(2, "red", "LV1234");
//        cage.setCat(cat);
//        cat.setCage(cage);
//
//        Transaction trn = session.beginTransaction();
//        session.save(cat);
//        session.save(cage);
//        trn.commit();

//        Transaction trn = session.beginTransaction();
//        CatOwner catOwner = session.load(CatOwner.class, 1L);
//        System.out.println(catOwner);
//        trn.commit();

//        Transaction trn = session.beginTransaction();
//
//        CatOwner catOwner = session.load(CatOwner.class, 1L);
//        Cage cage = session.load(Cage.class, 1L);
//
//        List<Barber> barbers = new ArrayList<>();
//        List<Cat> cats = new ArrayList<>();
//        Barber jack = new Barber(4, "Jack", "Estonia", "Short", null);
//
//        barbers.add(jack);
//        Cat cat = new Cat(8, "est", 3, true, cage, catOwner, barbers);
//        cats.add(cat);
//        jack.setClients(cats);
//        Cat kass = session.load(Cat.class, 1L);
//        kass.setBarbers(barbers);
//        cats.add(kass);
//
//        session.save(cat);
//        session.save(jack);
//
//        trn.commit();



//        CatDAO catDAO = new CatDAO();
//        Cat cat = catDAO.getCatWithBiggestRating();
//        System.out.println(cat);

//        CatDAO catDAO = new CatDAO();
//        List<Cat> cats = catDAO.getAllCatsByCatOwnerId(1L);
//        System.out.println(cats);

        CatDAO catDAO = new CatDAO();
//        List<Cat> cats =catDAO.getAllCatsByCatOwnerCode("111111111");
//        System.out.println(cats);

//        List<Cat> catList = catDAO.getCatsByOwnerName("O");
//        System.out.println(catList);
//
//        List<Cat> cats=catDAO.getCatsByGender(true);
//        System.out.println(cats);

//        List<String> catsList = new ArrayList<>();
//        catsList.add("persian");
//        catsList.add("british");
//
//        List<Cat> catsByBreed = catDAO.getCatsByBreeds(catsList);
//        System.out.println(catsByBreed);

//        System.out.println();
//        List<Cat> catsWithRating = catDAO.getCatsWithRatingAbove(50);
//        System.out.println(catsWithRating);

//        List<Cat> catsWithMaxRating = catDAO.getCatWithMaxRating();
//        System.out.println(catsWithMaxRating);

//        List<Cat> catsWithoutOwner = catDAO.getCatsWithoutOwner();
//        System.out.println(catsWithoutOwner);

        CatOwnerDAO catOwnerDAO = new CatOwnerDAO();
        List<CatOwner> catOwners = catOwnerDAO.getCatOwnerByNameLike("o");



    }
}
