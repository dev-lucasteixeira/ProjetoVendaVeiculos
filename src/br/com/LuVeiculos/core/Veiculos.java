package br.com.LuVeiculos.core;

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
}
