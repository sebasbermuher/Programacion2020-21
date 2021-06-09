package PlanRefuerzo_SegundoTrimestre.Ejercicio7;

public abstract class ObjetoInventario {
     String fechaCompra;

    public ObjetoInventario(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }
}
