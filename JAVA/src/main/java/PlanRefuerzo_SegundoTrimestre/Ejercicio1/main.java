package PlanRefuerzo_SegundoTrimestre.Ejercicio1;

public class main {
    public static void main(String[] args) {
        Avion a1 = new Avion("Iberia",10.5,"Alt4", ModoVuelo.MANUAL);
        System.out.println(a1);

        a1.despegar();
        a1.volar();
        a1.aterrizar();

        Pasajero p1 = new Pasajero("Sebastian","Calle Esparrago",58964,Estado.EMBARCADO);
        Pasajero p2 = new Pasajero("Pepe","Calle Azucena",96314,Estado.PENDIENTE);
        System.out.println(p1);
        System.out.println(p2);

        p1.embarcar();
        p1.sonreir();
        p1.andar();

        p2.embarcar();
        p2.sonreir();
        p2.andar();

    }

}
