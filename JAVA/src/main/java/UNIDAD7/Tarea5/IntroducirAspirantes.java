package UNIDAD7.Tarea5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class IntroducirAspirantes {
    HashMap<Integer, Aspirante> mapa_aspirantes = new HashMap<>();
    ArrayList<Integer> lista_ids = new ArrayList<>();
    static int num_aspirante = 0;

    public void introducir_aspirantes() {
        boolean seguir_introduciendo = true;
        Scanner teclado = new Scanner(System.in);
        while (seguir_introduciendo) {
            System.out.println("DNI: ");
            String dni = teclado.nextLine();

            System.out.println("Nombre: ");
            String nombre = teclado.nextLine();

            System.out.println("Telefono: ");
            String telefono = teclado.nextLine();

            InsertaAspirante(nombre, dni, telefono);

            System.out.println("¿Desea insertar otro aspirante? [si/no]");
            String opcion = teclado.nextLine();

            if (opcion.equalsIgnoreCase("no")) {
                seguir_introduciendo = false;
            }
        }
        guardarFicheros();
    }

    public void InsertaAspirante(String nombre, String DNI, String telefono) {
        mapa_aspirantes.put(num_aspirante, new Aspirante(nombre, DNI, telefono));
        lista_ids.add(num_aspirante);
        num_aspirante++;
    }

    public void guardarFicheros() {
        try (ObjectOutputStream fichero = new ObjectOutputStream(new FileOutputStream("JAVA/src/main/java/UNIDAD7/Tarea5/aspirantes.dat"))) {
            fichero.writeObject(mapa_aspirantes);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectOutputStream fichero = new ObjectOutputStream(new FileOutputStream("JAVA/src/main/java/UNIDAD7/Tarea5/ids_aspirantes.dat"))) {
            fichero.writeObject(lista_ids);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
