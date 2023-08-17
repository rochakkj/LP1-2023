import entity.Endereco;
import entity.Pedido;
import entity.Pessoa;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.util.List;

public class Main {
    public static void main(String[]args){
        Pessoa p1 = new Pessoa ("Juninho", "Capixaba", "capixaba@gmail.com", new Endereco("Rua aa", "Uberladia"));
        Pessoa p2 = new Pessoa ("Samuel", "Xavier" , "xavier123@gmail.com",new Endereco("Rua Amarelinha", "Kidslandia"));
        Pessoa p3 = new Pessoa ("Marcos", "Leonardo", "leonardoM123@gmail.com",new Endereco("Rua a", "SP"));


        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(p1);
        session.persist(p2);
        session.persist(p3);

        transaction.commit();

        List<Pessoa> pessoas = session.createQuery("from pessoa", Pessoa.class).list();

        pessoas.forEach(pessoa -> System.out.println(pessoa.toString()));

        Endereco end1 = new Endereco("Rua Gonçalo de Carvalho", "Porto Alegre");
        Endereco end2 = new Endereco("Rua do Giz", "São Luís");
        Endereco end3 = new Endereco("Rua do Mucugê", "Arraial d’Ajuda");




        Session session1 = HibernateUtil.getSessionFactory().openSession();

        Transaction transaction1 = session1.beginTransaction();

        session1.persist(end1);
        session1.persist(end2);
        session1.persist(end3);

        transaction1.commit();
        transaction1.commit();
        List<Endereco> enderecos = session1.createQuery("from endereco", Endereco.class).list();

        enderecos.forEach(endereco -> System.out.println(endereco.toString()));

        Pedido ped1 = new Pedido(new Pessoa(""));
        Pedido ped2 = new Pedido(new Pessoa(""));
        Pedido ped3 = new Pedido(new Pessoa(""));


        Session session2 = HibernateUtil.getSessionFactory().openSession();

        Transaction transaction2 = session2.beginTransaction();

        session1.persist(ped1);
        session1.persist(ped2);
        session1.persist(ped3);

        transaction2.commit();
        transaction2.commit();
        List<Pedido> pedidos = session2.createQuery("from pedido", Pedido.class).list();

        pedidos.forEach(endereco -> System.out.println(Pedido.toString()));
    }
}