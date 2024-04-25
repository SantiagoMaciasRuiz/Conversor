package com.santiago.modelos;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Consultas {

    public double buscaMonedas(String tipoMoneda, String tipoMoneda2){
        // Crear una URI con la URL del servicio de tasas de cambio de moneda
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/5ff28889d090669fb5760421/latest/" + tipoMoneda);

        // Crear un cliente HTTP
        HttpClient client = HttpClient.newHttpClient();

        // Crear una solicitud HTTP con la URI construida
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        // Realizar la solicitud HTTP
        try {
            // Enviar la solicitud y obtener la respuesta
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            //
            Gson gson = new Gson();
            //Map<String, Double> conversionRates = gson.fromJson(response.body(), Map.class);
            JsonObject jsonObject = new Gson().fromJson(response.body(), JsonObject.class);

            // Obtener el JsonObject dentro de "conversion_rates"
            JsonObject conversionRates = jsonObject.getAsJsonObject("conversion_rates");
            double valorParaConvertir = conversionRates.get(tipoMoneda).getAsFloat()*conversionRates.get(tipoMoneda2).getAsFloat();
            // Convertir la respuesta JSON a un objeto Moneda utilizando Gson
            return valorParaConvertir;
        } catch (Exception e) {
            // Si ocurre una excepción, lanzar una RuntimeException con un mensaje de error
            throw new RuntimeException("No Encontre nada");
        }
    }
}
