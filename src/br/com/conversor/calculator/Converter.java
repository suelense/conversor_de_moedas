package br.com.conversor.calculator;

import br.com.conversor.models.GetRates;
import br.com.conversor.models.Messages;

import java.io.IOException;
import java.util.Scanner;

public class Converter {
    Messages messages = new Messages();
    GetRates newRate = new GetRates();
    Scanner scanner = new Scanner(System.in);

    public Converter() throws IOException, InterruptedException {
    }

    public double dolarToOtherCoin(String coin) {
        messages.getValueConvertMessage();
        double valueToConvert = scanner.nextDouble();
        double coinValue = newRate.getRate(coin);
        return valueToConvert * coinValue;
    }

    public double otherCoinToDolar(String coin) {
        messages.getValueConvertMessage();
        double valueToConvert = scanner.nextDouble();
        double coinValue = newRate.getRate(coin);
        return valueToConvert / coinValue;
    }
}
