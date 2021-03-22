package UNIDAD7.U6U7_Examen;

import java.io.*;
import java.util.*;

public class Maraton {
    private int contador = 0;
    Map<Integer, Atleta> lista_atleta;

    public Maraton() {
        lista_atleta = new HashMap<>();
        contador = 0;
    }

    public int getNum() {
        return contador;
    }

    public void setNum(int num) {
        this.contador = num;
    }

    public Map<Integer, Atleta> getLista_atleta() {
        return lista_atleta;
    }

    public void setLista_atleta(Map<Integer, Atleta> lista_atleta) {
        this.lista_atleta = lista_atleta;
    }

    // 1 - metodo cargarAtletas
    public void cargarAtletas() {
        try {
            ObjectInputStream txt_fichero = new ObjectInputStream(new FileInputStream("JAVA/src/main/java/UNIDAD7/U6U7_Examen/maraton.dat"));
            while (true) {
                Atleta atle = (Atleta) txt_fichero.readObject();
                inscribirAtleta(atle);
                System.out.println(atle);
            }
        } catch (Exception e) {
            System.out.println("Los atletas inscrito a la competicion han sido almacenado en el fichero maraton.dat ");
            System.out.println();
        }
    }

    // 2 -  metodo guardarAtletas
    public void guardarAtletas() {
        try {
            ObjectOutputStream txt_atleta = new ObjectOutputStream(new FileOutputStream("JAVA/src/main/java/UNIDAD7/U6U7_Examen/maraton.dat"));
            Collection<Atleta> c = lista_atleta.values();
            Iterator it = c.iterator();

            while (it.hasNext()){
                Atleta atle = (Atleta) it.next();
                txt_atleta.writeObject(atle);
            }
            txt_atleta.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    // 3 - metodo incribirAtleta
    public void inscribirAtleta(Atleta atleta) {
        contador+=1;
        if (!lista_atleta.containsValue(atleta)) {
            lista_atleta.put(contador,atleta);
        }else {
            System.out.println("Este atleta ya está inscrito");
        }
    }

    // 5 - metodo borrarAtleta
    public boolean borrarAtleta(int num) {
        if (!lista_atleta.containsKey(num)) {
            System.out.println("El dorsal introducido no participa en este maraton");
            return false;
        }else {
            lista_atleta.remove(num);
            return true;
        }
    }

    // 6 -  metodo mostrarListaFinisher
    public void mostrarListaFinisher() {
        Collection<Atleta> c = lista_atleta.values();
        Iterator it = c.iterator();
        while (it.hasNext()){
            Atleta atle = (Atleta) it.next();
            if (atle.isFinisher()) {
                System.out.println(atle);
            }
        }
    }

    // 7 - metodo mostrarListaCategoria
    public void mostrarLIstaCategoria(Categoria cate) {
        Collection<Atleta> p = lista_atleta.values();
        int count = 0;
        Iterator it = p.iterator();

        while (it.hasNext()) {
            Atleta atle = (Atleta) it.next();

            if (atle.getCategoria().equals(cate)) {
                System.out.println(atle);
                count++;
            }
            if (count == 0) {
                System.out.println("De esa categoria no hay ningun atleta");
            }
        }
    }

    // 8 - metodo participantePorPais
    public void participantePorPais(String pais) {
        Collection<Atleta> conjunto = lista_atleta.values();
        int basura = 0;
        Iterator it = conjunto.iterator();
        while (it.hasNext()) {
            Atleta atle = (Atleta) it.next();
            if (atle.getPais().equals(pais)) {
                basura++;
            }
        }
        System.out.println(basura);
        if (basura == 0) {
            System.out.println("No hay participante inscrito de " + pais);
        }
    }
}
