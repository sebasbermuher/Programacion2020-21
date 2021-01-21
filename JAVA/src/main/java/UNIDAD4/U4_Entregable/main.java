package UNIDAD4.U4_Entregable;

public class main {
    public static void main(String[] args) {
        Personaje personaje1 = new Personaje("Sonic",8.5, 7, 9);
        Escenario escena1 = new Escenario(1024, 320 , 4,5);
        Enemigo enemigo1 = new Enemigo("Chopper", 10, 3);
        Videojuego game1= new Videojuego(personaje1, escena1, enemigo1);

        game1.mostrarInfo();
        System.out.println();

    }
}