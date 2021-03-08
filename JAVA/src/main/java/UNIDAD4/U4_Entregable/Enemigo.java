package UNIDAD4.U4_Entregable;

public class Enemigo {
    String tipo_enemigo;
    int puntos_vida;
    int puntos_dano;

    public Enemigo (String tipo_enemigo, int puntos_vida, int puntos_dano){
        this.tipo_enemigo= tipo_enemigo;
        this.puntos_vida=puntos_vida;
      }

    public void mostrarInfo(){
        System.out.println(this.tipo_enemigo+" "+this.puntos_vida+" "+ this.puntos_dano);

    }
}
