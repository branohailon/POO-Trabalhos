package Atividade02;

public class Produto {
    private int cod_barra;
    private String nome;
    private double preco;

    public Produto (int cod_barra, String nome, double preco){
        this.cod_barra = cod_barra;
        this.nome = nome;
        this.preco = preco;
    }

    public String toString(){
        return "\nCodigo de Barra: " + this.cod_barra + "\nNome: " + this.nome + "\nPreco: " + this.preco;
    }

    public int GetCod_Barra(){
        return this.cod_barra;
    }
}
