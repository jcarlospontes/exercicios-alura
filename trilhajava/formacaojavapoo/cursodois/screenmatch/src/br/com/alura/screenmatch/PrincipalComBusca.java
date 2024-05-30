package br.com.alura.screenmatch;

import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.TituloOMDB;
import br.com.alura.screenmatch.excecao.ErroDeConversaoDeAnoException;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scan = new Scanner(System.in);
        String busca = "";
        List<Titulo> titulos = new ArrayList<>();
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        while (!busca.equalsIgnoreCase("sair")) {
            System.out.print("Digite um filme: ");
            busca = scan.nextLine();

            if(busca.equalsIgnoreCase("sair")){
                break;
            }

            var endereco = "https://www.omdbapi.com/?t=" + busca.replace(" ", "+") + "&apikey=3acf4a5";
            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();

                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                System.out.println(json);
                TituloOMDB meuTituloOmdb = gson.fromJson(json, TituloOMDB.class);
                Titulo meuTitulo = new Titulo(meuTituloOmdb);
                titulos.add(meuTitulo);
                System.out.println(json);

                System.out.println(meuTituloOmdb);
                System.out.println("meu titulo: ");
                System.out.println(meuTitulo);

            } catch (NumberFormatException e) {
                System.out.println("Aconteceu um erro: ");
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Algum erro de argumento na busca, verifique o endereço");
            } catch (ErroDeConversaoDeAnoException e) {
                System.out.println(e.getMessage());
            }

            System.out.println("O programa finalizou corretamente!");
        }

        FileWriter escrita = new FileWriter("filmes.json");
        escrita.write(gson.toJson(titulos));
        escrita.close();

        System.out.println("O programa finalizou corretamente!");
    }
}
