package br.com.alura.comex.executaveis;

import br.com.alura.comex.modelos.Endereco;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class TestaIntegracaoViaCep {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner busca = new Scanner(System.in);
        System.out.println("Por favor digite o CEP: ");
        var buscaCEP = busca.nextLine();

        try {

            String endereco = "https://viacep.com.br/ws/" + buscaCEP + "/json/";

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());
            String s = response.body();
            Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.IDENTITY).create();
            TradutorAPI api = gson.fromJson(s, TradutorAPI.class);
            Endereco endereco1 = new Endereco(api);
            System.out.println(endereco1);

        }catch (Exception e){
            System.out.println("Erro de API");
        }

    }
}