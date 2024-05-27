package br.com.alura.desafio.atividades;

import com.google.gson.Gson;
record Pessoa(String nome, int idade, String cidade) {}

public class ConversaoJsonParaObjeto {

    public static void main(String[] args) {
        String jsonPessoa = "{\"nome\":\"Rodrigo\",\"idade\":20,\"cidade\":\"Brasília\"}";

        Gson gson = new Gson();
        Pessoarun pessoa = gson.fromJson(jsonPessoa, Pessoarun.class);

        System.out.println("Objeto Pessoa: " + pessoa);
    }
}