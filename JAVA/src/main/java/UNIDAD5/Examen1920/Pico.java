package UNIDAD5.Examen1920;

public class Pico extends Herramientas implements Minar{
    private int grosor;

    public Pico(int grosor) {
        this.grosor = grosor;
    }

    public int getGrosor() {
        return grosor;
    }

    public void setGrosor(int grosor) {
        this.grosor = grosor;
    }

    @Override
    public int Hacer(String nombre) {
        return 0;
    }

    @Override
    public int Deshacer(String nombre) {
        return 0;
    }
}
