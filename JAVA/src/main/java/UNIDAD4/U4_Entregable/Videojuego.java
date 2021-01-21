package UNIDAD4.U4_Entregable;

public class Videojuego {
    Personaje personaje1;
    Escenario escena1;
    Enemigo enemigo1;

    Videojuego (Personaje personaje1, Escenario escena1, Enemigo enemigo1){
        this.personaje1=personaje1;
        this.escena1=escena1;
        this.enemigo1=enemigo1;
    }
    public void mostrarInfo(){
        System.out.println(this.personaje1+" "+this.escena1+" "+this.enemigo1);
    }
}