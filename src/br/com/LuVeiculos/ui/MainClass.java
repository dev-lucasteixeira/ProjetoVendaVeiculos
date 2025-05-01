package br.com.LuVeiculos.ui;
import br.com.LuVeiculos.core.Carros;
import br.com.LuVeiculos.core.Motos;
import br.com.LuVeiculos.core.Veiculos;
import java.util.ArrayList;
import java.util.Calendar;

public class MainClass {
    // Criar uma lista para armazenar os carros
    private static ArrayList<Carros> listaCarros = new ArrayList<>();
    private static ArrayList<Motos> listaMotos = new ArrayList<>();

    public static void main(String[] args) {
        try {
            while (true) {
                exibirMenu();
                int opcao = Integer.parseInt(System.console().readLine());

                if (opcao == 1) {
                    cadastrarCarro();
                } else if (opcao == 2) {
                    cadastrarMotos();}
                else if (opcao == 3) {
                    mostrarCarros();
                }
                else if (opcao == 4) {
                    mostrarMotos();}
                else if (opcao == 0) {
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }
    }

    private static void cadastrarCarro() {
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
    private static void cadastrarMotos() {
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

        System.out.println("\nCarro cadastrado com sucesso!");
    }

    private static void mostrarCarros() {
        if (listaCarros.isEmpty()) {
            System.out.println("\nNenhum carro cadastrado.");
            return;
        }

        System.out.println("\n=== Carros Cadastrados ===");
        for (Carros carro : listaCarros) {
            System.out.println("\nMarca: " + carro.getMarca());
            System.out.println("Modelo: " + carro.getModelo());
            System.out.println("Ano: " + carro.getAno());
            System.out.println("Preço: R$ " + carro.getPreco());
            System.out.println("------------------------");
        }
    }

    private static void exibirMenu() {
        System.out.println("\nSelecione o que deseja fazer:");
        System.out.println("1. Cadastrar Carro");
        System.out.println("2. Cadastrar Moto");
        System.out.println("3. Ver Carros Disponíveis");
        System.out.println("4. Ver motos disponíveis");
        System.out.println("0. Sair");
        System.out.print("Opção: ");
    }

    private static void mostrarMotos() {
        if (listaMotos.isEmpty()) {
            System.out.println("\nNenhuma Moto cadastrado.");
            return;
        }

        System.out.println("\n=== Motos Cadastradas ===");
        for (Motos moto : listaMotos) {
            System.out.println("\nMarca: " + moto.getMarca());
            System.out.println("Modelo: " + moto.getModelo());
            System.out.println("Ano: " + moto.getAno());
            System.out.println("Preço: R$ " + moto.getPreco());
            System.out.println("------------------------");
        }
    }
private static int lerAno() {
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

private static double lerPreco() {
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