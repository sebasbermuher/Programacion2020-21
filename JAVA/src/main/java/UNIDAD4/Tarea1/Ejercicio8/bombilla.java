package UNIDAD4.Tarea1.Ejercicio8;

public class bombilla {
    private boolean estado;
    private boolean inGeneral=true;
    public bombilla() {
        estado=false;
    }
    public bombilla(boolean inGeneral) {
        estado=false;
        this.inGeneral=inGeneral;
    }

    public void encender() {
        estado=true;
    }

    public void apagar() {
        estado=false;
    }

    public boolean isInGeneral(boolean inGeneral) {
        this.inGeneral=inGeneral;
        return inGeneral;
    }

    public boolean isEstado() {
        boolean estado2;
        if (inGeneral && estado) {
            estado2=true;
        } else {
            estado2=false;
        }
        return estado2;
    }

    public void mostrarInfo() {
        if (isEstado()) {
            System.out.println("Las bombillas estan encendidas");
        } else {
            System.out.println("Las bombillas estan apagadas");
        }
    }
}
