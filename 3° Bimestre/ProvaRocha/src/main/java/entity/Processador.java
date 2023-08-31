package entity;

import jakarta.persistence.*;


@Entity
@Table
public class Processador {

    @Column
    private String nome;


    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String marca;

    @Column
    private int qtdPermitida;

    @Column
    private int geracao;


    public Processador(String nome, String marca, int qtdPermitida, int geracao) {
        this.nome = nome;
        this.marca = marca;
        this.qtdPermitida = qtdPermitida;
        this.geracao = geracao;

    }

    public int getQtdPermitida() {
        return qtdPermitida;
    }

    @Override
    public String toString() {
        return "nome = '" + nome + '\'' +
                ", id = " + id +
                ", marca = '" + marca + '\'' +
                ", qtdPermitida = " + qtdPermitida +
                ", geracao = " + geracao;
    }
}
