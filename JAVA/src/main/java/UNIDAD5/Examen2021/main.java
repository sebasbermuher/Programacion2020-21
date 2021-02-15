package UNIDAD5.Examen2021;

public class main {
    public static void main(String[] args) {
        Vehiculos vehiculos1 = new Vehiculos("5496DFT", 20 , "Pepe", 5);
        Prendas prenda1 = new Prendas(35, "Camiseta OFF WHITE", 458569942, 60);
        Conductor conductor1= new Conductor("Pepe", "Viyuela Martin", "AN048963257");

        System.out.println("<<<VEHICULO>>>");
        System.out.println(vehiculos1);
        System.out.println();
        System.out.println("<<<PRENDA>>>");
        System.out.println(prenda1);
        System.out.println();
        System.out.println("<<<CONDUCTOR>>>");
        System.out.println(conductor1);
    }
}