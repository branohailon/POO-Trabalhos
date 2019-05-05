package atividade04;

public class Tecnico extends Assistente {

    public double bonusSalario(){
        this.salario = this.salario + (this.salario * 0.1);
        return this.salario;
    }
}
