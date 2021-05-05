/*
Utilizando de inicio el String en formato Json generado en el ejercicio anterior, componer el código necesario
para a partir de él, obtener un ArrayList de Futbolista con la información del String.
Obtener en un ArrayList independiente, la lista de dermacaciones posibles de "Ramos" e imprimirla por pantalla.
 */
package UNIDAD8.Tarea6;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class principal {
    public static void main(String[] args) {
        //
        Futbolista f1 = new Futbolista(1, "Casillas", new ArrayList<>(Arrays.asList("Portero")), "Real Madrid");
        Futbolista f2 = new Futbolista(15, "Ramos", new ArrayList<>(Arrays.asList("Lateral derecho", "Medio centro")), "Real Madrid");
        Futbolista f3 = new Futbolista(3, "Pique", new ArrayList<>(Arrays.asList("Central")), "FC Barcelona");
        Futbolista f4 = new Futbolista(15, "Puyol", new ArrayList<>(Arrays.asList("Central")), "FC Barcelona");
        Futbolista f5 = new Futbolista(11, "Capdevilla", new ArrayList<>(Arrays.asList("Lateral izquierdo")), "Villareal");
        Futbolista f6 = new Futbolista(14, "Xabi Alonso", new ArrayList<>(Arrays.asList("Defensa mediocampo")),  "Real Madrid");
        Futbolista f7 = new Futbolista(16, "Busquet", new ArrayList<>(Arrays.asList("Defensa Mediocampo")), "FC Barcelona");
        Futbolista f8 = new Futbolista(8, "Xavi Hernandez", new ArrayList<>(Arrays.asList("Extremo izquierdo", "Falso extremo")), "FC Barcelona");
        Futbolista f9 = new Futbolista(18, "Pedrito", new ArrayList<>(Arrays.asList("Extremo izquierdo", "Falso extremo")), "FC Barcelona");
        Futbolista f10 = new Futbolista(6, "Iniesta", new ArrayList<>(Arrays.asList("Extremo derecho", "Mediocampo")), "FC Barcelona");
        Futbolista f11 = new Futbolista(7, "Villa", new ArrayList<>(Arrays.asList("Delantero centro")), "FC Barcelona");

        Gson gson = new Gson();


        ArrayList<Futbolista> detalles2 = new ArrayList<>();
        detalles2.add(f1);
        detalles2.add(f2);
        detalles2.add(f3);
        detalles2.add(f4);
        detalles2.add(f5);
        detalles2.add(f6);
        detalles2.add(f7);
        detalles2.add(f8);
        detalles2.add(f9);
        detalles2.add(f10);
        detalles2.add(f11);


        String jsonString;

        System.out.println(jsonString = gson.toJson(detalles2));

        Type typelist =new TypeToken<ArrayList<Futbolista>>(){}.getType();

        ArrayList<Futbolista> enviar = gson.fromJson(jsonString,typelist);
        ArrayList<String> ramos = new ArrayList<>();

        Iterator it = enviar.iterator();

        while (it.hasNext()){
            Futbolista jugador = (Futbolista) it.next();
            if (jugador.getNombre().equals("Ramos")){
                Iterator it2 = jugador.getPosiciones().iterator();
                while (it2.hasNext()){
                    ramos.add((String) it2.next());
                }
            }
        }
        System.out.println();
        System.out.println("Las posibles posiciones de Ramos son: " + ramos);

    }
}
