package bl;

public class Cuadrado extends Figura {

    private double lado;

    public Cuadrado(double x, double y, double lado) {
        super(x, y);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    @Override
    public double area() {
        return getLado()*getLado();
    }
}
