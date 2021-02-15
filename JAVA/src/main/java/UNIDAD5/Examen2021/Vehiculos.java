package UNIDAD5.Examen2021;

public class Vehiculos {
    public String matricula;
    public int carga_max;
    public String conductor;
    public int num_tiendas;

    public Vehiculos(String matricula, int carga_max, String conductor, int num_tiendas) {
        this.matricula = matricula;
        this.carga_max = carga_max;
        this.conductor = conductor;
        this.num_tiendas = num_tiendas;
    }


    @Override
    public String toString() {
        return "Matricula: "+ matricula + "\n"+
                "Carga maxima: " + carga_max + "\n" +
                "Conductor: " + conductor + "\n" +
                "Numero de tienda: " + num_tiendas;
    }
}

