package Refuerzo_Ex_Collection_y_Ficheros_2019_20;

import java.util.HashMap;
import java.util.Set;


public class main {
    public static void main(String[] args) {
        Coronavirus corona = new Coronavirus(new HashMap<Cepa, Set<Pacientes>>(),"COVID-19","Wuhan");

        Medicos m1 = new Medicos("Pablo","Gutierrez","123","UNO");
        Medicos m2 = new Medicos("Antonio","Perez","456","DOS");
        Medicos m3 = new Medicos("Jose Manuel","Martinez","789","TRES");
        Medicos m4 = new Medicos("Manolito","Palote","111","MILITAR");

        Pacientes p1 = new Pacientes("Pepito",16,50,false,m1,Cepa.Brasil);
        Pacientes p2 = new Pacientes("Juanito",52,90,true,m1,Cepa.Brasil);
        Pacientes p3 = new Pacientes("Manolito",80,82,true,m1,Cepa.Brasil);

        Pacientes p4 = new Pacientes("Perico",28,75,false,m2,Cepa.Argentina);
        Pacientes p5 = new Pacientes("Jesulin",35,85,true,m2,Cepa.Argentina);
        Pacientes p6 = new Pacientes("Maria",12,40,true,m2,Cepa.Argentina);

        Pacientes p7 = new Pacientes("Pascual",26,72,false,m3,Cepa.Inglesa);
        Pacientes p8 = new Pacientes("Luisa",92,75,false,m3,Cepa.Inglesa);
        Pacientes p9 = new Pacientes("Joaquin",37,90,true,m3,Cepa.Inglesa);
        Pacientes p10 = new Pacientes("Ana",61,95,false,m3,Cepa.Inglesa);


        System.out.println("----- addPacientes() -----");
        corona.addPaciente(Cepa.Brasil,p1);
        corona.addPaciente(Cepa.Brasil,p2);
        corona.addPaciente(Cepa.Brasil,p3);

        corona.addPaciente(Cepa.Argentina,p4);
        corona.addPaciente(Cepa.Argentina,p5);
        corona.addPaciente(Cepa.Argentina,p6);

        corona.addPaciente(Cepa.Inglesa,p7);
        corona.addPaciente(Cepa.Inglesa,p8);
        corona.addPaciente(Cepa.Inglesa,p9);
        corona.addPaciente(Cepa.Brasil,p10);
        System.out.println();


        System.out.println("----- PacientesDeUnDoctor(123) -----");
        corona.pacientesDeUnDoctor("123");
        System.out.println();

        System.out.println("----- PacientesDeUnDoctor(111) -----"); //no tiene ningun paciente, debe dar error
        corona.pacientesDeUnDoctor("111");
        System.out.println();


        System.out.println("----- PacientesPorPeso() -----");
        corona.pacientesPorPeso(Cepa.Inglesa);
        System.out.println();


        System.out.println("----- PacientesPorEdad() -----");
        corona.pacientesPorEdad(Cepa.Brasil);
        System.out.println();


        System.out.println("----- CORONAVIRUS -----");
        System.out.println(corona);
        System.out.println();


        System.out.println("----- DarDeAltaPaciente(p3) -----");
        corona.darDeAltaPaciente(p3);
        System.out.println();

        System.out.println("----- DarDeAltaPaciente(p3) -----");
        corona.darDeAltaPaciente(p3); //al ya estar dado de alta anteriormente, nos da mensaje de error
        System.out.println();


        System.out.println("----- CORONAVIRUS -----");
        System.out.println(corona); // deberia de estar eliminado el paciente P3 anteriormente dado de alta
        System.out.println();


        //corona.cargarPacientes();
        corona.guardarPacientes();


    }
}