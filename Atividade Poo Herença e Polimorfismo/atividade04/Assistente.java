package atividade04;

public class Assistente extends Funcionario{

    public void getMatricula(int matricula){
        this.matricula = matricula;
    }

    public void exibeDados(){
        System.out.println("Nome: " + nome  + " CPF: " + cpf + " salario: " + salario + " numero de matricula: " + this.matricula);
    }
}
