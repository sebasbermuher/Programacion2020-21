package UNIDAD5.Tarea1.Ejercicio7;

import static UNIDAD5.Tarea1.Ejercicio7.caja.Unidades.CM;
import static UNIDAD5.Tarea1.Ejercicio7.caja.Unidades.M;

public class main {
    public static void main(String[] args) {
        caja caja1 = new caja(12, 13,14, CM);
        caja caja2 = new caja(13,14,15, M);

        System.out.println(caja1);
        caja1.etiqueta="Etiqueta de prueba";
        System.out.println(caja2);
        System.out.println(caja1.etiqueta);
    }
}