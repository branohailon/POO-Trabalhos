package exercicio02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        String x[] = {"A1","A2","A3","A4","A5","A6","A7","A8","A9","A10"};
        Pessoa pessoa = new Pessoa("Brano", 23, "M", x);
        boolean exec = true;
        while (exec){
            System.out.println("1 - Visualizar elemento desejado de X");
            System.out.println("2 - Visualizar todos elementos de X");
            System.out.println("3 - Sair");
            int opcoes = ler.nextInt();
            switch (opcoes) {
                case 3:
                    exec = false;
                    break;
                case 1:
                    System.out.print("Insira a Posição dos elementos de 1 a 10: ");
                    int el = ler.nextInt();
                    if (el > 10 || el < 1) {
                        System.out.println("Elemento invalido!");
                    } else {
                        pessoa.showElementxs();
                    }
                    break;
                case 2:
                    pessoa.showElementxs();
                    break;
                default:
                    System.out.println("invalido");
                    break;
            }
        }

    }


}
