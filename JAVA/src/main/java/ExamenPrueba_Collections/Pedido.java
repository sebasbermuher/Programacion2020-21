package ExamenPrueba_Collections;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public abstract class Pedido implements Serializable {

    protected int id;
    protected Set<Productos> productos;
    protected String fecha_realizacion;
    protected String fecha_entrega;

    public Pedido(int id, String fecha_realizacion, String fecha_entrega) {
        this.id = id;
        this.fecha_realizacion = fecha_realizacion;
        this.fecha_entrega = fecha_entrega;
        productos = new TreeSet<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Set<Productos> getProductos() {
        return productos;
    }

    public void setProductos(Set<Productos> productos) {
        this.productos = productos;
    }

    public String getFecha_realizacion() {
        return fecha_realizacion;
    }

    public void setFecha_realizacion(String fecha_realizacion) {
        this.fecha_realizacion = fecha_realizacion;
    }

    public String getFecha_entrega() {
        return fecha_entrega;
    }

    public void setFecha_entrega(String fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
    }

    @Override
    public String toString() {
        return " Pedido " + "\n"+
                "  id:" + id +"\n"+
                "  productos: " + productos +"\n"+
                "  fecha de realizacion: " + fecha_realizacion +"\n"+
                "  fecha de entrega: " + fecha_entrega;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pedido pedido = (Pedido) o;
        return id == pedido.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    public void addProductos (Productos product){

        if(productos.contains(product)) {
            for (Productos p : productos) {
                if(p.codigo== product.codigo){
                    p.cantidad++;
                }
            }
        } else{
            productos.add(product);
        }
    }


    public boolean deleteProductos (Productos product){

        if(productos.contains(product)) {

           /* for (Productos p : productos) {
                if(p.codigo== product.codigo){
                    if(p.cantidad>1){
                        p.cantidad--;
                    }
                    if(p.cantidad==1){
                        productos.remove(p);
                    } p.cantidad++;
                }
            }*/

            productos.removeIf(p -> p.codigo == product.codigo);

            return true;
        } else{
            System.out.println("No existe ese producto en este pedido");
            return false;
        }
    }

    public void numPedidos (){

        System.out.println(getId());

    }

    public void calcularTotal(){

        double suma = 0;

        for (Productos p: productos) {

            suma+= p.precio * p.cantidad;
        }

        System.out.println("El total de este pedido es " + suma);
    }


}