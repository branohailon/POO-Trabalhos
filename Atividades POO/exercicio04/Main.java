package exercicio04;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        SimulaBombaDagua bomba = new SimulaBombaDagua();
        boolean exec = true;
        while (exec) {
            System.out.println("1 - Ligar bomba");
            System.out.println("2 - Sair");
            int opcao = ler.nextInt();
            switch (opcao){
                case 1:
                    System.out.print("Insira o tempo em segundos para bomba ficar ligada:");
                    int second = ler.nextInt();
                    bomba.ligar(second);
                    break;
                case 2:
                    exec = false;
                    break;
                default:
                    System.out.println("invalido");
                    break;
            }
        }
    }
}
