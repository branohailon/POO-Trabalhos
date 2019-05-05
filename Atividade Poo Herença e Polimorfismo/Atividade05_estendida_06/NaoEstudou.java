package Atividade05_estendida_06;

public class NaoEstudou {
    private String codigo;
    private String nome;
    private double rendaBasica = 1000;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
        System.out.println("Teste setCodigo");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
        System.out.println("teste setNome");
    }

    public double getRendaBasica() {
        return rendaBasica;
    }

    public void setRendaBasica(double rendaBasica) {
        this.rendaBasica = rendaBasica;
        System.out.println("teste setRendaBasica");
    }
}
