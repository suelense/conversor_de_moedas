package br.com.conversor.calculator;

import br.com.conversor.models.GetRates;
import br.com.conversor.models.Messages;

import java.io.IOException;
import java.util.Scanner;

public class Converter {
    Messages messages = new Messages();
    Scanner scanner = new Scanner(System.in);
    GetRates newRate = new GetRates();


    public void convertValue() throws IOException, InterruptedException {
        messages.getValueMessage();
        double value = scanner.nextDouble();
        messages.getFirstCodeOfCoin();
        String firstCoinCode = scanner.next();
        messages.getFinalCodeOfCoin();
        String finalCoinCode = scanner.next();
        double rate = newRate.getRate(firstCoinCode, finalCoinCode);
        double convertedValue = value * rate;
        messages.getResultMessage(value, firstCoinCode, finalCoinCode, convertedValue);
    }
}
