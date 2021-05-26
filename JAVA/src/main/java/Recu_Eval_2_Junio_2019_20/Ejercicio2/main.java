package Recu_Eval_2_Junio_2019_20.Ejercicio2;

public class main {
    public static void main(String[] args) {
        // Principal.
        Desescalada andalucia = new Desescalada();

        andalucia.avanzarDesescalada("Cádiz", Enum_Fases.FASE1);
        andalucia.avanzarDesescalada("Sevilla", Enum_Fases.FASE3);
        andalucia.avanzarDesescalada("Málaga", Enum_Fases.FASE1);
        andalucia.avanzarDesescalada("Cordoba", Enum_Fases.FASE2);

         andalucia.nuevaNormalidad("Cádiz"); //estara en la nueva normalidad
         andalucia.nuevaNormalidad("Cádiz"); //dará error


        System.out.println(andalucia.toString());

        andalucia.mostrarFasesTerritorios();
    }
}