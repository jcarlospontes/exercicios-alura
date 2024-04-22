public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numAvaliacoes;

    Musica(String titulo, String artista, int anolancamento, double avaliacoes, int numAvaliacoes){
        this.titulo = titulo;
        this.artista = artista;
        this.anoLancamento = anolancamento;
        this.avaliacao = avaliacoes;
        this.numAvaliacoes = numAvaliacoes;
    }

    void exibeFicha(){
        System.out.println("Titulo: "+this.titulo);
        System.out.println("Artista: "+this.artista);
        System.out.println("Ano laçamento: "+this.anoLancamento);
    }

    void avaliaMusica(double nota){
        nota += this.avaliacao;
        this.numAvaliacoes +=1;
    }

    double calculaMediaAvaliacoes(){
        return this.avaliacao/this.numAvaliacoes;
    }

}
