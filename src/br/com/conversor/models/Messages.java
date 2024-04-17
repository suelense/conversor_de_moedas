package br.com.conversor.models;

import java.util.Scanner;

public class Messages {
    Scanner scanner = new Scanner(System.in);

    public void getFristMessage() {
        System.out.println("""
                ***************************************
                          CONVERSOR DE MOEDAS
                ***************************************
                """);
    }

    public int getMenuMessage() {
        System.out.println("""
                Opções:
                
                1 - Dólar           ->  Peso Argentino
                2 - Peso Argentino  ->  Dólar
                3 - Dólar           ->  Real Brasileiro
                4 - Real Brasileiro ->  Dólar
                5 - Dólar           ->  Peso Colombiano
                6 - Peso Colombiano ->  Dólar
                7 - Sair
                
                Digite a opção desejada:
                """);
        return scanner.nextInt();
    }

    public void getValueConvertMessage() {
        System.out.println("Digite o valor que deseja converter:");
    }

    public void getResultMessage(double result) {
        System.out.println("Valor convertido = " + result);
    }

    public void getFinalMessage() {
        System.out.println("Operação finalizada com sucesso!");
    }
}
