package atividade04;

public class Funcionario {
    String nome;
    String cpf;
    int matricula;
    double salario;

    public void exibeDados(){
        System.out.println("Nome: " + nome  + " CPF: " + cpf + " salario: " + salario + " numero de matricula: " + matricula);
    }
}
