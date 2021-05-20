package UNIDAD9.Tarea3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int opcion = 0;

        while (opcion != 5) {
            System.out.println("Elige una opción:");
            System.out.println("----------------------------------");
            System.out.println("1.Insertar cliente");
            System.out.println("2.Asignar empleado a cliente");
            System.out.println("3.Añadir producto a pedido");
            System.out.println("4.Mostrar con detalle un pedido");
            System.out.println("5.Salir");
            System.out.println("----------------------------------");


            opcion = teclado.nextInt();
            if (opcion <= 0 || opcion > 5) {
                System.out.println();
                System.out.println("ERROR 512: Introduce una opcion del 1 al 5");
                System.out.println();
            }

            ADClassicModels adc = new ADClassicModels();
            switch (opcion) {
                case 1:
                    adc.insertCustomer();
                    break;
                case 2:
                    adc.asignarEmpleado();
                    break;
                case 3:
                    adc.anadirProductPedido();
                    break;
                case 4:
                    adc.mostrarPedido();
                    break;
            }
        }
        ConexionBD.close();
    }
}
