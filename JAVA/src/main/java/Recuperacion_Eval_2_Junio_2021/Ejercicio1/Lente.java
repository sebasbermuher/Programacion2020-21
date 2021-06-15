package Recuperacion_Eval_2_Junio_2021.Ejercicio1;

public class Lente {
    private Problema_Visual problema_visual;
    private double grado_correcion;

    public Lente(Problema_Visual problema_visual, double grado_correcion) {
        this.problema_visual = problema_visual;
        this.grado_correcion = grado_correcion;
    }

    @Override
    public String toString() {
        return "Lente{" +
                "problema_visual=" + problema_visual +
                ", grado_correcion=" + grado_correcion +
                '}';
    }

    public Problema_Visual getProblema_visual() {
        return problema_visual;
    }

    public void setProblema_visual(Problema_Visual problema_visual) {
        this.problema_visual = problema_visual;
    }

    public double getGrado_correcion() {
        return grado_correcion;
    }

    public void setGrado_correcion(double grado_correcion) {
        this.grado_correcion = grado_correcion;
    }
}
