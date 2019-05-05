package Atividade03;
public class Retangulo extends Quadrilatero {
    double base;
    double altura;

    public Retangulo(double base, double altura) {
        super(base, base, altura, altura);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calculaArea() {
        return base * altura;
    }

    public void showAttribute() {
        System.out.println("O retangulo");
        System.out.println("area: " + this.calculaArea());
        System.out.println("perimetro: " + super.calculaPerimetro());
    }
}
