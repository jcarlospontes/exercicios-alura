package br.com.alura.banco;

public class TarefaAcessoBancoProcedimento implements Runnable {
    private PoolDeConexao pool;
    private GerenciadorDeTransacao tx;

    public TarefaAcessoBancoProcedimento(PoolDeConexao pool, GerenciadorDeTransacao tx) {
        this.pool = pool;
        this.tx = tx;
    }

    @Override
    public void run() {
        synchronized (tx) {
            System.out.println("comecando a transação tx");
            tx.begin();

            synchronized (pool) {
                System.out.println("conexao pega no pool");
                pool.getConnection();
            }
        }
    }
}
