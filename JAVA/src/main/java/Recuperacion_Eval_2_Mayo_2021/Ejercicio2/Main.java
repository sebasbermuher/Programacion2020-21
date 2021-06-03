package Recuperacion_Eval_2_Mayo_2021.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        ClinicaCanina clinicaCanina=new ClinicaCanina();

        Perro perro1=new Perro(1,"05/06/2010","Bandolero",5050);
        Perro perro2=new Perro(2,"13/12/2015","Fandango",3500);
        Medicina medi= new Medicina("Aspirina",7,10);
        Consulta cons=new Consulta("23/07/2018","Está mareado");
        Consulta cons2=new Consulta("29/02/2019","Está perfecto");
        cons.getMedicinas().add(medi);

        //agrega la consulta al perro
        clinicaCanina.addConsulta(perro1,cons);
        System.out.println(clinicaCanina);//lo muestra

        perro2.addConsulta(cons2);
        clinicaCanina.getMapaPerros().put(perro2.getPin(),perro2);
        System.out.println(clinicaCanina);

        clinicaCanina.listaPerrosMedicina(medi.getNombre());

        clinicaCanina.guardarPerros();
        clinicaCanina.cargarPerros();
    }
}
