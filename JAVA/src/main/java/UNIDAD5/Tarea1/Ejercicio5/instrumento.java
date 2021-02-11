/*
Crear la clase Instrumento, que es una clase abstracta que almacena un máximo de 100 notas musicales.
Mientras haya sitio es posible añadir nuevas notas musicales, al final, con el método add().
La clase también dispone del método abstracto interpretar() que en cada subclase que herede de Instrumento,
mostrará por consola las notas musicales según las interprete. Utilizar enumerados para definir las
notas musicales.
 */
package UNIDAD5.Tarea1.Ejercicio5;

public abstract class instrumento {
    public enum Nota { DO, RE, MI, FA, SOL, LA, SI}

    protected Nota notas[];
    protected int numNotas;

    public instrumento() {
        notas = new Nota[100];
        numNotas=0;
    }

    public void add(Nota n) {
        if (numNotas<notas.length) {
            notas[numNotas] = n;
            numNotas++;
        }
    }
    public abstract void interpretar();
}