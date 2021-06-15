package Recuperacion_Eval_2_Junio_2021.Ejercicio2;


import java.util.HashMap;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Concierto concierto = new Concierto(new HashMap<Estilo, Set<Artistas>>(),"Festival Music","La Cartuja");

        Managers managers1= new Managers("Manolito", "Perez Duarte", "661037169");
        Managers managers2= new Managers("Juanito", "Gutierrez Cabrera", "662047932");

        Artistas artista1 = new Artistas("Sebastian",1000,managers1,Estilo.POP);
        Artistas artista2 = new Artistas("Aitor",75,managers1,Estilo.INDIE);
        Artistas artista3 = new Artistas("Ana",900,managers1,Estilo.POP);
        Artistas artista4 = new Artistas("Jorge",600,managers1,Estilo.ROCK);
        Artistas artista5 = new Artistas("Paula",150,managers1,Estilo.ROCK);
        Artistas artista6 = new Artistas("Alejandro",750,managers1,Estilo.INDIE);


        concierto.altaArtista(Estilo.POP,artista1);
        concierto.altaArtista(Estilo.INDIE,artista2);
        concierto.altaArtista(Estilo.POP,artista3);
        concierto.altaArtista(Estilo.ROCK,artista4);
        concierto.altaArtista(Estilo.ROCK,artista5);
        concierto.altaArtista(Estilo.INDIE,artista6);

        System.out.println("||||| artistasByCache(POP) |||||");
        concierto.artistasByCache(Estilo.POP);
        System.out.println();
        System.out.println("||||| artistasByCache(INDIE) |||||");
        concierto.artistasByCache(Estilo.INDIE);
        System.out.println();
        System.out.println("||||| artistasByCache(ROCK) |||||");
        concierto.artistasByCache(Estilo.ROCK);
        System.out.println();


        concierto.guardarArtistas();

        //concierto.cargarArtistas();

    }
}
