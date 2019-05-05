package Atividade03;
public class Circulo implements FormaGeometrica {
    double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calculaArea() {
        return 3.14 * Math.pow(raio, 2);
    }

    @Override
    public double calculaPerimetro() {
        return 3.14 * 2 * raio;
    }

    public void showAttribute() {
        System.out.println("circulo");
        System.out.println("area: " + calculaArea());
        System.out.println("perimetro: " + calculaPerimetro());
    }
}
