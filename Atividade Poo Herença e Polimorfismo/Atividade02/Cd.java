package Atividade02;

public class Cd extends Produto {
    private int nume_faixa;

    public Cd(int cod_barra, String nome, double preco, int nume_faixas) {
        super(cod_barra, nome, preco);
        this.nume_faixa = nume_faixas;
    }

    public String toString() {
        return super.toString() + "\n\nNumero de faixas: " + this.nume_faixa;
    }
}
