/*
Implementar las clases con sus atributos y constructores para gestionar una empresa ferroviaria,
 en la que se distingues dos grandes grupos: personal y maquinaria. En el primero se ubican
 todos los empleados de la empresa, que se clasifican en 3 grupos: maquinistas, mecánicos y
 jefes de estación. De cada uno de ellos hay que guardar:
Maquinistas: nombre completo, dni, sueldo mensual, rango
Mecánicos: nombre completo, tlfno y especialidad (frenos, hidráulica,...)
Jefes estación: nombre completo, dni.
En cuestión de maquinaria podemos encontrar trenes, locomotoras, y vagones. De cada uno hay que
considerar:
Vagones: tienen una capacidad máxima de carga (en kilos), una capacidad actual (carga en un
momento dado), y el tipo de mercancía con el que están cargados.
Locomotoras:disponen de una matrícula, potencia de su motor y un año de fabricación.
Cada locomotora tiene asignado un mecánico que se encarga de su mantenimiento.
Trenes:están formados por una locomotora y un máximo de 5 vagones. Cada tren tiene asignado un
maquinista que es responsable de él.
Todas las clases correspondientes al personal serán de uso público. Entre las clases relativas a
la maquinaria solo será posible construir, desde clases externas, objetos tipo Tren y de
tipo Locomotora. La clase Vagon será solo visible por sus clases vecinas.
 */
package UNIDAD4.Tarea1.Ejercicio9;
public class main {
    public static void main(String[] args) {

        maquinista conductor = new maquinista("Adrian", "12345678A", 1000, " Medio ");
        mecanico meca = new mecanico("Raul", 661584697, "Motores");
        jefe jefe = new jefe("Sergio", "87654321N");
        locomotora locomotor = new locomotora("1697DOI", 500, 2005, meca);
        tren trenecito = new tren(locomotor, conductor);
        vagon vagon1 = new vagon(100, 150, "Textil");
        trenecito.anadirVagon(vagon1);

        System.out.print("Informacion del tren: ");
        trenecito.mostrarInfo();
        System.out.println();
    }
}
