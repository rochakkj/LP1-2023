package entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "pessoa")
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String primeiroNome;
    @Column
    private String sobrenome;
    @Column
    private String email;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn (name = "Endereco.id")
    private Endereco endereco;
    @OneToMany (cascade = CascadeType.ALL, mappedBy = "pessoa")
    private List<Pedido> pedidos;


    public Pessoa(String primeiroNome, String sobrenome, String email, Endereco endereco) {
        this.primeiroNome = primeiroNome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + id +
                ", primeiroNome='" + primeiroNome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", email='" + email + '\'' +
                ", endereco=" + endereco +
                '}';
    }
}
