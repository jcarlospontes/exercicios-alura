package br.com.alura.threads;

public class Principal {
    public static void main(String[] args) {
        String nomeBusca = "da";

        Thread threadAssinaturas1 = new Thread(new TarefaBuscaTextual("assinaturas1.txt", nomeBusca));
        Thread threadAssinaturas2 = new Thread(new TarefaBuscaTextual("assinaturas2.txt", nomeBusca));
        Thread threadAutores = new Thread(new TarefaBuscaTextual("autores.txt", nomeBusca));

        threadAssinaturas1.start();
        threadAssinaturas2.start();
        threadAutores.start();


    }
}
