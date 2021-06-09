package Refuerzo_Ex_Eval_2.Ejercicio2;

public class main {
    public static void main(String[] args) {
        Clinica cli1 = new Clinica();
        Clinica cli2 = new Clinica();
        Perro p1 = new Perro(1,"10/05/2006", "Bandolero",14.5);
        Perro p2 = new Perro(2,"02/02/2013", "Rogelio",10.5);
        Consultas cons1 = new Consultas("25/05/2021", "Heridas en las patas traseras");
        Medicinas medi1 = new Medicinas("paracetamol", 3.25,1);

        Consultas cons2 = new Consultas("30/05/2021", "El perro está sano");



        p1.anadirconsulta(cons1); // se le añade consulta (cons1) al perro (p1)
        cons1.anadirMedicina(medi1); // se le añade medicina (medi1) a la consulta (cons1)

        cli1.anadir_perro(p1); // se le añade perro (p1) a la clinica (cli1)
        cli1.listaPerrosMedicinas(medi1); // muestra los perros que tienen la medicina (medi1)
        cli1.anadirConsulta(p1, cons1); // se añade perro (p1) y consulta (cons1) a la clinica (cli1)

        cli1.cargar(); // carga el fichero
       cli1.guardar(); // guarda el fichero

        p1.anadirconsulta(cons2); // añade consulta (cons2) al perro (p1)
        p1.eliminarconsulta(cons2); // elimina consulta (cons2) al perro (p1)

       cli1.anadir_perro(p1); // añade perro (p1) a la clinica (cli1)
       cli1.eliminarPerro(p1); // elimina perro (p1) a la clinica (cli1)
       cli2.anadir_perro(p1); // añade perro (p1) a la clinica (cli2)
    }
}
