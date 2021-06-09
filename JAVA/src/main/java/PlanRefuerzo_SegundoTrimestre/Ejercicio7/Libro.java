package PlanRefuerzo_SegundoTrimestre.Ejercicio7;

public class Libro extends Publicacion implements Prestable {
    Boolean prestado;

    @Override
    public String toString() {
        return "Libro{" +
                "prestado=" + prestado +
                ", fechaCompra='" + fechaCompra + '\'' +
                '}';
    }

    public Libro(String fechaCompra, String cod_ISBN, String titulo, int year_publicacion, Boolean prestado) {
        super(fechaCompra, cod_ISBN, titulo, year_publicacion);
        this.prestado = false;
    }

    public Boolean getPrestado() {
        return prestado;
    }

    public void setPrestado(Boolean prestado) {
        this.prestado = prestado;
    }

    @Override
    public void presta() {
        System.out.println(getTitulo() + " : Este libro se acaba de prestar");
        setPrestado(true);
    }

    @Override
    public void devuelve() {
        System.out.println(getTitulo() + " : Este libro se ha devuelto ");
    }

    @Override
    public void esta_prestado() {
        System.out.println(getTitulo() + " : Este libro está prestado");
        setPrestado(true);
    }

}
