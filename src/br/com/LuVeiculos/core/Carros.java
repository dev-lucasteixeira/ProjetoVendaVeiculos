package br.com.LuVeiculos.core;

public class Carros extends Veiculos {
    private String Estado;

    public Carros(String marca, String nome, String modelo, String cor, int ano, String placa, String estado) {
        super(marca, nome, modelo, cor, ano, placa);
        this.Estado = estado;
    }

    public Carros() {
        super();
    }
}
