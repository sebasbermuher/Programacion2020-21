package UNIDAD5.U5_Entregable;

public class jugadorBaloncesto extends Participante implements Encestar{
    private double altura;

    public jugadorBaloncesto(String nombre, int edad, double altura) {
        super(nombre, edad);
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public void hacerJuramento() {
        System.out.println("Yo "+nombre+", como  jugador de baloncesto, juro los valores deportivos mundiales");
    }

    @Override
    public void encestar() {
        System.out.println("2 puntos");
    }
}
