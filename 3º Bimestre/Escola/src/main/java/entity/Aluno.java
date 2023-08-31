package entity;

import jakarta.persistence.*;
import entity.*;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column
    private String senha;

    @Column
    private String nome;

    @Column
    private String prontuario;

    @Column
    private Double media;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "nota_id")
    private List<Nota> notas;


    public List<Nota> getNotas() {
        return notas;
    }

    public void setNotas(List<Nota> notas) {
        this.notas = notas;
    }

    public Aluno(String senha, String nome, String prontuario, Double media) {
        this.senha = senha;
        this.nome = nome;
        this.prontuario = prontuario;
        this.media = media;
        this.notas = new ArrayList<>();
    }


    public Double getMedia() {
        return media;
    }

    public void setMedia(Double media) {
        this.media = media;
    }
    
    /*public void media(){

        for(int i = 0; i < notas.size(); i++) {
            media += notas.get(i);
        }
    }*/

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", senha='" + senha + '\'' +
                ", nome='" + nome + '\'' +
                ", prontuario='" + prontuario + '\'' +
                ", media=" + media +
                ", notas=" + notas +
                '}';
    }
}
