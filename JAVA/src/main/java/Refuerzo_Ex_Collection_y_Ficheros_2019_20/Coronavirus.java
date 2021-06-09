package Refuerzo_Ex_Collection_y_Ficheros_2019_20;


import java.io.*;
import java.util.*;

public class Coronavirus {
    private Map<Cepa, Set<Pacientes>> pacientes;
    private String nombre;
    private String localidad;


    public Coronavirus(Map<Cepa, Set<Pacientes>> pacientes, String nombre, String localidad) {
        this.pacientes = pacientes;
        this.nombre = nombre;
        this.localidad = localidad;
    }

    @Override
    public String toString() {
        return "Coronavirus{" +
                "pacientes=" + pacientes +
                ", nombre='" + nombre + '\'' +
                ", localidad='" + localidad + '\'' +
                '}'+ '\n';
    }

    public Map<Cepa, Set<Pacientes>> getPacientes() {
        return pacientes;
    }

    public void setPacientes(Map<Cepa, Set<Pacientes>> pacientes) {
        this.pacientes = pacientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public Coronavirus() {
        pacientes = new HashMap<>();
    }


    public void addPaciente(Cepa cepa, Pacientes pac) {
        if (pac.getCepa().equals(cepa)) {
            if (!pacientes.containsKey(cepa)) {
                pacientes.put(cepa, new TreeSet<Pacientes>());
            }
            pacientes.get(cepa).add(pac);
        } else {
            System.out.println("Ese paciente no esta infectado por tal cepa");
        }
    }


    public boolean darDeAltaPaciente(Pacientes pac ) {
        if (!pacientes.containsKey(pac.getCepa())) {
            System.out.printf("El paciente introducido no ha sido infectado por la cepa asignada.");
            return false;
        }
        if (pacientes.get(pac.getCepa()).contains(pac)) {
            return pacientes.get(pac.getCepa()).remove(pac);
        } else {
            System.out.println("No se ha encontrado el paciente.");
            return false;
        }
    }


    public void pacientesDeUnDoctor(String num_colegiado) {
        Collection<Set<Pacientes>> conjunto = pacientes.values();
        int cont_pacientes = 0;
        Iterator it = conjunto.iterator();
        while (it.hasNext()) {
            Set<Pacientes> pacientes = (Set<Pacientes>) it.next();

            for (Pacientes pac : pacientes) {
                if (pac.getMedicos().getNum_colegiado().equals(num_colegiado)) {
                    System.out.println(pac);
                    cont_pacientes++;
                }
            }
        }
        if (cont_pacientes == 0) {
            System.out.println("El medico no tiene ningun paciente asignado.");
        }
    }


    public void pacientesPorPeso(Cepa cepa) {
        if (!pacientes.containsKey(cepa)) {
            System.out.println("No hay perros inscritos de esa raza");
        } else {
            System.out.println(pacientes.get(cepa));
        }
    }

    public void pacientesPorEdad(Cepa cepa) {
        if (!pacientes.containsKey(cepa)) {
            System.out.println("(revisar) No hay pacientes");
        } else {
            List<Pacientes> lista_pac = new ArrayList<>(pacientes.get(cepa));

            Collections.sort(lista_pac, new Comparator<Pacientes>() {

                //mirar eliminando new comparator etc...

                @Override
                public int compare(Pacientes pac1, Pacientes pac2) {
                    return pac2.getEdad()-pac1.getEdad();
                }
            }
            );

            System.out.println(lista_pac);
        }

    }

    public void cargarPacientes() {
        try {
            ObjectInputStream fichero = new ObjectInputStream(new FileInputStream("JAVA/src/main/java/Refuerzo_Ex_Collection_y_Ficheros_2019_20/pacientes.dat"));
            while (true) {
                Pacientes pac = (Pacientes) fichero.readObject();
                addPaciente(pac.getCepa(),pac);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void guardarPacientes() {
        try {
            ObjectOutputStream fichero = new ObjectOutputStream(new FileOutputStream("JAVA/src/main/java/Refuerzo_Ex_Collection_y_Ficheros_2019_20/pacientes.dat"));
            Collection<Set<Pacientes>> conjunto = pacientes.values();
            Iterator it = conjunto.iterator();
            while (it.hasNext()) {
                Set<Pacientes> set_pac = (Set<Pacientes>) it.next();

                for (Pacientes pac : set_pac) {
                    fichero.writeObject(pac);
                }
            }
            fichero.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


}