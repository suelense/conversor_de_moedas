package br.com.conversor.models;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class GetRates {

    public double getRate(String firstCoinCode, String finalCoinCode) throws IOException, InterruptedException {
        // Setting URL
        String url = "https://v6.exchangerate-api.com/v6/2a922194323034021e38feba/latest/" + firstCoinCode;

        // HttpClient
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        JsonElement jElement = JsonParser.parseString(response.body());
        JsonObject rate = jElement.getAsJsonObject().getAsJsonObject("conversion_rates");

        return(rate.get(finalCoinCode).getAsDouble());
    }
}
