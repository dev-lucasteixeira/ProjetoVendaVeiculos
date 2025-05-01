package br.com.LuVeiculos.core;

public class Motos extends Veiculos {

    private String escapamento;

    public Motos(String marca, String nome, String modelo, String cor, int ano, String placa, String escapamento) {
        super(marca, nome, modelo, cor, ano, placa);
        this.escapamento = escapamento;
    }

    public Motos() {

    }
}
