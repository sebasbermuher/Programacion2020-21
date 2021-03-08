package UNIDAD5.Examen1920;

import java.util.Comparator;

public class compararDiluir implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return ((Minecraft) o1).capDiluirse - ((Minecraft) o2).capDiluirse;
    }
}