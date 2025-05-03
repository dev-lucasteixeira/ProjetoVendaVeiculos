package br.com.LuVeiculos.core;

import java.util.Calendar;

public class Veiculos {
    private String marca;
    private String nome;
    private String modelo;
    private String cor;
    private int ano;
    private String placa;
    private double preco;

    public Veiculos(String marca, String nome, String modelo, String cor, int ano, String placa) {
        this.marca = marca;
        this.nome = nome;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.placa = placa;
        this.preco = preco;
    }

    public Veiculos() {

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Veiculos{" + "marca=" + marca + ", nome=" + nome + ", modelo=" + modelo + ", cor=" + cor + ", ano=" + ano + ", placa=" + placa + '}';
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public static int lerAno() {
        Calendar cal = Calendar.getInstance();
        int anoAtual = cal.get(Calendar.YEAR);

        while (true) {
            try {
                System.out.print("Digite o ano do veículo: ");
                String entrada = System.console().readLine().trim();

                // Verifica se a entrada está vazia
                if (entrada.isEmpty()) {
                    System.out.println("O ano não pode estar vazio.");
                    continue;
                }

                // Converte a entrada para número
                int ano = Integer.parseInt(entrada);

                // Validações do ano
                if (ano < 1900) {
                    System.out.println("Ano inválido. O ano deve ser maior que 1900.");
                    continue;
                }

                if (ano > anoAtual) {
                    System.out.println("Ano inválido. O ano não pode ser maior que o ano atual (" + anoAtual + ").");
                    continue;
                }

                return ano;

            } catch (NumberFormatException e) {
                System.out.println("Por favor, digite apenas números para o ano.");
            }
        }
    }
    public static double lerPreco() {
        while (true) {
            try {
                System.out.print("Digite o preço do veículo (R$): ");
                String entrada = System.console().readLine().trim();

                // Verifica se a entrada está vazia
                if (entrada.isEmpty()) {
                    System.out.println("O preço não pode estar vazio.");
                    continue;
                }

                // Substitui vírgula por ponto (para aceitar formato brasileiro)
                entrada = entrada.replace(",", ".");

                // Remove o R$ se foi digitado
                entrada = entrada.replace("R$", "").trim();

                // Converte a entrada para número
                double preco = Double.parseDouble(entrada);

                // Validações do preço
                if (preco <= 0) {
                    System.out.println("O preço deve ser maior que zero.");
                    continue;
                }

                if (preco > 1000000) {
                    System.out.print("Preço muito alto. Confirma o valor de R$ " +
                            String.format("%.2f", preco) + "? (S/N): ");
                    String confirmacao = System.console().readLine().trim().toUpperCase();
                    if (!confirmacao.equals("S")) {
                        System.out.println("Digite o preço novamente.");
                        continue;
                    }
                }

                // Formata o preço para duas casas decimais
                return Math.round(preco * 100.0) / 100.0;

            } catch (NumberFormatException e) {
                System.out.println("Por favor, digite um valor numérico válido.");
            }
        }
    }
}
