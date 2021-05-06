package UNIDAD8.EntregableUNIDAD8.Ejercicio3_STAX;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class RecorriendoSTAX {
    public static void main(String[] args) {
        try {
            XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
            XMLEventReader xmlReader = xmlInputFactory.createXMLEventReader(new FileInputStream("JAVA/src/main/java/UNIDAD8/EntregableUNIDAD8/Ejercicio3_STAX/menu.xml"));

            int total_platos=0;
            int calorias_totales=0;

            ////Establezco tagActual al nombre de la etiqueta que he detectado
            String tagActual="";

            while (xmlReader.hasNext()){
                XMLEvent xmlEvent = xmlReader.nextEvent();
                if (xmlEvent.isStartElement()){
                    StartElement startTag = xmlEvent.asStartElement();
                    if (startTag.getName().getLocalPart().equals("food")) {
                        total_platos++;
                    }
                    if (startTag.getName().getLocalPart().equals("calories")){
                        tagActual="calories";
                    }

                }else if (xmlEvent.isEndElement()){

                    EndElement endtag = xmlEvent.asEndElement();
                    if (endtag.getName().getLocalPart().equals("calories")) {
                        tagActual = ""; //ya no estoy dentro de ninguna de las etiquetas
                    }

                } else if (xmlEvent.isCharacters()){
                    //Estoy en un nodo texto
                    Characters texto = xmlEvent.asCharacters();

                    if(tagActual.equals("calories")){
                        //se suman todas las calorias del "texto" calories
                        calorias_totales += Double.valueOf(texto.getData()) ;
                    }
                }
            }

            System.out.println("El menu tiene " + total_platos + " platos");
            System.out.println("Si pedimos 1 plato de cada uno tomaremos " + calorias_totales + " calorias.");

        } catch (XMLStreamException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
