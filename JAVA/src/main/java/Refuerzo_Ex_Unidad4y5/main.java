package Refuerzo_Ex_Unidad4y5;

public class main {
    public static void main(String[] args) {
        Conductor cond1= new Conductor("Sebastian", "Bermudez Herrera", "ESAN6932");
        Conductor cond2= new Conductor("Pepe", "Gutierrez Gonzalez", "POR52369");
        Conductor cond3= new Conductor("Manolo", "Perez Ramirez", "AND56321");
        Conductor cond4= new Conductor("Gonzalo", "Suarez Padilla", "CAT54789");

        Cajas c1 = new Cajas(1);
        Cajas c2 = new Cajas(2);

        Prendas p1 = new Prendas(15,"Camiseton","ES963", 200);
        Prendas p2 = new Prendas(20,"Pantalon","ES123", 120);

        PrendasColgadas prendaColgada1 = new PrendasColgadas(35, "Vestido","PR695",600,1.50);
        PrendasColgadas prendaColgada2 = new PrendasColgadas(35, "Camisa","LO521",300,0.90);

        CamionCajas camionCajas1 = new CamionCajas("1236PRT",50,cond1);
        CamionCajas camionCajas2 = new CamionCajas("6521SAR",50,cond2);

        CamionPerchas camionPerchas1 = new CamionPerchas("8521LKJ", 50, cond3);
        CamionPerchas camionPerchas2 = new CamionPerchas("1297JGH", 50, cond4);


        c1.agregarPrenda(p1);// introducimos la prenda a la caja
        c2.agregarPrenda(p2);

        camionCajas1.agregarCaja(c1);// introducimos la caja al camion
        camionCajas2.agregarCaja(c2);

        camionPerchas1.agregarPrendaColgada(prendaColgada1); // introducimos la prendaColgada al camionPerchas
        camionPerchas2.agregarPrendaColgada(prendaColgada2);

        p1.devolver(p1);//ejecutamos las funciones devolver, doblar y colgar
        p2.doblar(p2);
        prendaColgada1.colgar(prendaColgada2);


        camionCajas1.descargar();
        camionCajas2.descargar();
        camionPerchas1.descargar();
        camionPerchas2.descargar();


        camionCajas1.eliminaCaja(c1);
        System.out.println(camionCajas1);

        c1.eliminarPrenda(p1);
        System.out.println(c1);


    }
}
