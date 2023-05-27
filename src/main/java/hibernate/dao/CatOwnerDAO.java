package hibernate.dao;

import hibernate.model.Cat;
import hibernate.model.CatOwner;
import hibernate.ultis.HibernateUtlis;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class CatOwnerDAO {

    public List<CatOwner> getCatOwnerByNameLike(String name) {
        Session session = HibernateUtlis.getCurrentSessionFromConfig();
        Transaction trn = session.beginTransaction();


        Criteria cr = session.createCriteria(CatOwner.class);

        // To get records having fistName starting with zara
        cr.add(Restrictions.like("name", "%" + name + "%"));

// Case sensitive form of the above restriction.
       // cr.add(Restrictions.ilike("firstName", "zara%"));
        List<CatOwner> catOwners = cr.list();
        System.out.println(catOwners);

        trn.commit();
        return catOwners;
    }
}
