package Refuerzo_Ex_Unidad4y5;

public class Prendas implements Devolver, Doblar{
    private double precio;
    private String nombre;
    private String cod_barras;
    private double peso;

    public Prendas(double precio, String nombre, String cod_barras, double peso) {
        this.precio = precio;
        this.nombre = nombre;
        this.cod_barras = cod_barras;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Prendas{" +
                "precio=" + precio +
                ", nombre='" + nombre + '\'' +
                ", cod_barras='" + cod_barras + '\'' +
                ", peso=" + peso +
                '}';
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCod_barras() {
        return cod_barras;
    }

    public void setCod_barras(String cod_barras) {
        this.cod_barras = cod_barras;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public void devolver(Prendas prendas) {
        System.out.println("Devolviendo la prenda con nombre " + nombre + " y precio " + precio);
    }


    @Override
    public void doblar(Prendas prendas) {
        System.out.println("Doblando la prenda con nombre " + nombre + " y precio " + precio);
    }
}
