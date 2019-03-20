package exercicio02;

public class Pessoa {

    public String nome;
    public int idade;
    public String sexo;
    public String x[];

    public Pessoa(String nome, int idade, String sexo, String[]x) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String[] getX() {
        return x;
    }

    public void setX(String[] x) {
        this.x = x;
    }

    public void showElement(int pos) { System.out.println(""); }

    public void showElementxs(){
        for (String el: x){
            System.out.println(el);
        }
    }

}
