package org.example;


import entity.Passageiro;
import entity.Piloto;
import entity.Viagem;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.util.ArrayList;
import java.util.List;

public class Main {
        public static void main(String[] args) {

            Piloto pl1 = new Piloto("Rocha","SOS");

            Passageiro ps1 = new Passageiro("Marcinho", "638400187-79");
            Passageiro ps2 = new Passageiro("Juninho", "659155307-79");
            Passageiro ps3 = new Passageiro("Pedrinho", "645475867-79");
            Passageiro ps4 = new Passageiro("Junior", "122390472-90");
            Passageiro ps5 = new Passageiro("Lucas", "385923045-80");

            Viagem v1 = new Viagem(4, "Pernambuco, Salvador");
            v1.setPiloto(pl1);
            v1.setPassageiros(new ArrayList<>(List.of(ps1, ps2, ps3, ps4, ps5)));

            Session session1 = HibernateUtil.getSessionFactory().openSession();

            Transaction transaction1 = session1.beginTransaction();


            session1.persist(v1);

            transaction1.commit();

            List<Viagem> viagens = session1.createQuery("from Viagem", Viagem.class).list();





            for (Viagem v: viagens) {
                System.out.println(v);
            }

    }
}