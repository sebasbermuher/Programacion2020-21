package PlanRefuerzo_SegundoTrimestre.Ejercicio2;

public class main {
    public static void main(String[] args) {
        Avion a1 = new Avion("Iberia",10.5,"Alt4", ModoVuelo.MANUAL);
        Avion a2 = new Avion("Ougui",8,"YIYI", ModoVuelo.PILOTO_AUTOMATICO);
        Avion a3 = new Avion("Yeye",5.7,"PMB", ModoVuelo.CRUCERO);


        System.out.println();
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println();

        a1.despegar();
        a1.volar();
        a1.aterrizar();

        a2.despegar();
        a2.volar();
        a2.aterrizar();

        a3.despegar();
        a3.volar();
        a3.aterrizar();


        System.out.println();
        System.out.println("Hay un total de "+Avion.getNum_avion()+" aviones.");
        System.out.println();

        Pasajero p1 = new Pasajero("Sebastian","Calle Esparrago",58964, Estado.EMBARCADO);
        Pasajero p2 = new Pasajero("Pepe","Calle Azucena",96314, Estado.PENDIENTE);
        Pasajero p3 = new Pasajero("Jorge","Avenida de la Unidad",75315, Estado.EMBARCADO);
        Pasajero p4 = new Pasajero("Ana","Calle Juan de Mesa",95147, Estado.EMBARCADO);
        Pasajero p5 = new Pasajero("Maria","Calle Pellegrini",32876, Estado.PENDIENTE);

        System.out.println();
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        System.out.println();

        p1.embarcar();
        p1.sonreir();
        p1.andar();

        p2.embarcar();
        p2.sonreir();
        p2.andar();

        p3.embarcar();
        p3.sonreir();
        p3.andar();

        p4.embarcar();
        p4.sonreir();
        p4.andar();

        p5.embarcar();
        p5.sonreir();
        p5.andar();

        System.out.println();
        System.out.println("Hay un total de "+Pasajero.getNum_pasajeros()+" personas.");
        System.out.println();


    }

}
