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
    private String code = "";
    private String url = "https://v6.exchangerate-api.com/v6/2a922194323034021e38feba/latest/USD";

    public GetRates() throws IOException, InterruptedException {
    }

    public void setCode(String code) {
        this.code = code;
    }

    // HttpClient
    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();
    HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

    JsonElement jelement = new JsonParser().parse(response.body());
    JsonObject jobject = jelement.getAsJsonObject().getAsJsonObject("conversion_rates");


    public double getRate(String code) {
        return(jobject.get(code).getAsDouble());
    }
}
