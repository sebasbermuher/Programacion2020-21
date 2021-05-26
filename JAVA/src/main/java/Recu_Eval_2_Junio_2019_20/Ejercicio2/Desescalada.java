package Recu_Eval_2_Junio_2019_20.Ejercicio2;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class Desescalada {
    // Atributos.
    private Map<String, Enum_Fases> distrito_sanitario;

    // Constructor.
    public Desescalada() {
        setTerritorios();
    }

    public void avanzarDesescalada(String nombre_territorio, Enum_Fases fase) {
        if (distrito_sanitario.containsKey(nombre_territorio)) {
            distrito_sanitario.put(nombre_territorio, fase);
            System.out.println("El territorio " + nombre_territorio + " ha sido actualizado a " + fase);
        } else {
            distrito_sanitario.put(nombre_territorio, fase);
            System.out.println("El territorio " + nombre_territorio + " ha sido creado con " + fase);
        }
    }

    public void nuevaNormalidad(String nombre_territorio) {
        // Territorio territorio = new Territorio(nombre_territorio);
        if (distrito_sanitario.containsKey(nombre_territorio)) {
            distrito_sanitario.remove(nombre_territorio);
            System.out.println("El territorio " + nombre_territorio + " ha pasado a Nueva Normalidad.");
        } else {
            System.out.println(
                    "Se ha producido un error: El territorio "
                            + nombre_territorio
                            + " no se encuentra registrado.");
        }
    }

    public void mostrarFasesTerritorios() {

        for (Enum_Fases fases : Enum_Fases.values()) {
            TreeSet<String> terris =
                    new TreeSet<>(
                            new Comparator<String>() {
                                @Override
                                public int compare(String o1, String o2) {
                                    return o1.compareTo(o2);
                                }
                            });

            // Set<Map.Entry<String, Enum_Fases>> e1 = distrito_sanitario.entrySet();
            // System.out.println(e1);
            for (Map.Entry<String, Enum_Fases> entrada : distrito_sanitario.entrySet()) {
                if (entrada.getValue().equals(fases)) {
                    terris.add(entrada.getKey());
                }
            }
            System.out.println("Esta es la fase " + fases);
            System.out.println(terris);
        }
    }

    @Override
    public String toString() {
        return "Desescalada{" + distrito_sanitario + '}';
    }

    // Set and Get.
    public Map<String, Enum_Fases> getDistrito_sanitario() {
        return distrito_sanitario;
    }

    public void setTerritorios() {
        this.distrito_sanitario = new HashMap<>();
    }
}