package Refuerzo_Ex_Unidad4y5;

public class PrendasColgadas implements Colgar {
    private double precio;
    private String nombre;
    private String cod_barras;
    private double peso;
    private double altura;

    public PrendasColgadas(double precio, String nombre, String cod_barras, double peso, double altura) {
        this.precio = precio;
        this.nombre = nombre;
        this.cod_barras = cod_barras;
        this.peso = peso;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "PrendasColgadas{" +
                "precio=" + precio +
                ", nombre='" + nombre + '\'' +
                ", cod_barras='" + cod_barras + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
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

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


    @Override
    public void colgar(PrendasColgadas pc) {
        System.out.println("Colgando la prenda con nombre " + nombre + " y con codigo de barras " + cod_barras);
    }
}
