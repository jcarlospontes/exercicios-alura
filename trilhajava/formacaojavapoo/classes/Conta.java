package trilhajava.formacaojavapoo.classes;

import java.util.Scanner;

public class Conta {

    private String cliente;
    private String tipo;
    private double saldo;

    boolean operando = true;

    Scanner scan = new Scanner(System.in);

    private void recebeValor(){
        System.out.print("Digite o valor a receber: ");
        double valor = scan.nextDouble();
        if(valor > 0){
            this.saldo += valor;
        }
        else{
            System.out.println("Valor inválido!");
        }
    }

    private void transfereValor(){
        System.out.print("Digite o valor a transferir: ");
        double valor = scan.nextDouble();
        if(valor < this.saldo){
            this.saldo -= valor;
        }
        else{
            System.out.println("Saldo insuficiente!");
        }
    }

    private void consultaSaldo(){
        System.out.println("Seu saldo é de: R$ "+String.format("%.2f",this.saldo));
    }

    public void inicializaConta(){
        System.out.print("Digite o nome do cliente: ");
        this.cliente = scan.nextLine();
        System.out.print("Digite o tipo da conta: ");
        this.tipo = scan.nextLine();
        System.out.print("Digite o valor inicial da conta: ");
        this.saldo = scan.nextDouble();

        this.inicializaOperacoes();
    }

    private void inicializaOperacoes(){
        System.out.println("\n\n***********************");
        System.out.println("Dados iniciais do cliente:\n");
        System.out.println("Nome: "+ this.cliente);
        System.out.println("Tipo conta: "+ this.tipo);
        System.out.println("Saldo inicial: R$ "+String.format("%.2f",this.saldo));
        System.out.println("***********************\n\n");
        while(operando){
            System.out.println("Operações\n\n");
            System.out.println("1- Consultar saldo");
            System.out.println("2- Receber valor");
            System.out.println("3- Transferir valor");
            System.out.println("4- Sair\n\n");
            System.out.print("Digite a opção desejada: ");
            int escolha = scan.nextInt();

            switch (escolha){
                case 1:
                    this.consultaSaldo();
                    break;
                case 2:
                    this.recebeValor();
                    break;
                case 3:
                    this.transfereValor();
                    break;
                case 4:
                    this.operando = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        }
    }

}
