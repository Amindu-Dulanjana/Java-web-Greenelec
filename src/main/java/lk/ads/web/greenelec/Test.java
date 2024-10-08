package lk.ads.web.greenelec;

import lk.ads.web.greenelec.entity.User;
import lk.ads.web.greenelec.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Test {
    public static void main(String[] args) {
        HibernateUtil.getSessionFactory().openSession();

    }
}
