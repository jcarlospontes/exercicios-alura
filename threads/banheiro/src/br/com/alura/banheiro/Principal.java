package br.com.alura.banheiro;

public class Principal {
    public static void main(String[] args) {

        Banheiro banheiro = new Banheiro();

        Thread convidado1 = new Thread(new Tarefa1(banheiro), "Jon");
        Thread convidado2 = new Thread(new Tarefa2(banheiro), "Fer");
        Thread convidado3 = new Thread(new Tarefa1(banheiro), "Pat");
        Thread convidado4 = new Thread(new Tarefa2(banheiro), "Rod");
        Thread limpeza = new Thread(new TarefaLimpeza(banheiro), "Limpeza");
        limpeza.setDaemon(true);


        convidado1.start();
        convidado2.start();
        limpeza.start();
        convidado3.start();
        convidado4.start();
    }
}
