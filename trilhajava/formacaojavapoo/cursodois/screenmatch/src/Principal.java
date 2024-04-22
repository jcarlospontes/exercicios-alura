import br.com.alura.screenmatch.modelos.Filme;

public class Principal {

    public static void main(String[] args) {
        Filme favorito = new Filme();
        Pessoa pessoa = new Pessoa();
        Calculadora calculadora = new Calculadora();
        Musica musica = new Musica("Musica 1","Artista 1",1992,128,32);
        Carro carro = new Carro();
        Aluno aluno = new Aluno();

        favorito.nome = "The Matrix";
        favorito.anoDeLancamento = 1999;
        favorito.duracaoEmMinutos = 135;
        favorito.incluidoNoPlano = true;

        favorito.exibeFichaTecnica();
        favorito.avalia(9);
        favorito.avalia(8);
        favorito.avalia(9);

        System.out.println("Média de avaliações do filme: " +favorito.pegaMedia());

        pessoa.olaMundo();
        System.out.println("O dobro de 42 é: "+calculadora.calculaDobro(42));
        musica.exibeFicha();





    }

}