/*
Escribe un programa que rellene un array de 100 elementos con números en-teros aleatorios comprendidos
entre 0 y 500 (ambos incluidos). A continuaciónel programa mostrará el array y preguntará si el usuario
quiere destacar elmáximo o el mínimo. Seguidamente se volverá a mostrar el array escribiendoel número destacado
entre dobles asteriscos.
Ejemplo:
459 204 20 250 178 90 353 32 229 357 224 454 260 310 140 249 332 426 423 413 96447 465 298 459 411 118 480
302 417 42 82 126 82 474 362 76 190 104 21 257 88 21251 6 383 47 78 392 394 244 494 87 253 376 379 98 364
237 13 299 228 409 402 225426 267 330 243 209 426 435 309 356 173 130 416 15 477 34 28 377 193 481 368 466262
422 275 384 399 397 87 218 84 312 480 207 68 108
¿Qué quiere destacar? (1 – mínimo, 2 – máximo): 1
459 204 20 250 178 90 353 32 229 357 224 454 260 310 140 249 332 426 423 413 96447 465 298 459 411 118 480 302
417 42 82 126 82 474 362 76 190 104 21 257 88 21251 **6** 383 47 78 392 394 244 494 87 253 376 379 98 364 237 13
299 228 409 402225 426 267 330 243 209 426 435 309 356 173 130 416 15 477 34 28 377 193 481 368466 262 422 275 384
399 397 87 218 84 312 480 207 68 10
 */
package UNIDAD3.Adicionales;

import java.util.Scanner;

public class Ejercicio1 {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    int[] numero = new int[100]; // array de 100 numeros enteros
    int maximo = 0;
    int minimo = 500;

    for (int i = 0; i < 100; i++) {
      numero[i] = (int) (Math.random() * 501); // numeros aleatorios

      // localiza numero maximo y minimo entre los 100 numeros del array

      if (numero[i] > maximo) {
        maximo = numero[i];
      }
      if (numero[i] < minimo) {
        minimo = numero[i];
      }
    }
    System.out.println();

    // muestra los 100 numeros aleatorios del array
    System.out.println("Los valores son: ");
    for (int i = 0; i < 100; i++) {
      System.out.print(numero[i] + " ");
    }
    System.out.println();
    System.out.println("¿Que quieres destacar?(1.Minimo 2.Maximo):");
    int opcion = teclado.nextInt();

    int destacado = 0;

    if (opcion == 1) {
      destacado = minimo;
    } else {
      destacado = maximo;
    }
    // muestra el resultado segun la opción elegida
    for (int i = 0; i < 100; i++) {
      if (numero[i] == destacado) {
        System.out.print(" **" + numero[i] + "** ");
      } else {
        System.out.print(numero[i] + " ");
      }
    }
  }
}
