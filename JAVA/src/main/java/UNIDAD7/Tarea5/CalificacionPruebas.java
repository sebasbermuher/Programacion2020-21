package UNIDAD7.Tarea5;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CalificacionPruebas {
    private final int NUM_PRUEBAS = 3;
    ArrayList<Integer> lista_ids = new ArrayList<>();
    HashMap<Integer, ArrayList<Double>> mapa_notas = new HashMap<>();

    public CalificacionPruebas() {
        cargar_ids();
    }

    private void cargar_ids() {
        try (ObjectInputStream fichero = new ObjectInputStream(new FileInputStream("JAVA/src/main/java/UNIDAD7/Tarea5/ids_aspirantes.dat"))) {
            lista_ids = (ArrayList<Integer>) fichero.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void poner_notas() {
        Scanner teclado = new Scanner(System.in);

        for (Integer id : lista_ids ) {
            ArrayList<Double> notas = new ArrayList<>();
            for (int i = 0; i < NUM_PRUEBAS; i++) {
                System.out.println("Introduzca la nota de la prueba número " + i +" del aspirante número " + id);
                Double nota = teclado.nextDouble();
                teclado.nextLine();
                notas.add(nota);
            }
            mapa_notas.put(id, notas);
        }
        guardar_notas();
    }

    private void guardar_notas() {
        try (ObjectOutputStream fichero = new ObjectOutputStream(new FileOutputStream("JAVA/src/main/java/UNIDAD7/Tarea5/calificaciones.dat"))) {
            fichero.writeObject(mapa_notas);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}