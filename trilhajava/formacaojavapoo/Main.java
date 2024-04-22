package trilhajava.formacaojavapoo;

import trilhajava.formacaojavapoo.classes.*;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Estudos classestudos = new Estudos();
        Perfil classeperfil = new Perfil();
        Soma classesoma = new Soma();
        Subtracao classesubtracao = new Subtracao();
        ClasseDesafioDois classedesafiodois = new ClasseDesafioDois();
        ClasseDesafioTres classedesafiotres = new ClasseDesafioTres();
        Conta conta = new Conta();

        System.out.println("\n##Desafio 1");
        classestudos.imprimeAnotacoesEstudos();
        classeperfil.imprimeCumprimentoPersonalizado("João");
        classesoma.impromeSomaDezCinco();
        classesubtracao.impromeSubtracaoDezCinco();

        System.out.println("\n##Desafio 2");
        classedesafiodois.celciuisParaFahrenheint(12.2);
        classedesafiodois.imprimeMediaDoisDecimais(10,5);
        double variaveldouble = 21.99;
        int variavelint = (int) variaveldouble;
        System.out.println("Casting de double para int: "+variavelint);
        char letra = 'l';
        String palavra = "Variave";
        System.out.println("Mensagem concatenada de string e char: "+palavra+letra);
        double precoProduto = 12.90;
        int quantidade = 4;
        System.out.println("O preco total do produto custando "+precoProduto+" pela quantidade "+quantidade+" é: " + classedesafiodois.retornaPrecoPorQuantidade(precoProduto,quantidade));
        double valorEmDolares = 5.5;
        System.out.println("O valor convertido de "+valorEmDolares+" em reais é: "+classedesafiodois.retornaDolarParaReal(valorEmDolares));
        double precoOriginal = 49.99;
        double percentualDesconto = 5;
        double precoFinal = precoOriginal - classedesafiodois.retornaDesconto(precoOriginal,percentualDesconto);
        System.out.println("O valor do desconto de "+percentualDesconto+" para o preco de "+precoOriginal+" é de "+String.format("%.2f", classedesafiodois.retornaDesconto(precoOriginal,percentualDesconto))+" resultando em :"+String.format("%.2f",precoFinal));

        System.out.println("\n##Desafio 3");
        classedesafiotres.numeroAleatorio();
        classedesafiotres.numeroPositivoNegativo();
        classedesafiotres.comparaDoisNumeros();
        classedesafiotres.calculaArea();
        classedesafiotres.tabuadaNumero();
        classedesafiotres.parOuImpar();
        classedesafiotres.fatorialNumero();

        System.out.println("\n##Desafio 4");
        conta.inicializaConta();

    }
}