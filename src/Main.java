import br.com.conversor.calculator.Converter;
import br.com.conversor.models.Messages;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        int option = 0;
        double result;
        Messages messages = new Messages();
        Converter converter = new Converter();

        messages.getFristMessage();

        while (option != 7) {
            option = messages.getMenuMessage();
            switch (option) {
                case 1:
                    //Dólar -> Peso Argentino
                    result = converter.dolarToOtherCoin("ARS");
                    messages.getresultMessage(result);
                    break;
                case 2:
                    //Peso Argentino -> Dólar
                    result = converter.otherCoinToDolar("ARS");
                    messages.getresultMessage(result);
                     break;
                case 3:
                    //Dólar -> Real Brasileiro
                    result = converter.dolarToOtherCoin("BRL");
                    messages.getresultMessage(result);
                    break;
                case 4:
                    //Real Brasileiro -> Dólar
                    result = converter.otherCoinToDolar("BRL");
                    messages.getresultMessage(result);
                    break;
                case 5:
                    //Dólar -> Peso Colombiano
                    result = converter.dolarToOtherCoin("COP");
                    messages.getresultMessage(result);
                    break;
                case 6:
                    //Peso Colombiano -> Dólar
                    result = converter.otherCoinToDolar("COP");
                    messages.getresultMessage(result);
                    break;
                case 7:
                    messages.getFinalMessage();
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}