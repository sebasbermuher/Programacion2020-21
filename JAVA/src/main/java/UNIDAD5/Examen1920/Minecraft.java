package UNIDAD5.Examen1920;

public class Minecraft extends Materiales{

    private String es;
    public Minecraft(String nombre, int masa, int capQuemar, int capDiluirse, boolean movil, Object tipo) {
        this.nombre=nombre;
        if (masa >= 0 && masa <= 1000) {
            this.masa=masa;
        } else {
            this.masa=500;
        }

        if (capQuemar >= 0 && capQuemar <= 100) {
            this.capQuemar=capQuemar;
        } else {
            this.capQuemar=50;
        }
        if (capDiluirse >= 0 && capDiluirse <= 100) {
            this.capDiluirse=capDiluirse;
        } else {
            this.capDiluirse=50;
        }

        this.movil=movil;
        this.tipo=tipo;
        if(movil) {
            es="si";
        }else {
            es="no";
        }
    }

    public void borrarMaterialSinMasa(){
        //Borrar material sin masa
    }
    public void mostrarEstado() {
        //Muestra el estado del material
    }

    @Override
    public boolean equals(Object obj) {
        return masa==((Materiales) obj).masa;
    }

    @Override
    public String toString() {
        return "El material " + nombre + " con masa " + masa + " tiene una capacidad de "
                + capQuemar + " para quemar y " + capDiluirse + " para diluirse. Es movil: "
                + es;
    }
}