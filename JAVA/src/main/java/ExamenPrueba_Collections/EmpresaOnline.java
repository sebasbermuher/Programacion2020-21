package ExamenPrueba_Collections;

import java.io.*;
import java.util.*;

public class EmpresaOnline implements Serializable{

    private Map<Integer, Set<PedidosOnline>> onlines;
    protected String nombre_empresa;

    public EmpresaOnline(String nombre_empresa) {
        this.nombre_empresa = nombre_empresa;
        onlines = new LinkedHashMap<>();
    }

    public Map<Integer, Set<PedidosOnline>> getOnlines() {
        return onlines;
    }

    public void setOnlines(Map<Integer, Set<PedidosOnline>> onlines) {
        this.onlines = onlines;
    }

    public String getNombre_empresa() {
        return nombre_empresa;
    }

    public void setNombre_empresa(String nombre_empresa) {
        this.nombre_empresa = nombre_empresa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmpresaOnline that = (EmpresaOnline) o;
        return Objects.equals(nombre_empresa, that.nombre_empresa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre_empresa);
    }

    @Override
    public String toString() {
        return "EmpresaOnline " + "\n"+
                "  onlines: " + onlines + "\n"+
                "  nombre de empresa: " + nombre_empresa ;
    }

    public void CargarPedidosOnline (){

        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("online.dat"));

            while(true){

                ois.readObject();

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void EscribirPedidosOnline (){

        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("online.dat"));

            Collection<Set<PedidosOnline>> conjunto = onlines.values();

            Iterator it = conjunto.iterator();

            while (it.hasNext()){

                Set<PedidosOnline> pedidos = (Set<PedidosOnline>) it.next();

                for (PedidosOnline p: pedidos) {
                    os.writeObject(p);
                }

            }

            os.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void mostrarPedidosOrdenados (){



    }
    public boolean vendidoProducto(int codigo){

        if(onlines.containsValue(codigo)){
            System.out.println("Ese producto ha sido vendido");
            return true;

        } else{
            System.out.println("Ese producto no ha sido vendido");
            return false;
        }

    }




}
