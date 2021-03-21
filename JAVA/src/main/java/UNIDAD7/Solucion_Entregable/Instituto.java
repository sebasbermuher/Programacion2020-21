package UNIDAD7.Solucion_Entregable;

import java.io.*;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Instituto {
    Map<Unidad, TreeSet<Alumno>> unidades = new TreeMap<>();

    public void mostrarTodosAlumnosOrdenados() {
        // Creo un TreeSet vacío que ordenará por apellido
        TreeSet<Alumno> alumnos_ordenados = new TreeSet<>(new ComparaAlumnosPorApellido());
        for (TreeSet<Alumno> alumnos_unidad : unidades.values()) {
            // Voy añadiendo todos los TreeSet de alumnos de cada una de las unidades
            alumnos_ordenados.addAll(alumnos_unidad);
        }
        System.out.println(alumnos_ordenados);
    }

    public Unidad obtenerUnidadAlumno(int id_alumno) {
        // Primero un tipo de unidad "vacía"
        Unidad unidad = new Unidad("");
        // Buscamos la unidad del alumno con id_alumno
        for (TreeSet<Alumno> alumnos_unidad : unidades.values()) {
            for (Alumno alumno : alumnos_unidad) {
                if (alumno.getId() == id_alumno) {
                    unidad = alumno.getUnidad();
                    break;
                }
            }
        }
        return unidad;
    }

    public void mostrarAlumnosUnidad(String unidad) {
        // Al crear un TreeSet, el orden por defecto nos ordena por DNI automáticamente
        TreeSet<Alumno> alumnos = unidades.get(new Unidad(unidad));
        System.out.println(alumnos);
    }

    public void addAlumnoUnidad(Alumno alumno, String unidad) {
        // Nos creamos una unidad con el String que nos pasan.
        Unidad unidad_a_buscar = new Unidad(unidad);
        // Si encontramos la unidad...
        if (unidades.containsKey(unidad_a_buscar)) {
            for (Map.Entry<Unidad, TreeSet<Alumno>> entrada : unidades.entrySet()) {
                if (entrada.getKey().getNombre().equals(unidad)) {
                    // ... añadimos el alumno...
                    entrada.getValue().add(alumno);
                    System.out.println("Alumno añadido: " + alumno.toString());
                }
            }
        } else { // ... y si no, creamos un TreeSet nuevo, y lo añadimos al mapa
            TreeSet<Alumno> alumnos = new TreeSet<>();
            alumnos.add(alumno);
            unidades.put(unidad_a_buscar, alumnos);
            System.out.println("adding: " + unidad_a_buscar + " - " + alumno);
        }
    }

    public void cargarAlumnos() {
        try (ObjectInputStream in =
                     new ObjectInputStream(new FileInputStream("ficheros/alumnos.dat"))) {
            // Esto sobra, pero borro por si acaso para añadir la info que cargo del fichero.
            unidades.clear();
            while (true) {
                unidades = (Map<Unidad, TreeSet<Alumno>>) in.readObject();
            }
        } catch (EOFException e) {
            System.out.println("Fin de fichero");
        } catch (IOException e) {
            System.out.println("Error en el fichero: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Error al leer datos del fichero: " + e.getMessage());
        }
    }

    public void guardarAlumnos() {
        try (ObjectOutputStream out =
                     new ObjectOutputStream(new FileOutputStream("ficheros/alumnos.dat"))) {
            out.writeObject(unidades);
        } catch (IOException e) {
            System.out.println("Error al guardar el fichero: " + e.getMessage());
        }
    }
}
