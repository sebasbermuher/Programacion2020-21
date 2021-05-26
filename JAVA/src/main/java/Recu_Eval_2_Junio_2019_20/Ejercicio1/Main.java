package Recu_Eval_2_Junio_2019_20.Ejercicio1;

import java.util.Scanner;

public class Main {

    public static void main (String [] args){
        //Menu
        // - Consultar saldo
        // Preguntar la cuenta y mostrar saldo
        // - Ingresar dinero
        // Preguntar cuenta y añadir saldo a la cuenta
        // - Sacar dinero
        // Preguntar la cuenta, el saldo a sacar y mostrar resultado restante
        // - Realizar transferencia
        // Sacar saldo de una cuenta y transferir a la otra


        //Crear cuentas
        Cuenta [] clientes = new Cuenta[2];

        clientes [0] = new Cuenta("ABC123", 1000.00, "Jon Doe");
        clientes [1] = new Cuenta("XYZ456", 2000.00, "Anon Lin");

        //Menu
        Scanner scan = new Scanner(System.in);

        int lectorMenu = 99;
        while(lectorMenu !=0){
            System.out.println("---");
            System.out.println("--- MENU ---");
            System.out.println("--- SELECCIONE UNA OPCION ---");
            System.out.println("1. Consultar saldo.");
            System.out.println("2. Ingresar dinero.");
            System.out.println("3. Sacar dinero.");
            System.out.println("4. Realizar transferencia.");
            System.out.println("0. Salir.");
            System.out.println("Seleccion: ");
            lectorMenu = scan.nextInt();

            switch (lectorMenu){

                case 1:
                    System.out.println("Introducir numero de cuenta:");
                    String lectorCuentaCase1 = scan.next();
                    consultarSaldo(clientes, lectorCuentaCase1);
                    break;

                case 2:
                    System.out.println("Introducir numero de cuenta:");
                    String lectorCuentaCase2 = scan.next();
                    System.out.println("Introducir cantidad a ingresar:");
                    String lectorIngresoCase2 = scan.next();
                    Utilidades pasarDouble2 = new Utilidades();
                    Double ingresoFormateado2 = pasarDouble2.pedirDoble(lectorIngresoCase2);
                    //System.out.println(ingresoFormateado2);
                    ingresarDinero(clientes, lectorCuentaCase2, ingresoFormateado2);
                    break;

                case 3:
                    System.out.println("Introducir numero de cuenta:");
                    String lectorCuentaCase3 = scan.next();
                    System.out.println("Introducir cantidad a retirar:");
                    String lectorIngresoCase3 = scan.next();
                    Utilidades pasarDouble3 = new Utilidades();
                    Double ingresoFormateado3 = pasarDouble3.pedirDoble(lectorIngresoCase3);
                    System.out.println(ingresoFormateado3);
                    retirarDinero(clientes, lectorCuentaCase3, ingresoFormateado3);
                    break;

                case 4:
                    System.out.println("Introducir numero de cuenta de retiro:");
                    String lectorCuentaCase4a = scan.next();
                    System.out.println("Introducir numero de cuenta de ingreso:");
                    String lectorCuentaCase4b = scan.next();
                    System.out.println("Introducir cantidad a transferir:");
                    String lectorIngresoCase4c = scan.next();
                    Utilidades pasarDouble4 = new Utilidades();
                    Double ingresoFormateado4 = pasarDouble4.pedirDoble(lectorIngresoCase4c);
                    transferirDinero(clientes, lectorCuentaCase4a, lectorCuentaCase4b, ingresoFormateado4);
                    break;

                case 0:
                    System.out.println("Hasta luego!");
                    break;
            }
        }

    }

    static void consultarSaldo(Cuenta [] clientes,String cuenta){
        String resp = "";
        for(int i=0; i< clientes.length; i++){
            if(clientes[i].getNumeroCuenta().equalsIgnoreCase(cuenta)){
                System.out.println("Saldo disponible: " + clientes[i].getSaldo());
            } else{
                //System.out.println("Cuenta erronea");
            }
        }
    };

    static void ingresarDinero(Cuenta [] clientes,String cuenta, Double ingreso){
        for(int i=0; i< clientes.length; i++){
            if(clientes[i].getNumeroCuenta().equalsIgnoreCase(cuenta)){
                double saldo = clientes[i].getSaldo() + ingreso;
                clientes[i].setSaldo(saldo);
                System.out.println("Saldo añadido correctamente. Total disponible: " + saldo);
            } else{
                //System.out.println("Cuenta incorrecta");
            }
        }
    }

    static void retirarDinero(Cuenta [] clientes,String cuenta, Double retiro){
        Double saldo = 0.0;
        String resp = "";
        for(int i=0; i< clientes.length; i++){
            if(clientes[i].getNumeroCuenta().equalsIgnoreCase(cuenta)){
                saldo = clientes[i].getSaldo() - retiro;
                clientes[i].setSaldo(saldo);
                System.out.println("Saldo retirado correctamente. Total disponible: " + saldo);
            } else{
                //System.out.println("Cuenta erronea");
            }
        }
    };

    static void transferirDinero(Cuenta [] clientes,String cuenta1, String cuenta2,  Double retiro){
        Double saldo = 0.0;
        for(int i=0; i< clientes.length; i++){
            if(clientes[i].getNumeroCuenta().equalsIgnoreCase(cuenta1)){
                saldo = clientes[i].getSaldo() - retiro;
                clientes[i].setSaldo(saldo);
                System.out.println("Saldo retirado correctamente de cuenta1. Total disponible: " + saldo);
            } else{
                //System.out.println("Cuenta 1 erronea");
            }
            for(int j=0; j<clientes.length;j++){
                if(clientes[i].getNumeroCuenta().equalsIgnoreCase(cuenta2)){
                    saldo = clientes[i].getSaldo() + retiro;
                    clientes[i].setSaldo(saldo);
                    System.out.println("Saldo ingresado correctamente en cuenta2. Total disponible: " + saldo);
                    break;
                } else{
                    //System.out.println("Cuenta 2 erronea");
                }
            }
        }
    };



}