package entity;

import jakarta.persistence.*;


@Entity
@Table
public class Arquivos {

    @Column
    private String nome;

    @Column
    private String extensao;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    public Arquivos(String nome, String extensao) {
        this.nome = nome;
        this.extensao = extensao;
    }



    @Override
    public String toString() {
        return "\nnome = '" + nome + '\'' +
                ", extensao = '" + extensao + '\'' +
                ", id = " + id;
    }
}
