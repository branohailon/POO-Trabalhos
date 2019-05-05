package Atividade02;

public class Livro extends Produto {
    private String autor;

    public Livro(int cod_barras, String nome, double preco, String autor) {
        super(cod_barras, nome, preco);
        this.autor = autor;
    }

    public String toString(){
        return super.toString() + "\nAutor: " + this.autor;
    }
}
