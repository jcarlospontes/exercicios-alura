package br.com.alura.desafio.atividades;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

record Pessoarun(String nome, int idade, String cidade) {}

public class ConversaoJsonParaObjetoFlexivel {

    public static void main(String[] args) {
        String jsonPessoa = "{\"nome\":\"Rodrigo\",\"cidade\":\"Brasília\"}";

        Gson gson = new GsonBuilder().setLenient().create();
        Pessoarun pessoa = gson.fromJson(jsonPessoa, Pessoarun.class);

        System.out.println("Objeto Pessoa: " + pessoa);
    }
}