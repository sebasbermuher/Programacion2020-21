package UNIDAD4.Tarea1.Ejercicio9;

public class locomotora {
    String matricula;
    int potencia;
    int anoFabricacion;
    mecanico mecanico;

    public locomotora (String matricula, int potencia, int anoFabricacion, mecanico mecanico){
        this.matricula=matricula;
        this.potencia=potencia;
        this.anoFabricacion=anoFabricacion;
        this.mecanico=mecanico;
    }
    public void mostrarInfo(){
        System.out.println(this.matricula+" "+this.potencia+" "+this.anoFabricacion);
        mecanico.mostrarInfo();
    }
}
