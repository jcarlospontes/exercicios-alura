package trilhajava.formacaojavapoo;

import trilhajava.formacaojavapoo.classes.*;
public class Main {
    public static void main(String[] args) {

        System.out.println("Desafio 1\n");
        Estudos classestudos = new Estudos();
        Perfil classeperfil = new Perfil();
        Soma classesoma = new Soma();
        Subtracao classesubtracao = new Subtracao();
        ConversorTemperatura classeconversortemperatura = new ConversorTemperatura();

        classestudos.imprimeAnotacoesEstudos();
        classeperfil.imprimeCumprimentoPersonalizado("João");
        classesoma.impromeSomaDezCinco();
        classesubtracao.impromeSubtracaoDezCinco();

        System.out.println("Desafio 2\n");
        classeconversortemperatura.celciuisParaFahrenheint(12.2);


    }
}