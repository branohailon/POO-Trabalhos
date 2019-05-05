package Atividade01;

public class Robo implements Controle {
    @Override
    public void andar() {
        System.out.println("Esta Andando");
    }

    @Override
    public void virar() {
        System.out.println("Esta Virando");
    }

    @Override
    public void falar() {
        System.out.println("Esta Falando");
    }
}
