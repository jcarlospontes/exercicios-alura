package trilhajava.formacaojavapoo.classes;

public class ConversorTemperatura {
    public void celciuisParaFahrenheint(int celcius){
        int conversao = (int) (celcius * 1.8) + 32;
        System.out.println("O valor de "+celcius+ " em Celcius para Fahrenheint é de: "+ conversao);
    }
    public void celciuisParaFahrenheint(Double celcius){
        int conversao = (int) (celcius * 1.8) + 32;
        System.out.println("O valor de "+celcius+ " em Celcius para Fahrenheint é de: "+ conversao);
    }
}
