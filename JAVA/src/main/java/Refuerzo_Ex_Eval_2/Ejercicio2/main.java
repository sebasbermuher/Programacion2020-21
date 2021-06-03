package Refuerzo_Ex_Eval_2.Ejercicio2;

public class main {
    public static void main(String[] args) {
        Clinica cli1 = new Clinica();
        Perro p1 = new Perro(1,"10/05/2006", "Bandolero",14.5);
        Consultas cons1 = new Consultas("25/05/2021", "Heridas en las patas traseras");
        Medicinas medi1 = new Medicinas("paracetamol", 3.25,1);

        Consultas cons2 = new Consultas("30/05/2021", "El perro está sano");


        cons1.anadirMedicina(medi1);
        p1.anadirconsulta(cons1);

        cli1.anadir_perro(p1);
        cli1.anadirConsulta(p1, cons1);
        cli1.listaPerrosMedicinas(medi1);
        cli1.cargar();
        cli1.guardar();

        p1.anadirconsulta(cons2);
        p1.eliminarconsulta(cons2);



    }
}
