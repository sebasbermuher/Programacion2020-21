package UNIDAD7.U6U7_Examen;

import java.util.Scanner;


public class Main {

    public static void metodos() {
        System.out.println("1.- cargaAtletas");
        System.out.println("2.- guardarAtletas");
        System.out.println("3.- inscribirAtletas");
        System.out.println("4.- guardarTiempo");
        System.out.println("5.- borrarAtleta");
        System.out.println("6.- mostrarListaFinishers");
        System.out.println("7.- mostrarListaCategoria");
        System.out.println("8.- participantesPorPais");
        System.out.println("9.- Salir");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String categoria, pais;

        Maraton mCasti = new Maraton();
        Atleta atleta1 = new Atleta("Sebastian","España",Categoria.SENIOR,true);
        Atleta atleta2 = new Atleta("Ruben","Macedonia",Categoria.SENIOR,true);
        Atleta atleta3 = new Atleta("Ibrahimovic","Suecia",Categoria.SENIOR,false);
        Atleta atleta4 = new Atleta("Jorge","España",Categoria.SENIOR,true);
        Atleta atleta5 = new Atleta("Giovanni","Argentina",Categoria.SENIOR,false);

        Atleta atleta6 = new Atleta("Ronaldo","Portugal",Categoria.JUNIOR,false);
        Atleta atleta7 = new Atleta("Messi","Argentina",Categoria.JUNIOR,false);
        Atleta atleta8 = new Atleta("Robinson","Inglaterra",Categoria.JUNIOR,true);
        Atleta atleta9 = new Atleta("Makelele","Brasil",Categoria.JUNIOR,true);
        Atleta atleta10 = new Atleta("Cantona","Inglaterra",Categoria.JUNIOR,true);

        Atleta atleta11 = new Atleta("Alexander","Marruecos",Categoria.VETERANO,false);
        Atleta atleta12 = new Atleta("William","Portugal",Categoria.VETERANO,true);
        Atleta atleta13 = new Atleta("Pepe","España",Categoria.VETERANO,true);
        Atleta atleta14 = new Atleta("Serginho","Brasil",Categoria.VETERANO,true);
        Atleta atleta15 = new Atleta("Fekir","Francia",Categoria.VETERANO,true);

        
        mCasti.inscribirAtleta(atleta1);
        mCasti.inscribirAtleta(atleta2);
        mCasti.inscribirAtleta(atleta3);
        mCasti.inscribirAtleta(atleta4);
        mCasti.inscribirAtleta(atleta5);

        mCasti.inscribirAtleta(atleta6);
        mCasti.inscribirAtleta(atleta7);
        mCasti.inscribirAtleta(atleta8);
        mCasti.inscribirAtleta(atleta9);
        mCasti.inscribirAtleta(atleta10);

        mCasti.inscribirAtleta(atleta11);
        mCasti.inscribirAtleta(atleta12);
        mCasti.inscribirAtleta(atleta13);
        mCasti.inscribirAtleta(atleta14);
        mCasti.inscribirAtleta(atleta15);


        int eleccion;
        do {
            metodos();
            eleccion = teclado.nextInt();

            if (eleccion==1) {
                mCasti.cargarAtletas();
            }
            if (eleccion==2){
                mCasti.guardarAtletas();
            }
            if (eleccion==3){

            }
            if (eleccion==4){

            }
            if (eleccion==5){
                System.out.println("Escribe el dorsal para borrar al atleta");
                int dorsal = teclado.nextInt();
                mCasti.borrarAtleta(dorsal);

            }
            if (eleccion==6){
                mCasti.mostrarListaFinisher();
            }
            if (eleccion==7){
                teclado.nextLine();
                System.out.println("Escribe la categoria (SENIOR, JUNIOR, VETERANO)");
                categoria = teclado.nextLine();
                mCasti.mostrarLIstaCategoria(Categoria.valueOf(categoria));
            }
            if (eleccion==8){
                teclado.nextLine();
                System.out.println("Introduce el pais (Ejemplo: España)");
                pais = teclado.nextLine();
                mCasti.participantePorPais(pais);
                teclado.nextLine();
            }

            teclado.nextLine();
        }while (eleccion != 9);

    }
}
