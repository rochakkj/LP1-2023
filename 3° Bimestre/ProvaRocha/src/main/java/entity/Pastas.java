package entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table
public class Pastas {

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "arquivo_id")
    private List<Arquivos> arquivos;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private  String dataCriacao;

    @Column
    private String nome;


    public Pastas(String dataCriacao, String nome) {
        this.dataCriacao = dataCriacao;
        this.nome = nome;
        this.arquivos = new ArrayList<>();
    }

    public List<Arquivos> getArquivos() {
        return arquivos;
    }

    public void setArquivos(List<Arquivos> arquivos) {
        this.arquivos = arquivos;
    }

    public void addArquivos(Arquivos arquivo){

        arquivos.add(arquivo);

    }


    @Override
    public String toString() {
        return "seus arquivos: " + arquivos +
                ", \nid = " + id +
                ", dataCriacao = '" + dataCriacao + '\'' +
                ", nome = '" + nome + '\'';
    }
}
