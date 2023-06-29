package model;

import repository.ExibirInterface;

import java.util.function.DoubleBinaryOperator;

public class ItemPedido implements ExibirInterface {

    private static Long idBase;
    private Long id;
    private String peca;
    private String modelo;
    private String tamanho;
    private Double valor;

    public ItemPedido(String peca, String modelo, String tamanho, Double valor) {
        this.peca = peca;
        this.modelo = modelo;
        this.tamanho = tamanho;
        this.valor = valor;
        idBase++;
        id = idBase;

    }

    public static Long getIdBase() {
        return idBase;
    }

    public static void setIdBase(Long idBase) {
        ItemPedido.idBase = idBase;
    }

    public Long getId() {
        return id;
    }

    public String getPeca() {
        return peca;
    }

    public void setPeca(String peca) {
        this.peca = peca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public void exibir(Boolean completo) {

    }
}
