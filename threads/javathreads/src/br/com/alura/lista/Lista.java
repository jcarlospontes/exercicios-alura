package br.com.alura.lista;

public class Lista {
    private String[] elementos = new String[1000];
    private int indice = 0;

    public void adicionaElementos(String elemento) {
        synchronized (this) {
            this.elementos[indice] = elemento;
            this.indice++;
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            if (this.indice == this.elementos.length) {
                System.out.println("lista cheia, notificando");
                this.notify();
            }
        }
    }

    public int tamanho() {
        return this.elementos.length;
    }

    public String pegaElemento(int posicao) {
        return this.elementos[posicao];
    }

    public boolean estaCheia() {
        return this.indice == this.tamanho();
    }
}