import entity.Pessoa;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.util.List;

public class Main {
    public static void main(String[]args){
        Pessoa p1 = new Pessoa ("Juninho", "Capixaba", "capixaba@gmail.com");
        Pessoa p2 = new Pessoa ("Samuel", "Xavier" , "xavier123@gmail.com");
        Pessoa p3 = new Pessoa ("Marcos", "Leonardo", "leonardoM123@gmail.com");


        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(p1);
        session.persist(p2);
        session.persist(p3);

        transaction.commit();

        List<Pessoa> pessoas = session.createQuery("from pessoa", Pessoa.class).list();

        pessoas.forEach(pessoa -> System.out.println(pessoa.toString()));

    }
}