package ui;

import bl.Circulo;
import bl.Cuadrado;
import bl.Figura;

public class Main {
    public static void main(String[] args) {
        Figura figura1 = new Circulo(2,3,4);
        Figura figura2 = new Cuadrado(4,5,6);
        System.out.println(figura1.area());
        System.out.println(figura2.area());
    }
}
