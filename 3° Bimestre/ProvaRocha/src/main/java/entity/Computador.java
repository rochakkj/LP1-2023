package entity;

import jakarta.persistence.*;

import java.net.IDN;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table
public class Computador {


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "processador_id")
    private Processador processador;


    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "pasta_id")
    private List<Pastas> pastas;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column
    private String nomeDono;


    public Computador(String nomeDono) {
        this.nomeDono = nomeDono;
        this.pastas = new ArrayList<>();
    }


    public Processador getProcessador() {
        return processador;
    }

    public void setProcessador(Processador processador) {
        this.processador = processador;
    }

    public List<Pastas> getPastas() {
        return pastas;
    }

    public void setPastas(List<Pastas> pastas) {
        this.pastas = pastas;
    }


    @Override
    public String toString() {
        return "Computador: " +
                "\nDados do processador: " + processador +
                ", \nPastas: " + pastas +
                ", \nid=" + id +
                ", nomeDono='" + nomeDono + '\'' +
                '}';
    }
}
