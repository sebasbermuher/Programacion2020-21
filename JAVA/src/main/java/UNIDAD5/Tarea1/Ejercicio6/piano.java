package UNIDAD5.Tarea1.Ejercicio6;
import UNIDAD5.Tarea1.Ejercicio5.instrumento;

public class piano extends instrumento {

    public piano() {
        super();
    }

    @Override
    public void interpretar() {
        for (int i = 0; i < numNotas; i++) {
            switch (notas[i]) {
                case DO:
                    System.out.println("Do de piano");
                    break;
                case RE:
                    System.out.println("Re de piano");
                    break;
                case MI:
                    System.out.println("Mi de piano");
                    break;
                case FA:
                    System.out.println("Fa de piano");
                    break;
                case SOL:
                    System.out.println("Sol de piano");
                    break;
                case LA:
                    System.out.println("La de piano");
                    break;
                case SI:
                    System.out.println("Si de piano");
                    break;
            }
        }
    }

}