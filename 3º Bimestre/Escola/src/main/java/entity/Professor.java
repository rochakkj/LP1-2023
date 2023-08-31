package entity;

import jakarta.persistence.*;

@Entity
@Table
public class Professor {

    @Column
    private String senha;

    @Column
    private String cpf;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nome;

    @Column
    private String prontuario;


    public Professor(String senha, String cpf, String nome, String prontuario) {
        this.senha = senha;
        this.cpf = cpf;
        this.nome = nome;
        this.prontuario = prontuario;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "senha='" + senha + '\'' +
                ", cpf='" + cpf + '\'' +
                ", id=" + id +
                ", nome='" + nome + '\'' +
                ", prontuario='" + prontuario + '\'' +
                '}';
    }
}
