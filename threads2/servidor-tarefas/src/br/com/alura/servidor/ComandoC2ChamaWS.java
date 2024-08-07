package br.com.alura.servidor;

import java.io.PrintStream;
import java.util.Random;
import java.util.concurrent.Callable;

public class ComandoC2ChamaWS implements Callable<String> {

    private PrintStream saida;

    public ComandoC2ChamaWS(PrintStream saida) {
        this.saida = saida;
    }

    @Override
    public String call() throws Exception{
        System.out.println("Servidor recebeu comando C2 - WS");

        saida.println("procesando comando c2 - WS");

        Thread.sleep(15000);

        saida.println("Comando C2 executado com sucesso - WS");

        int numero = new Random().nextInt(100) + 1;

        System.out.println("Servidor finalizou comando c2 - WS");

        return Integer.toString(numero);
    }
}
