package atividade04;

public class Administrativo extends Assistente {
    String turno;

    public void adicionalNoturno(double adicional){
        if(turno == "noturno" || turno == "Noturno"){
            this.salario = this.salario+adicional;
        }
    }
}