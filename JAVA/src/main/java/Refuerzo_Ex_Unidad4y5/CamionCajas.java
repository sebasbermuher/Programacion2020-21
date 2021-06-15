package Refuerzo_Ex_Unidad4y5;

import java.util.Arrays;

public class CamionCajas implements Comparable<CamionCajas> {
    private String matricula;
    private int carga_max;
    private Conductor conductor;
    private Cajas[] cajas;

    public CamionCajas(String matricula, int carga_max, Conductor conductor) {
        this.matricula = matricula;
        this.carga_max = carga_max;
        this.conductor = conductor;
        this.cajas = new Cajas[0];
    }

    @Override
    public String toString() {
        return "CamionCajas{" +
                "matricula='" + matricula + '\'' +
                ", carga_max=" + carga_max +
                ", conductor=" + conductor +
                ", cajas=" + Arrays.toString(cajas) +
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

    public Cajas[] getCajas() {
        return cajas;
    }

    public void setCajas(Cajas[] cajas) {
        this.cajas = cajas;
    }

    public void agregarCaja(Cajas c){
        cajas= Arrays.copyOf(cajas, cajas.length+1);
        cajas[cajas.length-1]= c;
    }

    public void eliminaCaja(Cajas c){
        Cajas[] guardador = new Cajas[0];
        for (int i = 0; i < cajas.length; i++) {
            if(cajas[i]!=c){
                guardador= Arrays.copyOf(guardador, guardador.length+1);
                guardador[guardador.length-1]=cajas[i];
            }
        }
        cajas=guardador;
    }

    public void descargar(){
        System.out.println("Descargando camionCajas -> " + Arrays.toString(cajas));
    }

    @Override
    public int compareTo(CamionCajas o) {
        return o.carga_max-this.carga_max;
    }


    public void mostrarComparable(){
        Arrays.sort(cajas);
        System.out.println(cajas);
    }

}
