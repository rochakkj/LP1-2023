package model;

import repository.ExibirInterface;

import java.util.List;

public class Orcamento implements ExibirInterface {
    private static Long idBase = 0L;
    private Long id;
    private Double valorTotal;
    private List<ItemPedido> itens;

    public Orcamento() {
        idBase++;
        id = idBase;
    }

    public static Long getIdBase() {
        return idBase;
    }

    public Long getId() {
        return id;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    @Override
    public void exibir(Boolean completo) {

    }
}
