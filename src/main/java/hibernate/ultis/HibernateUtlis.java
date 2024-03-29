package hibernate.ultis;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtlis {
    public static Session getCurrentSessionFromConfig() {
        // SessionFactory in Hibernate 5 example
        Configuration config = new Configuration();
        config.configure();

        // local SessionFactory bean created
        SessionFactory sessionFactory = config.buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        return session;
    }
}
