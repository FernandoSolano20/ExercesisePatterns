package bl;

public class Circulo extends Figura implements IDibujable {
    private double radio;

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

    @Override
    public String dibujar() {
        return "Dibujando circulo";
    }
}
