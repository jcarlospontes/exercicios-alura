package br.com.alura.servidor;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class DistribuirTarefas implements Runnable{

    private ServidorTarefas servidor;
    private ExecutorService threadPool;
    private Socket socket;
    private  BlockingQueue<String> filaComandos;

    public DistribuirTarefas(ExecutorService threadPool, BlockingQueue<String> filaComandos, Socket socket, ServidorTarefas servidor) {
        this.threadPool = threadPool;
        this.socket = socket;
        this.threadPool = Executors.newFixedThreadPool(4);
        this.servidor = servidor;
        this.filaComandos = filaComandos;
    }
    @Override
    public void run() {
        try {
            System.out.println("Distribuindo tarefas para " + socket);

            Scanner scanEntrada = new Scanner(socket.getInputStream());
            PrintStream saidaCliente = new PrintStream(socket.getOutputStream());
            while (scanEntrada.hasNextLine()) {
                String comando = scanEntrada.nextLine();
                System.out.println("Comando recebido " + comando);
                switch (comando) {
                    case "c1":
                        saidaCliente.println("Confirmacao comando c1");
                        ComandoC1 c1 = new ComandoC1(saidaCliente);
                        this.threadPool.execute(c1);
                        break;
                    case "c2":
                        saidaCliente.println("Confirmacao comando c2");
                        ComandoC2ChamaWS c2WS = new ComandoC2ChamaWS(saidaCliente);
                        ComandoC2AcessaBanco c2Banco = new ComandoC2AcessaBanco(saidaCliente);
                        Future<String> futureWS = this.threadPool.submit(c2WS);
                        Future<String> futureBanco = this.threadPool.submit(c2Banco);

                        this.threadPool.submit(new JuntaResultadosFutureWSFutureBanco(futureWS, futureBanco, saidaCliente));

                        break;
                    case "c3":
                        this.filaComandos.put(comando);
                        saidaCliente.println("Comando c3 adicionado na fila");
                        break;
                    case "fim":
                        saidaCliente.println("Desligando servidor");
                        servidor.parar();
                        break;
                    default:
                        saidaCliente.println("Comando nao encontrado");
                }
                //System.out.println(comando);
            }
            saidaCliente.close();
            scanEntrada.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
