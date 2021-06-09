package PlanRefuerzo_SegundoTrimestre.Ejercicio4;

public class main {
    public static void main(String[] args) {
        Avion a1 = new Avion("Fly Emirates", 150.75, "Comercial", ModoVuelo.PILOTO_AUTOMATICO);
        Avion a2 = new Avion("Ougui", 90, "600", ModoVuelo.MANUAL);

        Pasajeros p1 = new Pasajeros("Ruben", "Calle Ninguna", 12345);
        Pasajeros p2 = new Pasajeros("Pedro", "Calle Real", 67890);

        Vuelo vuelo = new Vuelo(a1, "05/07/2021", "Sevilla", "Lisboa", p1);
        Vuelo v2 = new Vuelo(a2, "09/08/2021", "Sevilla", "Paraguay", p2);

        Aeropuerto aeropuerto = new Aeropuerto("Sevilla");



        aeropuerto.anadirVuelo(vuelo);
        aeropuerto.mostrarVuelos("05/07/2021");
        aeropuerto.eliminarVuelo(vuelo);


        aeropuerto.anadirVuelo(v2);
        System.out.println(aeropuerto);
    }
}
