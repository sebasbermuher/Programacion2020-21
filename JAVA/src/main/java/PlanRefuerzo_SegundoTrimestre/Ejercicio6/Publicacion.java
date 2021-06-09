package PlanRefuerzo_SegundoTrimestre.Ejercicio6;

public class Publicacion {
    private String cod_ISBN;
    private String titulo;
    private int year_publicacion;


    public Publicacion(String cod_ISBN, String titulo, int year_publicacion) {
        this.cod_ISBN = cod_ISBN;
        this.titulo = titulo;
        this.year_publicacion = year_publicacion;
    }




    public String getCod_ISBN() {
        return cod_ISBN;
    }

    public void setCod_ISBN(String cod_ISBN) {
        this.cod_ISBN = cod_ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getYear_publicacion() {
        return year_publicacion;
    }

    public void setYear_publicacion(int year_publicacion) {
        this.year_publicacion = year_publicacion;
    }
}
