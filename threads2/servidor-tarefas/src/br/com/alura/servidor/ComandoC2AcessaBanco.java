package br.com.alura.servidor;

import java.io.PrintStream;
import java.util.Random;
import java.util.concurrent.Callable;

public class ComandoC2AcessaBanco implements Callable<String> {

    private PrintStream saida;

    public ComandoC2AcessaBanco(PrintStream saida) {
        this.saida = saida;
    }

    @Override
    public String call() throws Exception{
        System.out.println("Servidor recebeu comando C2 - Banco");

        saida.println("procesando comando c2 - Banco");

        Thread.sleep(25000);

        saida.println("Comando C2 executado com sucesso - Banco");

        int numero = new Random().nextInt(100) + 1;

        System.out.println("Servidor finalizou comando c2 - Banco");
        
        return Integer.toString(numero);
    }
}
