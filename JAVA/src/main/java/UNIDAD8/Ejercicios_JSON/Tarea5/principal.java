/*
Se desea generar una cadena en formato json que contenga la alineación de la selección española que ganó el
mundial de Fútbol.
Se tiene por tanto, que implementar una clase Futbolista, que contenga un entero para el dorsal, un String
para el nombre y una lista de dermacaciones posibles en las que puede jugar. También se tendrá un atributo
(un String) para el equipo del que procede.
Los datos son los siguientes:
1, "Casillas", ["Portero"], "Real Madrid"
15, "Ramos", ["Lateral derecho", "Medio centro"], "Real Madrid"
3, "Pique", ["Central"], "FC Barcelona"
5, "Puyol", ["Central"], "FC Barcelona"
11, "Capdevila", ["Lateral izquierdo"] "Villareal"
14, "Xabi Alonso", ["Defensa mediocampo", "Mediocampo"], "Real Madrid"
16, "Busquets", ["Defensa mediocampo"], "FC Barcelona"
8, "Xavi Hernandez", ["Mediocampo"], "FC Barcelona"
18, "Pedrito", ["Extremo izquierdo", "Falso extremo"], "FC Barcelona
6, "Iniesta", ["Extremo derecho", "Mediocampo"], "FC Barcelona"
7, "Villa", ["Delantero centro"], "FC Barcelona"
En el fichero principal por tanto, se debe crear un ArrayList de Futbolistas con la información anterior,
y a partir de él y utilizando Gson generar una única String en formato Json que se deberá mostrar por pantalla.
 */
package UNIDAD8.Ejercicios_JSON.Tarea5;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Arrays;

public class principal {
    public static void main(String[] args) {
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

        System.out.println(gson.toJson(detalles2));



    }
}
