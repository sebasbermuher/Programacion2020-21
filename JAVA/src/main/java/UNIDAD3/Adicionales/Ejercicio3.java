/*
Un restaurante nos ha encargado una aplicación para colocar a los clientes ensus mesas. En una mesa se pueden
sentar de 0 (mesa vacía) a 4 comensales(mesa llena).
Cuando llega un cliente se le pregunta cuántos son. De momento el programa no está preparado para colocar
a grupos mayores a 4, por tanto, si un cliente dice por ejemplo que son un grupo de 6, el programa dará el
mensaje "Lo siento, no admitimos grupos de 6, haga grupos de 4 personas como máximo e intente de nuevo".
Para el grupo que llega, se busca siempre la primera mesa libre (con 0 personas).
Si no quedan mesas libres, se busca donde haya un hueco
para_todo  el grupo, por ejemplo si el grupo es dedos personas, se podrá colocar donde haya una o dos personas
Inicialmente,las mesas se cargan con valores aleatorios entre 0 y 4.
Cada vez que se sientan nuevos clientes se debe mostrar el estado de las mesas. Los grupos no se pueden romper
aunque haya huecos sueltos suficientes. El funcionamiento del programa se ilustra a continuación:
 */
package UNIDAD3.Adicionales;

import java.util.Scanner;

public class Ejercicio3 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    // declaracion array (10 mesas)
    int[] arrayMesas = new int[10];

    int grupo = 0;
    boolean mesaAsignada = false;

    // Genera aleatoriamente los clientes que ya hay en las mesas
    for (int i = 0; i <= 9; i++) {
      arrayMesas[i] = (int) (Math.random() * 4) + 0;
      System.out.println("Mesa " + (i + 1) + " ---> " + arrayMesas[i]);
    }

    do {
      // Se valida la cantidad de clientes nuevos
      System.out.print("¿Cuántos son? (Introduzca -1 para salir del programa): ");
      grupo = teclado.nextInt();

      if ((grupo <= 0 || grupo >= 5) && grupo != -1) {
        System.out.println(
            "Lo siento, no admitimos grupos de "
                + grupo
                + ", haga grupos de 4 personas como máximo e intente de nuevo");
      } else {
        // Comprueba si el nuevo grupo de clientes cabe en una mesa, si no no los sienta
        for (int i = 0; i <= 9 && mesaAsignada == false && grupo != -1; i++) {
          if ((4 - arrayMesas[i]) >= grupo) {

            if (arrayMesas[i] == 0) {
              System.out.println("Por favor, siéntese en la mesa número " + (i + 1));
              System.out.println(" ");

              arrayMesas[i] = arrayMesas[i] + grupo;
              mesaAsignada = true;
            } else {
              System.out.println(
                  "Tendrá que compartir mesa. Por favor, siéntese en la mesa número " + (i + 1));
              System.out.println(" ");

              arrayMesas[i] = arrayMesas[i] + grupo;
              mesaAsignada = true;
            }
          }
          if (i == 9 && mesaAsignada == false) {
            System.out.println("Lo siento, en estos momentos no queda sitio");
            System.out.println(" ");
          }
        }
        mesaAsignada = false;
      }

      // Muestra la mesa tras sentar a los nuevos clientes
      for (int i = 0; i <= 9 && grupo != -1; i++) {
        System.out.println("Mesa " + (i + 1) + " ---> " + arrayMesas[i]);
      }
      System.out.println(" ");
    } while (grupo != -1);
  }
}
