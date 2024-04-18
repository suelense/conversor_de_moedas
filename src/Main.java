import br.com.conversor.calculator.Converter;
import br.com.conversor.models.Messages;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        int option = 0;
        Messages messages = new Messages();
        Converter converter = new Converter();
        Scanner scanner = new Scanner(System.in);

        messages.getFirstMessage();

        while (option != 2) {
            messages.getMenuMessage();
            converter.convertValue();
            messages.getOptionYesNo();
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    break;
                case 2:
                    messages.getFinalMessage();
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}