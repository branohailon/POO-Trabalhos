package Atividade03;
public class Quadrado extends Quadrilatero {
    double lado;

    public Quadrado(double lado) {
        super(lado, lado, lado, lado);
        this.lado = lado;
    }

    @Override
    public double calculaArea() {
        return Math.pow(lado, 2);
    }

    public void showAttribute() {
        System.out.println("O quadrado");
        System.out.println("area: " + this.calculaArea());
        System.out.println("perimetro: " + super.calculaPerimetro());
    }
}
