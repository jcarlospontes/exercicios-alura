package br.com.alura.cliente;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class ClienteTarefas {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 12345);
        System.out.println("Conexão estabelecida");

        Thread threadDeEnvio = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    PrintStream saida = new PrintStream(socket.getOutputStream());
                    Scanner scan = new Scanner(System.in);
                    while (scan.hasNextLine()) {
                        String linha = scan.nextLine();
                        if (linha.trim().equals("")){
                            break;
                        }
                        saida.println(linha);
                    }
                    saida.close();
                    scan.close();
                } catch (IOException e){
                    throw new RuntimeException(e);
                }
            }
        });

        Thread threadDeResposta = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    Scanner respostaServidor = new Scanner(socket.getInputStream());
                    System.out.println("---Recebendo dados do servidor---");
                    while (respostaServidor.hasNextLine()) {
                        String linha = respostaServidor.nextLine();
                        System.out.println(linha);
                    }
                    respostaServidor.close();
                } catch (IOException e){
                    throw new RuntimeException(e);
                }
            }
        });

        threadDeResposta.start();
        threadDeEnvio.start();

        threadDeEnvio.join();

        socket.close();
    }
}
