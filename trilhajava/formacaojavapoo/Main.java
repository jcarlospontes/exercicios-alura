package trilhajava.formacaojavapoo;

import trilhajava.formacaojavapoo.classes.*;
public class Main {
    public static void main(String[] args) {

        Estudos classestudos = new Estudos();
        Perfil classeperfil = new Perfil();
        Soma classesoma = new Soma();
        Subtracao classesubtracao = new Subtracao();

        classestudos.imprimeAnotacoesEstudos();
        classeperfil.imprimeCumprimentoPersonalizado("João");
        classesoma.impromeSomaDezCinco();
        classesubtracao.impromeSubtracaoDezCinco();
    }
}