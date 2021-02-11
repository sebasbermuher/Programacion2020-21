package UNIDAD5.Tarea1.Ejercicio6;

import UNIDAD5.Tarea1.Ejercicio5.instrumento;

public class campana extends instrumento {

    public campana() {
        super();
    }

    @Override
    public void interpretar() {
        for (int i = 0; i < numNotas; i++) {
            switch (notas[i]) {
                case DO:
                    System.out.println("Do de campana");
                    break;
                case RE:
                    System.out.println("Re de campana");
                    break;
                case MI:
                    System.out.println("Mi de campana");
                    break;
                case FA:
                    System.out.println("Fa de campana");
                    break;
                case SOL:
                    System.out.println("Sol de campana");
                    break;
                case LA:
                    System.out.println("La de campana");
                    break;
                case SI:
                    System.out.println("Si de campana");
                    break;
            }
        }
    }
}