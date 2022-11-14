package bl;

public class Circulo implements IFigura{
    private double radio;

    public Circulo(double radio) {
        setRadio(radio);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return getRadio() * getRadio() * Math.PI;
    }
}
