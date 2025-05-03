package br.com.LuVeiculos.ui;
import br.com.LuVeiculos.core.Carros;
import br.com.LuVeiculos.core.Motos;
import br.com.LuVeiculos.core.Veiculos;
import java.util.ArrayList;
import java.util.Calendar;

import static br.com.LuVeiculos.core.Carros.cadastrarCarro;
import static br.com.LuVeiculos.core.Carros.mostrarCarros;
import static br.com.LuVeiculos.core.Motos.cadastrarMotos;
import static br.com.LuVeiculos.core.Motos.mostrarMotos;

public class MainClass {

    public static void main(String[] args) {
        try {
            while (true) {
                exibirMenu();
                int opcao = Integer.parseInt(System.console().readLine());

                switch (opcao) {
                    case 1: cadastrarCarro();break;
                    case 2: cadastrarMotos();break;
                    case 3: mostrarCarros();break;
                    case 4: mostrarMotos(); break;
                    case 0: break;
                    default: System.out.println("Opção inválida!"); break;
                }
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
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
}