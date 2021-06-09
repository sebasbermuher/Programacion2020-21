package PlanRefuerzo_SegundoTrimestre.Ejercicio7;

public class main {
    public static void main(String[] args) {
        Libro libro = new Libro("10/05/2021","ISBN123", "Platero y yo", 1914, false);
        Libro l2 = new Libro("03/06/2021","ISBN456", "Don Quijote de la Mancha", 1605,true);
        Revista revista = new Revista("10/03/2021","IBSN789", "Mundial del 94", 1994, 200);

        libro.esta_prestado();

        l2.devuelve();
        l2.presta();
        l2.devuelve();

    }
}
