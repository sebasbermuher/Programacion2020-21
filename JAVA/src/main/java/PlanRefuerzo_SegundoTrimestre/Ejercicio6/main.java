package PlanRefuerzo_SegundoTrimestre.Ejercicio6;

public class main {
    public static void main(String[] args) {
        Libro libro = new Libro("ISBN123", "Platero y yo", 1914);
        Libro l2 = new Libro("ISBN456", "Don Quijote de la Mancha", 1605);
        Revista revista = new Revista("IBSN789", "Mundial del 94", 1994, 200);

        libro.esta_prestado();
        l2.devuelve();
        System.out.println(l2);
        l2.presta();

        System.out.println(libro);
        System.out.println(l2);
        l2.devuelve();
        System.out.println(l2);
        System.out.println(revista);

    }
}
