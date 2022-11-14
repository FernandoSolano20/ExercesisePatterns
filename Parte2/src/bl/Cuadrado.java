package bl;

public class Cuadrado implements IFigura {
    private double lado;

    public Cuadrado(double lado) {
        setLado(lado);
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        return getLado() * getLado();
    }
}
