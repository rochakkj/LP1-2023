import entity.Arquivos;
import entity.Computador;
import entity.Pastas;
import entity.Processador;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Processador pc1 = new Processador("Intel I59400f", "Intel", 4, 5);

        Arquivos a1 = new Arquivos("IntelliJ IDEA", ".exe");
        Arquivos a2 = new Arquivos("foto.jpg", ".jpg");
        Arquivos a3 = new Arquivos("Valorant.exe", ".exe");
        Arquivos a4 = new Arquivos("Tetris", ".exe");

        Pastas pt1 = new Pastas("10/05/2022", "Meus Jogos");
        Pastas pt2 = new Pastas("15/07/2022", "Minhas Fotos");
        Pastas pt3 = new Pastas("01/04/2020", "Meus Programas");


        Computador c1 = new Computador("Juniho Pernambucano");

        pt1.setArquivos(new ArrayList<>(List.of(a3, a4)));
        pt2.setArquivos(new ArrayList<>(List.of(a2)));
        pt3.setArquivos(new ArrayList<>(List.of(a1)));


        c1.setProcessador(pc1);
        c1.setPastas(new ArrayList<>(List.of(pt1, pt2, pt3)));



        Session session1 = HibernateUtil.getSessionFactory().openSession();

        Transaction transaction1 = session1.beginTransaction();

        session1.persist(c1);

        transaction1.commit();


        List<Computador> c= session1.createQuery("from Computador", Computador.class).list();



        Arquivos a5 = new Arquivos("Google", ".exe");
        Arquivos a6 = new Arquivos("Firefox", ".exe");
        Arquivos a7 = new Arquivos("Opera", ".exe");



        if (pc1.getQtdPermitida() > pt1.getArquivos().size()){
            pt1.addArquivos(a5);
            pt1.addArquivos(a6);
            pt1.addArquivos(a7);
        }

        else
            System.out.println("Pasta cheia, não é possivel adicionar arquivos");


        Arquivos a8 = new Arquivos("Microsoft Edge", ".exe");
        if (pc1.getQtdPermitida() > pt1.getArquivos().size()){
            pt1.addArquivos(a8);

        }

        else
            System.out.println("Pasta cheia, não é possivel adicionar arquivos");







        for (Computador computador :c ) {

            System.out.println(computador);
        }



    }
}
