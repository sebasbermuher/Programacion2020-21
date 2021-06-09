package PlanRefuerzo_SegundoTrimestre.Ejercicio3;

public class main {
    public static void main(String[] args) {
        Avion a1 = new Avion("Fly Emirates", 150.75, "Comercial", ModoVuelo.PILOTO_AUTOMATICO);

        Pasajeros p1 = new Pasajeros("Pepe", "Calle Larga", 12345);
        Pasajeros p2 = new Pasajeros("Manuel", "Calle Chica", 67891);

        Vuelo vuelo = new Vuelo(a1, "05/07/2021", "Italia", "Lisboa", p1);

        vuelo.eliminarPasajero(p1.getNum_pasaporte());
        vuelo.anadirPasajero(p2);
        vuelo.lista_de_pasajeros();
    }
}