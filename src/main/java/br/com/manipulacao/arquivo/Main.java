package br.com.manipulacao.arquivo;

import br.com.manipulacao.arquivo.service.OperationsFileService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        menu_options_text();
        menu_options_choice(in);
    }

    public static void menu_options_text(){
        System.out.println("---------- OPÇÕES ----------");
        System.out.println("1. Ler e exibir arquivo");
        System.out.println("2. Escrever no arquivo");
        System.out.println("3. Sair");
        System.out.println("------------------------");
    }
    public static void menu_options_choice(Scanner in ) {
        String option = in.nextLine();
        OperationsFileService operationsFileService = new OperationsFileService(in);
        while (!"3".equals(option)) {
            switch (option) {
                case "1": // ler arquivo
                    operationsFileService.readFile();
                    break;
                case "2": // escrever no arquivo
                    break;
                case "3":
                    System.out.println("Até uma próxima");
                    break;
            }
            option = in.nextLine();
        }
    }
}