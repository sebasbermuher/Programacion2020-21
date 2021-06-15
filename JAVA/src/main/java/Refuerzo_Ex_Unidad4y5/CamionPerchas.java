package Refuerzo_Ex_Unidad4y5;

import java.util.Arrays;

public class CamionPerchas {
    private String matricula;
    private int carga_max;
    private Conductor conductor;
    private PrendasColgadas[] prendas_colgadas;
    private int num_prendas;

    public CamionPerchas(String matricula, int carga_max, Conductor conductor) {
        this.matricula = matricula;
        this.carga_max = carga_max;
        this.conductor = conductor;
        this.prendas_colgadas = new PrendasColgadas[0];
        this.num_prendas = 0;
    }

    @Override
    public String toString() {
        return "CamionPerchas{" +
                "matricula='" + matricula + '\'' +
                ", carga_max=" + carga_max +
                ", conductor=" + conductor +
                ", prendas_colgadas=" + Arrays.toString(prendas_colgadas) +
                ", num_prendas=" + num_prendas +
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

    public PrendasColgadas[] getPrendas_colgadas() {
        return prendas_colgadas;
    }

    public void setPrendas_colgadas(PrendasColgadas[] prendas_colgadas) {
        this.prendas_colgadas = prendas_colgadas;
    }

    public int getNum_prendas() {
        return num_prendas;
    }

    public void setNum_prendas(int num_prendas) {
        this.num_prendas = num_prendas;
    }

    public void descargar(){
        System.out.println("Descargando camionPerchas --> " + Arrays.toString(prendas_colgadas));
    }

    public void agregarPrendaColgada (PrendasColgadas pc){
        prendas_colgadas= Arrays.copyOf(prendas_colgadas, prendas_colgadas.length+1);
        prendas_colgadas[prendas_colgadas.length-1]= pc;
        num_prendas++;
    }

    public void eliminarPrendaColgada(PrendasColgadas pc){
        PrendasColgadas[] array = new PrendasColgadas[0];
        for (int i = 0; i < prendas_colgadas.length; i++) {
            if(prendas_colgadas[i]!=pc){
                array= Arrays.copyOf(array, array.length+1);
                array[array.length-1]=array[i];
            }
        }
        prendas_colgadas=array;
    }



}
