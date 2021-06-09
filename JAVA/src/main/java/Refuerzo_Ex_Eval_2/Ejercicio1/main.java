package Refuerzo_Ex_Eval_2.Ejercicio1;


public class main {
    public static void main(String[] args) {
        Revisiones revi1 = new Revisiones("15/07/2019", true, 8);
        AltavozTV tv1 = new AltavozTV(1, 2.5, 3, TipoDeInterfaz.IR);


        Revisiones revi2 = new Revisiones("07/02/2010", false, 18.90);

        AltavozTV tv2 = new AltavozTV(2, 3, 3, TipoDeInterfaz.Jack);

        AltavozMovil alt_movil = new AltavozMovil(3, 0.01, 0.01, 3);

        AltavozEmpotrable alt_empo =
                new AltavozEmpotrable(4, 3, 5, LugarInstalado.Puerta);

        AltavozTrasero alt_trase = new AltavozTrasero(5, 3, 3, 600,true);

        System.out.println("--A tv1 se le añade la revision (revi1)--");
        tv1.addRevision(revi1);
        System.out.println();

        System.out.println("--A tv1 se le elimina la revision (revi1)--");
        tv1.eliminarRevision(revi1);
        System.out.println();

        System.out.println("--A tv2 se le añade la revision (revi2)--");
        tv2.addRevision(revi2);
        System.out.println();

        System.out.println("--Las revisiones de tv2 son:--");
        tv2.mostrarRevisiones();
        System.out.println();

        System.out.println("--A alt_movil se le añade la revision (revi1)--");
        alt_movil.addRevision(revi1);
        alt_movil.mostrarRevisiones();
        System.out.println();

        System.out.println("--Hay " + Altavoz.getCont_altavoces() + " altavoces--");
        System.out.println();

        System.out.println("--A alt_empo se le añade la revision (revi1) y (revi2) y las muestras--");
        alt_empo.addRevision(revi1);
        alt_empo.addRevision(revi2);
        alt_empo.mostrarRevisiones();
        System.out.println();

        System.out.println("--A alt_empo le eliminamos la (revi1) y la muestra");
        alt_empo.eliminarRevision(revi1);
        alt_empo.mostrarRevisiones();
        System.out.println();

        System.out.println("--A alt_tras le añadimos la revision (revi2)--");
        alt_trase.addRevision(revi2);
        alt_trase.mostrarRevisiones();
        System.out.println();

        System.out.println("--Activamos graves--");
        alt_trase.activarGraves();
        alt_empo.activarGraves();

    }
}
