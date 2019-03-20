package exercicio01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Insira o nome do aluno: ");
        String nome = scanner.next();
        System.out.printf("Insira a sala do aluno: ");
        String sala = scanner.next();
        float notas[] = {0, 0, 0, 0};
        System.out.printf("Insira idade do aluno: ");
        int id = scanner.nextInt();
        for (int i = 0; i < 4 ; i++) {
            System.out.println("Insira a nota do aluno");
            float nota = scanner.nextFloat();
            notas[i] = nota;
        }
        AlunoControle aluno = new AlunoControle(nome, id, sala, notas);
        System.out.println("A Media do aluno é: " + aluno.media());
    }

}
