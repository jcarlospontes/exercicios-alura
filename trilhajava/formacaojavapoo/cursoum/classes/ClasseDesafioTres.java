package trilhajava.formacaojavapoo.cursoum.classes;

import java.util.Random;
import java.util.Scanner;

public class ClasseDesafioTres {
    Scanner scan = new Scanner(System.in);

    public void numeroAleatorio(){
        int numeroaleatorio = new Random().nextInt(100);
        int chances = 5;
        while (chances > 0){
            System.out.print("Digite o número para tentar acertar (tentativas: "+chances+"): ");
            int tentativa = scan.nextInt();
            if(tentativa == numeroaleatorio){
                System.out.println("Numero correto!");
                break;
            }
            else if(tentativa > numeroaleatorio && chances > 1){
                System.out.println("O número é menor!");
            }
            else if(tentativa < numeroaleatorio && chances > 1){
                System.out.println("O número é maior!");
            }
            else{
                System.out.println("Sem tentativas!");
                System.out.println("O numero era "+numeroaleatorio);
            }
            chances -= 1;
        }
    }

    public void numeroPositivoNegativo(){
        System.out.print("Digite um número: ");
        int positivonegativo = scan.nextInt();
        if(positivonegativo >= 0){
            System.out.print("Número positivo");
        }else{
            System.out.print("Numero negativo");
        }
    }

    public void comparaDoisNumeros(){
        System.out.print("Digite o primeiro número: ");
        int x = scan.nextInt();
        System.out.print("Digite o segundo número: ");
        int y = scan.nextInt();
        if(x > y){
            System.out.println("Os números são diferentes, o primeiro é maior que o segundo");
        }
        else if(x<y){
            System.out.println("Os números são diferentes, o primeiro é menor que o segundo");
        }
        else{
            System.out.println("Os números são iguais!");
        }
    }

    public void calculaArea(){
        System.out.println("1) Calcular área do quadrado");
        System.out.println("2) Calcular área do círculo");
        System.out.print("Digite sua escolha: ");
        int escolha = scan.nextInt();
        switch (escolha){
            case 1:
                System.out.print("Digite o tamanho do lado: ");
                double lado = scan.nextDouble();
                System.out.println("A área do quadrado é "+String.format("%.2f",lado*lado));
                break;
            case 2:
                System.out.print("Digite o tamanho do raio: ");
                double raio = scan.nextDouble();
                System.out.println("A área do círculo é "+String.format("%.2f",3.14*raio*raio));
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }

    public void tabuadaNumero(){
        System.out.print("Digite um número para visualizar sua tabuada: ");
        int numero = scan.nextInt();
        for(int x = 1; x<=10; x++){
            System.out.println(numero + " * " + x + " = " + numero*x);
        }
    }

    public void parOuImpar(){
        System.out.print("Digite um número para saber se é impar ou par: ");
        int numero = scan.nextInt();
        if( numero % 2 != 0){
            System.out.println("Numero impar!");
        }else{
            System.out.println("Numero par!");
        }
    }

    public int fatorialRec(int num){
        if(num == 1){
            return 1;
        }
        return num *= fatorialRec(num-1);
    }

    public void fatorialNumero(){
        System.out.print("Digite um número para saber o fatorial: ");
        int numero = scan.nextInt();
        System.out.println("O fatorial é: "+fatorialRec(numero));
    }
}
