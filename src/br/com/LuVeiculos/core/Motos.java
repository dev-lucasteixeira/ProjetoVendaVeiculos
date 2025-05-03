package br.com.LuVeiculos.core;

import java.util.ArrayList;

public class Motos extends Veiculos {

    private String escapamento;

    public Motos(String marca, String nome, String modelo, String cor, int ano, String placa, String escapamento) {
        super(marca, nome, modelo, cor, ano, placa);
        this.escapamento = escapamento;
    }

    public Motos() {

    }

    private static ArrayList<Motos> listaMotos = new ArrayList<>();

    public static void cadastrarMotos() {
        System.out.println("\n=== Cadastro de Moto ===");

        System.out.print("Digite a marca: ");
        String marca = System.console().readLine();

        System.out.print("Digite o modelo: ");
        String modelo = System.console().readLine();

        int ano = lerAno();

        double preco = lerPreco();

        // Criar novo carro e adicionar à lista
        Motos moto = new Motos();
        // Assumindo que sua classe Carros tem os métodos setters apropriados
        moto.setMarca(marca);
        moto.setModelo(modelo);
        moto.setAno(ano);
        moto.setPreco(preco);

        listaMotos.add(moto);

        System.out.println("\nMoto cadastrada com sucesso!");
    }

    public static void mostrarMotos() {
        if (listaMotos.isEmpty()) {
            System.out.println("\nNenhuma Moto cadastrado.");
            return;
        }

        System.out.println("\n=== Motos Cadastradas ===");
        for (Motos moto : listaMotos) {
            System.out.println("\nMarca: " + moto.getMarca().trim());
            System.out.println("Modelo: " + moto.getModelo().trim());
            System.out.println("Ano: " + moto.getAno());
            System.out.println("Preço: R$ " + moto.getPreco());
            System.out.println("------------------------");
        }
    }
}