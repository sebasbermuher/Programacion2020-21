package UNIDAD4.Tarea1.Ejercicio7;

public class sintonizador {
    private double frecuencia;
    public sintonizador() {
        frecuencia=80;
    }

    public sintonizador (double frecuencia) {
        frecuencia=rango(frecuencia);
        this.frecuencia=frecuencia;
    }

    public void up() {
        frecuencia+=0.5;
        frecuencia=rango(frecuencia);
    }

    public void down() {
        frecuencia-=0.5;
        frecuencia=rango(frecuencia);
    }

    public void display() {
        System.out.println("La frecuencia actual es de " + frecuencia);
    }

    public double rango(double rango) {
        if (rango<80) {
            rango=180;
        } else if (rango>180) {
            rango=80;
        }
        return rango;
    }
}
