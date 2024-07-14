package br.com.alura.banheiro;

public class Banheiro {

    private boolean ehSujo = true;

    public void fazNum1(){
        String nome = Thread.currentThread().getName();
        System.out.println(nome + "Batendo na porta");
        synchronized (this) {
            System.out.println(nome + " entrou no banheiro");

            while (ehSujo) {
                esperaFora(nome);
            }
            
            System.out.println(nome + " faz açao 1 rapida");
            dorme(5);
            ehSujo = true;
            System.out.println(nome + " descarga");
            System.out.println(nome + " lava mao");
            System.out.println(nome + " sai do banheiro");

            ehSujo = true;
        }
    }

    public void fazNum2(){
        String nome = Thread.currentThread().getName();
        System.out.println(nome + "Batendo na porta");
        synchronized (this) {
            System.out.println(nome + " entrou no banheiro");

            while (ehSujo) {
                esperaFora(nome);
            }

            System.out.println(nome + " faz açao 2 demorada");
            dorme(10);
            ehSujo = true;
            System.out.println(nome + " descarga");
            System.out.println(nome + " lava mao");
            System.out.println(nome + " sai do banheiro");
        }
    }

    public void limpaBanheiro() {
        String nome = Thread.currentThread().getName();
        System.out.println(nome + " Batendo na porta");
        synchronized (this) {
            System.out.println(nome + " entrou no banheiro");

            if (!ehSujo) {
                System.out.println(nome + " banheiro limpo");
                return;
            }

            System.out.println(nome + " limpando banheiro");

            dorme(13);

            this.ehSujo = false;

            System.out.println(nome + " saindo do banheiro");

            this.notifyAll();
        }
    }

    private void esperaFora(String nome) {
        System.out.println(nome + " banheiro sujo, esperando banheiro ficar limpo");
        try {
            this.wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private void dorme(long tempoSeg){
        try {
            Thread.sleep(tempoSeg*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
