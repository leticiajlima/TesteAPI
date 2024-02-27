package br.com.alura.comex.executaveis;

import br.com.alura.comex.modelos.Cliente;
import br.com.alura.comex.modelos.Conta;
import br.com.alura.comex.modelos.Endereco;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class testeIntegracaoLeti {
    public static void main(String[] args) throws IOException, InterruptedException {
        try {

        String endpoint = "http://localhost:3000/cliente";


        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endpoint))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
        String s = response.body();
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.IDENTITY).create();
        TradutorApiLetiCliente api = gson.fromJson(s, TradutorApiLetiCliente.class);
        Cliente cliente1 = new Cliente(api);
        System.out.println(cliente1);

        Cliente cliente2 = new Cliente("23124354334");
            System.out.println(cliente2);

    } catch (Exception e){
        System.out.println("Erro de API");
    }
    }

}

