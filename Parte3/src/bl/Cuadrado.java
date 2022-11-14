package bl;

public class Cuadrado extends Figura implements IRotable, IDibujable {

    private double lado;

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

    @Override
    public String dibujar() {
        return "Dibuajndo cuadrado";
    }

    @Override
    public String rotar(double grados) {
        return "Rotando cuadrado a " + grados + " grados";
    }
}
