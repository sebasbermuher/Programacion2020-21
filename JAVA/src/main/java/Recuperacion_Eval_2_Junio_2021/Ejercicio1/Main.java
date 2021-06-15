package Recuperacion_Eval_2_Junio_2021.Ejercicio1;


public class Main {
    public static void main(String[] args) {
        Optica optica = new Optica();
        Montura montura1 = new Montura("Rayban",Material_Montura.METAL,"Negras");
        Lente lente1 = new Lente(Problema_Visual.ASTIGMATISMO,25.7);

        GafaGraduada gafaGraduada = new GafaGraduada(montura1,lente1,60.75);

        GafasDeSol gafaSol= new GafasDeSol(50,true);

        optica.addGafaGraduada(gafaGraduada);
        optica.addGafaDeSol(gafaSol);

        optica.eliminarGafaGraduada(gafaGraduada);
        optica.eliminarGafaDeSol(gafaSol);

        System.out.println("Total de gafas vendidas = " + Gafa.getCont_gafas());

        System.out.println("Total ventas gafas = "+ (GafaGraduada.getPrecio_venta()+GafasDeSol.getPrecio_venta()));


        gafaSol.Promocion();


}
}
