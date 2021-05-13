package UNIDAD9.Tarea2;

public class main {
    public static void main(String[] args) {

        ADClassicModels metodos = new ADClassicModels();

        System.out.println(metodos.getEmpleados());

        System.out.println(metodos.getOffices());

        ConexionBD.closeConection();

    }
}