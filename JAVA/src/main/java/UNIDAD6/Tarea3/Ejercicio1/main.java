/*
Investiga cómo crear una excepción propia y piensa para qué puede servir. Crea una excepción propia, y lánzala cuando,
en la clase Cliente, intente dársele un valor negativo o mayor de 100 al atributo edad. Además, otra excepción debe
lanzarse cuando el cliente intente crearse con una edad menor de 18, puesto que no podemos dar servicio a
clientes menores de edad. Pruébalo en una main, siendo aquí donde se capturan las excepciones.
 */
package UNIDAD6.Tarea3.Ejercicio1;

public class main {
    public static void main(String[] args) {
        try {
            Cliente persona1 = new Cliente( 8);
        } catch (Edad e) {
            System.out.println(e.getMessage());
        }
    }
}