package org.example;


import entity.Aluno;
import entity.Nota;
import entity.Professor;
import entity.Turma;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Professor p1 = new Professor("abc1", "1234343", "Arlindo", "sp3090456");

        Aluno a1 = new Aluno("123", "Ernesto", "sp3090768", 10.0);
        Aluno a2 = new Aluno("1234", "Fabricio", "sp3098567", 6.6);
        Aluno a3 = new Aluno("arlindo1", "Arlindo", "sp3096534", 5.0);


        Turma t1 = new Turma(11, "lg1");


        Nota n1 = new Nota(10.0);
        Nota n2 = new Nota(8.0);
        Nota n3 = new Nota(6.0);
        Nota n4 = new Nota(4.0);
        Nota n5 = new Nota(2.0);


        t1.setProfessor(p1);
        t1.setAlunos(new ArrayList<>(List.of(a1,a2,a3)));


        a1.setNotas(new ArrayList<>(List.of(n2)));
        a2.setNotas(new ArrayList<>(List.of(n3)));
        a3.setNotas(new ArrayList<>(List.of(n1)));


        System.out.println(t1);
        Session session1 = HibernateUtil.getSessionFactory().openSession();

        Transaction transaction1 = session1.beginTransaction();

        session1.persist(t1);

        transaction1.commit();

        List<Turma> turma= session1.createQuery("from Turma", Turma.class).list();

        for (Turma t :turma ) {

            System.out.println(t);
        }

    }
}