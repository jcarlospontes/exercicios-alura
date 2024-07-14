package br.com.alura.threads;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TarefaBuscaTextual implements Runnable {
    private String nomeArquivo;
    private String nomeBusca;

    public TarefaBuscaTextual(String nomeArquivo, String nomeBusca) {
        this.nomeArquivo = nomeArquivo;
        this.nomeBusca = nomeBusca;
    }

    @Override
    public void run() {
        try {
            Scanner scan = new Scanner(new File(nomeArquivo));
            int numLinha = 1;
            while(scan.hasNextLine()){
                String linha = scan.nextLine();
                if (linha.toUpperCase().contains(nomeBusca.toUpperCase())) {
                    System.out.println(nomeArquivo + " - " + numLinha + " - " + linha);
                }
                numLinha++;
            }
            scan.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
