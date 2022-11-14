package bl;

public class Circulo extends Figura{

    private double radio;

    public Circulo(double x, double y, double radio) {
        super(x, y);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return getRadio()* getRadio() * Math.PI;
    }
}
