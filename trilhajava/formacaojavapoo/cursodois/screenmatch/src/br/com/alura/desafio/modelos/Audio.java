package br.com.alura.desafio.modelos;

public class Audio {
    private String titulo;
    private int reproducoes;

    private int curtidas;

    private int classificacao;


    public void curtir(){
        this.curtidas++;
    }

    public void reproduzir(){
        this.reproducoes++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getReproducoes() {
        return reproducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }
}
