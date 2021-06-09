package PlanRefuerzo_SegundoTrimestre.Ejercicio7;

public class Revista extends Publicacion {
    private int num;

    @Override
    public String toString() {
        return "Revista{" +
                "num=" + num +
                ", fechaCompra='" + fechaCompra + '\'' +
                '}';
    }

    public Revista(String fechaCompra, String cod_ISBN, String titulo, int year_publicacion, int num) {
        super(fechaCompra, cod_ISBN, titulo, year_publicacion);
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
