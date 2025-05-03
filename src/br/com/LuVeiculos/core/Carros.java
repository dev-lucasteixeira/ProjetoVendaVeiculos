package br.com.LuVeiculos.core;

import java.util.ArrayList;

public class Carros extends Veiculos {
    private String Estado;

    public Carros(String marca, String nome, String modelo, String cor, int ano, String placa, String estado) {
        super(marca, nome, modelo, cor, ano, placa);
        this.Estado = estado;
    }

    public Carros() {
        super();
    }
    private static ArrayList<Carros> listaCarros = new ArrayList<>();

    public static void cadastrarCarro() {
        System.out.println("\n=== Cadastro de Carro ===");

        System.out.print("Digite a marca: ");
        String marca = System.console().readLine();

        System.out.print("Digite o modelo: ");
        String modelo = System.console().readLine();

        int ano = lerAno();

        double preco = lerPreco();

        // Criar novo carro e adicionar à lista
        Carros carro = new Carros();
        // Assumindo que sua classe Carros tem os métodos setters apropriados
        carro.setMarca(marca);
        carro.setModelo(modelo);
        carro.setAno(ano);
        carro.setPreco(preco);

        listaCarros.add(carro);

        System.out.println("\nCarro cadastrado com sucesso!");
    }
    public static void mostrarCarros() {
        if (listaCarros.isEmpty()) {
            System.out.println("\nNenhum carro cadastrado.");
            return;
        }

        System.out.println("\n=== Carros Cadastrados ===");
        for (Carros carro : listaCarros) {
            System.out.println("\nMarca: " + carro.getMarca().trim());
            System.out.println("Modelo: " + carro.getModelo().trim());
            System.out.println("Ano: " + carro.getAno());
            System.out.println("Preço: R$ " + carro.getPreco());
            System.out.println("------------------------");
        }
    }
}
