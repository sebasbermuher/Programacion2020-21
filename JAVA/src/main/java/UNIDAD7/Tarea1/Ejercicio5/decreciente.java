package UNIDAD7.Tarea1.Ejercicio5;

import java.util.Comparator;

class decreciente implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        return (Integer)o2-(Integer)o1;
    }
}