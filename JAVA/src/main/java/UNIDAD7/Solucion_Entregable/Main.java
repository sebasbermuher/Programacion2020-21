package UNIDAD7.Solucion_Entregable;

public class Main {
    public static void main(String[] args) {
        //
        Unidad u1 = new Unidad("1ºA");
        Unidad u2 = new Unidad("2ºB");
        Unidad u3 = new Unidad("3ºA");

        Alumno a1 = new Alumno("alvaro", "garcia", "111111", u1);
        Alumno a2 = new Alumno("bartolo", "dominguez", "22222", u1);
        Alumno a3 = new Alumno("carlos", "jerez", "33333", u1);
        Alumno a4 = new Alumno("damian", "bernabe", "44444", u2);
        Alumno a5 = new Alumno("eduardo", "kilombo", "55555", u3);
        Alumno a6 = new Alumno("fernando", "fernandez", "66666", u2);
        Alumno a7 = new Alumno("gilberto", "arce", "77777", u1);
        Alumno a8 = new Alumno("isidro", "interno", "88888", u1);
        Alumno a9 = new Alumno("jose", "cadete", "99999", u2);
        Alumno a10 = new Alumno("kieran", "extremo", "12121", u3);

        Instituto alixar = new Instituto();

        alixar.addAlumnoUnidad(a1, a1.getUnidad().getNombre());
        alixar.addAlumnoUnidad(a2, a2.getUnidad().getNombre());
        alixar.addAlumnoUnidad(a3, a3.getUnidad().getNombre());
        alixar.addAlumnoUnidad(a4, a4.getUnidad().getNombre());
        alixar.addAlumnoUnidad(a5, a5.getUnidad().getNombre());
        alixar.addAlumnoUnidad(a6, a6.getUnidad().getNombre());
        alixar.addAlumnoUnidad(a7, a7.getUnidad().getNombre());
        alixar.addAlumnoUnidad(a8, a8.getUnidad().getNombre());
        alixar.addAlumnoUnidad(a9, a9.getUnidad().getNombre());
        alixar.addAlumnoUnidad(a10, a10.getUnidad().getNombre());

        alixar.guardarAlumnos();

        alixar.mostrarTodosAlumnosOrdenados();

        alixar.mostrarAlumnosUnidad(u1.getNombre());

        alixar.cargarAlumnos();

        System.out.println(alixar.obtenerUnidadAlumno(a1.getId()));
    }
}