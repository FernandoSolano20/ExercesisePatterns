package ui;

import bl.Circulo;
import bl.Cuadrado;
import bl.IFigura;

public class Main {
    public static void main(String[] args) {
        IFigura figura1 = new Cuadrado(5);
        IFigura figura2 = new Circulo(6);
        System.out.println(figura1.area());
        System.out.println(figura2.area());
    }
}
