package Recuperacion_Eval_2_Mayo_2021.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        AltavozTV tv=new AltavozTV(1,5,10,TipoInterfaz.BLUETOOH);
        AltavozMovil movil=new AltavozMovil(2,6,9,200);
        Revision rev1=new Revision("15-08-2019",false,70);
        Revision rev2=new Revision("07-11-2020",true,59);

        System.out.println(Altavoz.numAltavocesCreados());

        //tv.addReview(rev1);
        //tv.addReview(rev2);
       System.out.println(tv);
        tv.mostrarRevisiones(tv);


       System.out.println(tv.delReview(rev1));
        System.out.println(tv);


    }
}