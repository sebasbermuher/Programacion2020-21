package Refuerzo_Ex_Eval_2.Ejercicio2;

import java.util.HashSet;
import java.util.Set;

public class Consultas {
    private String fecha;
    private String diag;
    Set<Medicinas> med = new HashSet<>();


    public Consultas(String fecha, String diag) {
        this.fecha = fecha;
        this.diag = diag;
    }

    @Override
    public String toString() {
        return "Consultas{" +
                "fecha='" + fecha + '\'' +
                ", diag='" + diag + '\'' +
                ", med=" + med +
                '}';
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDiag() {
        return diag;
    }

    public void setDiag(String diag) {
        this.diag = diag;
    }

    public Set<Medicinas> getMed() {
        return med;
    }

    public void setMed(Set<Medicinas> med) {
        this.med = med;
    }

    public void eliminarMedicina(Medicinas medicinas) {
        getMed().remove(medicinas);
        System.out.println("La medicina ha sido eliminada");
    }


    public void anadirMedicina(Medicinas medicinas) {
        getMed().add(medicinas);
        System.out.println("La medicina ha sido añadida");
    }



}

