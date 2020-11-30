/*
Juego: La cámara secreta. El jugador especifica el número de dígitos de la clave secreta.
La aplicación genera de forma aleatoria, una combinación secreta de n dígitos del 1 al 5
(siendo n la longitud indicada anteriormente por el usuario). El jugador introduce ahora una combinación de prueba.
En cada intento se mostrará como pista, para cada dígito, si es mayor menor o igual que el correspondiente de
la combinación secreta.
Ejemplo:
-Introduzca longitud de la clave
-3
(se genera la clave secreta, por ejemplo 152)
-Intente acertarla
-351
-3 es mayor,
 5 es igual,
 1 es menor
- Intente acertarla de nuevo
... */
package UNIDAD3.Tarea3;

import java.util.Scanner;

public class Ejercicio4 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int contador = 10;
    boolean acierto = true;

    System.out.println("¿De que tamaño quieres que sea la longitud?");
    int num = teclado.nextInt();

    double[] clave = new double[num];
    double[] intento = new double[num];

    for (int i = 0; 1 < clave.length; i++) {
      clave[i] = Math.floor(Math.random() * 5 + 1);
    }
    for (int i = 0; i < intento.length; i++) {
      intento[i] = teclado.nextDouble();
      if (clave[i] == intento[i]) {
        System.out.println(intento[i] + " es igual");
      } else if (clave[i] != intento[i]) {
        System.out.println(intento[i] + " es distinto");
        pista(intento[i], clave[i]);
      }
    }
  }

  static void pista(double intento, double clave) {
    if (intento > clave) {
      System.out.println("El numero introducido es mayor a la clave");
    } else {
      System.out.println("El numero introducido es menor a la clave");
    }
  }
}
