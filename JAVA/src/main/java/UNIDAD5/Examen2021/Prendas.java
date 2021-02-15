package UNIDAD5.Examen2021;

public class Prendas {
    public double precio;
    public String nombre;
    public long cod_barras;
    public double peso;

    public Prendas(double precio, String nombre, long cod_barras, double peso) {
        this.precio = precio;
        this.nombre = nombre;
        this.cod_barras = cod_barras;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Precio: "+ precio + "\n"+
                "Nombre: " + nombre + "\n" +
                "Codigo de barras: " + cod_barras + "\n" +
                "Peso" + peso;
    }
}
