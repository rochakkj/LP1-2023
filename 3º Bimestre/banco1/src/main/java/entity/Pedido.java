package entity;

import jakarta.persistence.*;

import java.util.List;

public class Pedido {


    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn (name = "Pessoa.id")
    private Pessoa pessoa;
    @Column
    private List<Produto> produtos;

    public Pedido(Pessoa pessoa, List<Produto> produtos) {
        this.pessoa = pessoa;
        this.produtos = produtos;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", pessoa=" + pessoa +
                ", produtos=" + produtos +
                '}';
    }
}
