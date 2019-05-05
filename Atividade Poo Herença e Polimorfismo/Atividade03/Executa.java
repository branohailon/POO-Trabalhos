package Atividade03;
import java.util.ArrayList;
import java.util.Scanner;

public class Executa {
    public static void main(String[] args) {
        ArrayList<FormaGeometrica> formas = new ArrayList<>();
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe a quantidade de formas para criar");
        int qntFormas = ler.nextInt();
        for (int i = 0; i < qntFormas; i++) {
            System.out.println("Selecione a forma");
            System.out.println("1 para circulo ");
            System.out.println("2 para quadrado ");
            System.out.println("3 para retangulo ");
            switch (ler.nextInt()) {
                case 1:
                    System.out.println("Insira o raio: ");
                    Circulo circulo = new Circulo(ler.nextDouble());
                    formas.add(circulo);
                    break;

                case 2:
                    System.out.println("Informe o lado do quadrado: ");
                    Quadrado quadrado = new Quadrado(ler.nextDouble());
                    formas.add(quadrado);
                    break;

                case 3:
                    System.out.println("Informe a base do retangulo: ");
                    double base = ler.nextDouble();
                    System.out.println("Informe a altura do retangulo: ");
                    double altura = ler.nextDouble();
                    Retangulo retangulo = new Retangulo(base, altura);
                    formas.add(retangulo);
                    break;
            }
        }
        for (FormaGeometrica forma : formas) {
            forma.showAttribute();
            System.out.println("\n\nFuncionando");
        }
    }
}
