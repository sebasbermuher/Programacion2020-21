package PlanRefuerzo_SegundoTrimestre.Ejercicio6;

public class Libro extends Publicacion implements Prestable {
    Boolean prestado;


    public Libro(String cod_ISBN, String titulo, int year_publicacion) {
        super(cod_ISBN, titulo, year_publicacion);
        this.prestado = false;
    }


    @Override
    public String toString() {
        return "Libro{" +
                "prestado=" + prestado +
                '}';
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
