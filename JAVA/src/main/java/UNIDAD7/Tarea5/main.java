package UNIDAD7.Tarea5;

public class main {
    public static void main(String[] args) {
        IntroducirAspirantes introduccion = new IntroducirAspirantes();
        introduccion.introducir_aspirantes();

        CalificacionPruebas calificaciones = new CalificacionPruebas();
        calificaciones.poner_notas();

        Aprobados aprobados = new Aprobados();
        aprobados.cargar_aspirantes();
        aprobados.cargar_notas();
        aprobados.calcular_medias();
        aprobados.generarInforme();
    }
}