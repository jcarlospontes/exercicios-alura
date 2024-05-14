package br.com.alura.desafio.principal;

import br.com.alura.desafio.modelos.MinhasPreferidas;
import br.com.alura.desafio.modelos.Musicas;
import br.com.alura.desafio.modelos.Podcasts;
import br.com.alura.screenmatch.modelos.Filme;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Musicas minhaMusica = new Musicas();
        minhaMusica.setTitulo("Alguma");
        minhaMusica.setArtista("Algum");

        for(int x=0;x<1000;x++){
            minhaMusica.reproduzir();
        }

        for(int x=0;x<60;x++){
            minhaMusica.curtir();
        }

        Podcasts meuPodcast = new Podcasts();
        meuPodcast.setTitulo("AlgumPodcast");
        meuPodcast.setHost("Algum Host");

        for(int x=0;x<5000;x++){
            meuPodcast.reproduzir();
        }

        for(int x=0;x<1000;x++){
            meuPodcast.curtir();
        }

        MinhasPreferidas minhasPreferidas = new MinhasPreferidas();
        minhasPreferidas.inclui(meuPodcast);
        minhasPreferidas.inclui(minhaMusica);

    }
}
