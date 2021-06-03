package Refuerzo_Ex_Eval_2.Ejercicio2;

import java.io.*;
import java.util.*;

public class Clinica {
    Map<Integer, Perro> mapa_perros = new TreeMap<>();

    public Map<Integer, Perro> getMapa_perros() {
        return mapa_perros;
    }

    public void setMapa_perros(Map<Integer, Perro> mapa_perros) {
        this.mapa_perros = mapa_perros;
    }

    public void anadir_perro(Perro perro) {
        getMapa_perros().put(perro.getPin(), perro);
        System.out.println("El perro ha sido añadido");
    }

    public void eliminarPerro(Perro perro) {
        getMapa_perros().remove(perro);
        System.out.println("El perro ha sido eliminado");
    }

    public void anadirConsulta(Perro p, Consultas c){
        if (!getMapa_perros().containsKey(p.getPin())){
            getMapa_perros().put(p.getPin(),p);
        }
        p.anadirconsulta(c);
        getMapa_perros().replace(p.getPin(),p);
    }


    public void listaPerrosMedicinas(Medicinas medicinas) {
        List<Perro> perros = new LinkedList<>();
        for (Map.Entry<Integer, Perro> entrada : mapa_perros.entrySet()) {
            Iterator<Consultas> it = entrada.getValue().getLista_consultas().iterator();
            while (it.hasNext()) {
                Consultas c = it.next();
                if (c.getMed().contains(medicinas)) {
                    perros.add(entrada.getValue());
                }
            }
        }
        System.out.println(perros.toString());
    }

    public void cargar() {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("JAVA/src/main/java/Refuerzo_Ex_Eval_2/Ejercicio2/fichero_perros.dat"));
            while (true) {
                setMapa_perros((Map<Integer, Perro>) in.readObject());
            }
        } catch (Exception e) {
            System.out.println("Los perros y sus datos han sido añadido al fichero.");
            System.out.println();
        }
    }

    public void guardar() {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("JAVA/src/main/java/Refuerzo_Ex_Eval_2/Ejercicio2/fichero_perros.dat"));
            out.writeObject(getMapa_perros());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

