package Atividade02;

public class Dvd extends Produto {
    private String duracao;

    public Dvd(int cod_barras, String nome, double preco, String duracao) {
        super(cod_barras, nome, preco);
        this.duracao = duracao;
    }

    public String toString(){
        return super.toString() + "\nDuracao: " + this.duracao;
    }
}
