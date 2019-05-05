package Atividade03;
public abstract class Quadrilatero implements FormaGeometrica {
    double [] lados = new double[4];

    Quadrilatero(double lado1, double lado2, double lado3, double lado4) {
        this.lados[0] = lado1;
        this.lados[1] = lado2;
        this.lados[2] = lado3;
        this.lados[3] = lado4;
    }

    @Override
    public double calculaPerimetro() {
        double area = 0;
        for (double lado : this.lados) {
            area += lado;
        }
        return area;
    }
}
