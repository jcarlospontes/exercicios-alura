package trilhajava.formacaojavapoo.cursoum.classes;

public class ClasseDesafioDois {

    public void celciuisParaFahrenheint(int celcius){
        int conversao = (int) (celcius * 1.8) + 32;
        System.out.println("O valor de "+celcius+ " em Celcius para Fahrenheint é de: "+ conversao);
    }
    public void celciuisParaFahrenheint(Double celcius){
        int conversao = (int) (celcius * 1.8) + 32;
        System.out.println("O valor de "+celcius+ " em Celcius para Fahrenheint é de: "+ conversao);
    }

    public double retornaDolarParaReal(double dolar){
        return dolar*4.94;
    }

    public void imprimeMediaDoisDecimais(int a, int b){
        System.out.println("Media de dois decimais "+a+" e "+b+": "+ (double)(a+b)/2);
    }

    public double retornaPrecoPorQuantidade(double preco,int quantidade){
        return preco*quantidade;
    }

    public double retornaDesconto(double preco, double desconto){
        return preco*(desconto/100);
    }

}
