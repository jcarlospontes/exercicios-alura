package br.com.alura.lista;

import br.com.alura.threads.TarefaMultiplicacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class Principal {
    public static void main(String[] args) throws InterruptedException {
        //List<String> lista = Collections.synchronizedList(new ArrayList<String>());
        //List<String> lista = new Vector<String>();
        Lista lista = new Lista();

        for(int i = 0; i< 10; i++) {
            new Thread(new TarefaAdicionarElemento(lista, i)).start();
        }

        new Thread(new TarefaImprimir(lista)).start();

    }
}
