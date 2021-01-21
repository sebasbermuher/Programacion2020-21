package UNIDAD4.U4_Entregable;

public class Personaje {
    String nombre;
    double movimiento;
    int dano_punetazo;
    int dano_patadas;

    public Personaje (String nombre, double movimiento, int dano_punetazo, int dano_patadas){
        this.nombre=nombre;
        this.movimiento=movimiento;
        this.dano_punetazo=dano_punetazo;
        this.dano_patadas=dano_patadas;
    }

    public void mostrarInfo(){
        System.out.println(this.nombre+" "+this.movimiento+" "+this.dano_punetazo+" "+this.dano_patadas);

    }
}
