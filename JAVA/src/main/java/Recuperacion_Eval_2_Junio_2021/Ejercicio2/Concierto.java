package Recuperacion_Eval_2_Junio_2021.Ejercicio2;

import java.io.*;
import java.util.*;

public class Concierto {
    private Map<Estilo, Set<Artistas>> mapa_artista;
    private String nombre_evento;
    private String recinto;

    public Concierto(Map<Estilo, Set<Artistas>> mapa_artista, String nombre_evento, String recinto) {
        this.mapa_artista = mapa_artista;
        this.nombre_evento = nombre_evento;
        this.recinto = recinto;
    }

    @Override
    public String toString() {
        return "Concierto{" +
                "mapa_artista=" + mapa_artista +
                ", nombre_evento='" + nombre_evento + '\'' +
                ", recinto='" + recinto + '\'' +
                '}';
    }

    public Map<Estilo, Set<Artistas>> getMapa_artista() {
        return mapa_artista;
    }

    public void setMapa_artista(Map<Estilo, Set<Artistas>> mapa_artista) {
        this.mapa_artista = mapa_artista;
    }

    public String getNombre_evento() {
        return nombre_evento;
    }

    public void setNombre_evento(String nombre_evento) {
        this.nombre_evento = nombre_evento;
    }

    public String getRecinto() {
        return recinto;
    }

    public void setRecinto(String recinto) {
        this.recinto = recinto;
    }


    //METODOS

    public void altaArtista(Estilo estilo, Artistas artistas) {
        if (artistas.getEstilo().equals(estilo)) {

            if (!mapa_artista.containsKey(estilo)) {
                mapa_artista.put(estilo, new TreeSet<Artistas>());
            }

            mapa_artista.get(estilo).add(artistas);
        }
    }



    /*
    public void artistasByManager(String telefono) {
        Collection<Set<Artistas>> conj_artistas = mapa_artista.values();
        int total_artistas = 0;
                if (Artistas.getManagers().getTelefono().equals(telefono)) {
                    System.out.println(Artistas);
                    total_artistas++;
                }
       }
*/

    public void artistasByCache(Estilo estilo) {
            List<Artistas> lista_artistas = new ArrayList<>(mapa_artista.get(estilo));
            Collections.sort(lista_artistas, new Comparator<Artistas>() {
                @Override
                public int compare(Artistas art1, Artistas art2) {
                    return art1.getCache()-art2.getCache();
                }});
            System.out.println(lista_artistas);
        }


    public void cargarArtistas() {
        try (ObjectInputStream archivo = new ObjectInputStream(new FileInputStream("artistas.dat"))) {
            mapa_artista = (Map<Estilo, Set<Artistas>>) archivo.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }




    public void guardarArtistas() {
        try (ObjectOutputStream archivo = new ObjectOutputStream(new FileOutputStream("artistas.dat"))) {
            archivo.writeObject(mapa_artista);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Fichero creado");
    }


}



