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
    // Setting URL
    private final String url = "https://v6.exchangerate-api.com/v6/2a922194323034021e38feba/latest/USD";

    public GetRates() throws IOException, InterruptedException {
    }

    // HttpClient
    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();
    HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

    JsonElement jelement = JsonParser.parseString(response.body());
    JsonObject rate = jelement.getAsJsonObject().getAsJsonObject("conversion_rates");


    public double getRate(String code) {
        return(rate.get(code).getAsDouble());
    }
}
