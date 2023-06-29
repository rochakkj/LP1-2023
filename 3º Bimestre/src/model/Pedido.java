package model;

import repository.ExibirInterface;

public class Pedido extends Orcamento implements ExibirInterface{

    private String dataEntrega;
    private Boolean entregue;

    public Pedido(String dataEntrega) {
        this.dataEntrega = dataEntrega;
        this.entregue = false;
    }
}
