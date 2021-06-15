package Refuerzo_Ex_Unidad4y5;

public class Vehiculo{
    private String matricula;
    private int carga_max;
    private Conductor conductor;

    public Vehiculo(String matricula, int carga_max, Conductor conductor) {
        this.matricula = matricula;
        this.carga_max = carga_max;
        this.conductor = conductor;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "matricula='" + matricula + '\'' +
                ", carga_max=" + carga_max +
                ", conductor=" + conductor +
                '}';
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getCarga_max() {
        return carga_max;
    }

    public void setCarga_max(int carga_max) {
        this.carga_max = carga_max;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }
}
