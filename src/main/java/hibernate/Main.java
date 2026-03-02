package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setStudentClass("Year 1");
        student.setStudentName("Ola");
//        student.setStudentNo(1);

        Configuration config = new Configuration();
        config.addAnnotatedClass(hibernate.Student.class);
        config.configure();
        SessionFactory factory = config.buildSessionFactory();
        Session session = factory.openSession();

        Transaction transaction = session.beginTransaction();
        session.persist(student);
        transaction.commit();
    }
}
