/*
Crear la clase Piano y la clase Campana que heredan de Instrumento.
 */
package UNIDAD5.Tarea1.Ejercicio6;

import UNIDAD5.Tarea1.Ejercicio5.instrumento;

public class main {
    public static void main(String[] args) {
        campana c = new campana();
        piano p = new piano();
        c.add(instrumento.Nota.DO);
        c.add(instrumento.Nota.RE);
        p.add(instrumento.Nota.MI);
        p.add(instrumento.Nota.FA);
        c.interpretar();
        p.interpretar();
    }
}