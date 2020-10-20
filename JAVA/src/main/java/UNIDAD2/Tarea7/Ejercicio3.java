/*
Realiza un programa que genere una letra minúscula de forma aleatoria. Investiga el uso de la
función Math.random(). Investiga también sobre el sistema de codificación ASCII
y ten en cuenta que las letras minúsculas se corresponden con los números del 97 al 122.
 */
package UNIDAD2.Tarea7;

public class Ejercicio3 {
  public static void main(String[] args) {
    int resultado;
    char letra;

    resultado =
        (int) (Math.random() * 27 + 97); // Sumamos al numero de letras (sin ñ) el valor en ASCII
    letra = (char) resultado;

    System.out.println("Letra obtenida: " + letra);
  }
}
