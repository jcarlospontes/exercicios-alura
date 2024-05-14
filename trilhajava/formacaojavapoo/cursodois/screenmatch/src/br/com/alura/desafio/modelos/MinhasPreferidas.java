package br.com.alura.desafio.modelos;

public class MinhasPreferidas {

    public void inclui(Audio audio){
        if(audio.getClassificacao()>=8){
            System.out.println(audio.getTitulo()+" é considerado sucesso.");
        } else{
            System.out.println(audio.getTitulo()+" é considerado bom.");
        }
    }
}
