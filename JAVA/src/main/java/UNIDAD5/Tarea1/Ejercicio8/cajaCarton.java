package UNIDAD5.Tarea1.Ejercicio8;

import UNIDAD5.Tarea1.Ejercicio7.caja;

public class cajaCarton extends caja {
    static double cartonTotal = 0;
    protected double area;

    int etiqueta;

    cajaCarton(double ancho, double alto, double fondo) {
        super(ancho, alto, fondo, cajaCarton.Unidades.CM);
        area = 2 * (ancho * alto + ancho * fondo + alto * fondo);
        cartonTotal += area;
    }

    double getArea() {
        return area;
    }

    public double getVolumen() {
        return volumen * 0.8;
    }

    @Override

    public String toString() {
        String result = "Carton total " + cartonTotal + " cm2\n";
        result += "Area: " + area + " cm2\n";
        result += super.toString();
        return result;
    }
}