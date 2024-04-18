package br.com.conversor.models;

public class Messages {

    public void getFirstMessage() {
        System.out.println("""
                *****************************************
                           CONVERSOR DE MOEDAS
                *****************************************
                """);
    }

    public void getMenuMessage() {
        System.out.println("""
                -----------------------------------------
                |   CÓDIGO  |   DESCRIÇÃO:              |
                -----------------------------------------
                |   ARS	    |   Peso Argentino          |
                |   BOB     |   Boliviano               |
                |   BRL     |   Real Brasileiro         |
                |   CLP     |   Peso Chileno            |
                |   COP     |   Peso Colombiano         |
                |   EUR     |   Euro                    |
                |   FKP     |   Libra Ilhas Falkland    |
                |   GYD     |   Dólar da Guiana         |
                |   PYG     |   Guarani Paraguaio       |
                |   PEN     |   Sol Peruano             |
                |   SRD     |   Dólar do Suriname       |
                |   USD     |   Dólar Estados Unidos    |
                |   UYU     |   Peso Uruguaio           |
                -----------------------------------------
                """);
    }

    public void getValueMessage() {
        System.out.println("Digite o valor que deseja converter:");
    }

    public void getFirstCodeOfCoin() {
        System.out.println("Digite o código da moeda de Origem:");
    }

    public void getFinalCodeOfCoin() {
        System.out.println("Digite o código da moeda de Destino:");
    }

    public void getResultMessage(double value, String firstCoinCode, String finalCoinCode, double result) {
        System.out.println(value + " " + firstCoinCode + " = " + result + " " +finalCoinCode);
    }

    public void getOptionYesNo() {
        System.out.println("""
                Deseja fazer uma nova conversão?
                1-SIM 2-NÃO
                Digite a opção desejada:""");
    }

    public void getFinalMessage() {
        System.out.println("Operação finalizada com sucesso!");
    }
}
