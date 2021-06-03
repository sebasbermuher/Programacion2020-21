package Recuperacion_Eval_2_Mayo_2021.Ejercicio2;

import java.io.*;
import java.util.*;


public class ClinicaCanina {
    private Map<Integer,Perro> Perros;

    public ClinicaCanina() {
        this.Perros = new TreeMap<>();
    }

    public void addConsulta(Perro p, Consulta c){
        if (!Perros.containsKey(p.getPin())){
            getMapaPerros().put(p.getPin(),p);
        }
        p.addConsulta(c);
        Perros.replace(p.getPin(),p);
    }
    public void listaPerrosMedicina(String nombremedicina){
        List<Perro> listaperros =new ArrayList<>(Perros.values());
        Medicina aux= new Medicina(nombremedicina,1,1);
        for (Perro p:listaperros) {
            for (Consulta c : p.getListaConsultas()) {
                if (c.getMedicinas().contains(aux)) {
                    System.out.println(p.getNombre());
                }
            }
        }
    }

    public void cargarPerros(){
        try {
            ObjectInputStream leer=new ObjectInputStream(new FileInputStream("perretes.txt"));
            while (true){
                Perro p=(Perro)leer.readObject();
                Perros.put(p.getPin(),p);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void guardarPerros(){
        try {
            ObjectOutputStream writer=new ObjectOutputStream(new FileOutputStream("perretes.txt"));
            Collection<Perro> listaperros=(Collection<Perro>) Perros.values();
            Iterator<Perro> it= listaperros.iterator();
            while (it.hasNext()){
                Perro p = it.next();
                writer.writeObject(p);
            }
            writer.close();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public Map<Integer, Perro> getMapaPerros() {
        return Perros;
    }

    public void setMapaPerros(Map<Integer, Perro> mapaPerros) {
        this.Perros = mapaPerros;
    }

    @Override
    public String toString() {
        return "ClinicaCanina{" +
                "Perros=" + Perros +
                '}';
    }
}
