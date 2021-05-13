package UNIDAD8.pruebaSTAX.Lectura;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class LecturaXMLStax {

    public static void main(String[] args) {

        //Voy a rellenar esta estructura de datos con los datos del fichero XML
        ArrayList<Alumno> alumnos = new ArrayList<>();
        Alumno alumnoActual = null;
        String tagActual="";


        try {
            //Obtenemos el lector de XML
            XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
            XMLEventReader xmlReader = xmlInputFactory.createXMLEventReader(new FileInputStream("JAVA/src/main/java/pruebaSTAX/Lectura/alumnos.xml"));

            //Recorro la lista de eventos. Soy yo el que los va obteniendo PULL con nextEvent()
            while (xmlReader.hasNext()){

                //Obtengo el evento siguiente que voy a tratar
                XMLEvent xmlEvent = xmlReader.nextEvent();

                //Es un evento de apertura de etiqueta
                if (xmlEvent.isStartElement()) {

                    //Si he recibido el evento de comiento de una etiqueta
                    //Obtengo la información de la etiqueta
                    StartElement startTag = xmlEvent.asStartElement();

                    //Inicio la apertura de la etiqueta pero no lo cierro por si tiene atributos
                    System.out.print("<"+ startTag.getName().getLocalPart());

                    //Dependiendo de el nombre la etiqueta
                    //Establezco tagActual al nombre de la etiqueta que he detectado
                    String tagName = startTag.getName().getLocalPart();
                    switch (tagName) {
                        case "alumno" :

                            //Empieza un pedido tengo que crear el objeto para añadirlo
                            //posteriormente al ArrayList
                            alumnoActual = new Alumno();
                            tagActual = "alumno";

                            //Es la única etiqueta que tiene atributos
                            //Si tuviera varios
                            //Iterator it = startTag.getAttributes();
                            //Tendría que recorrerlo como hemos hecho hasta ahora
                            Attribute id = startTag.getAttributeByName(new QName("id"));

                            alumnoActual.setId(Integer.valueOf(id.getValue()));

                            System.out.print(" "+id.getName()+"=\""+id.getValue()+"\"");
                            break;

                        case "nombre" :
                            //Establezco cuál es la etiqueta que estoy tratando
                            tagActual = "nombre";
                            break;

                        case "apellidos" :
                            //Establezco cuál es la etiqueta que estoy tratando
                            tagActual = "apellidos";
                            break;
                    }

                    //Cierro la etiqueta de apertura
                    System.out.print(">");

                } else if (xmlEvent.isEndElement()) {

                    //Si he recibido el evento de fin de una etiqueta
                    //Muestro la etiqueta de cierre
                    EndElement endtag = xmlEvent.asEndElement();
                    System.out.println("<\\" + endtag.getName().getLocalPart()+">");

                    //Si estoy cerrando pedido ya tengo el pedido relleno lo añado a la lista
                    if (endtag.getName().getLocalPart().equals("alumno")) {
                        alumnos.add(alumnoActual);
                    }

                    //Ya no estoy dentro de ninguna de las etiquetas
                    tagActual = "";

                } else if (xmlEvent.isStartDocument()) {
                    System.out.println("Comienzo del parseado del documento");
                    System.out.println("-----------------------------------");

                } else if (xmlEvent.isEndDocument()) {
                    System.out.println("-----------------------------------");
                    System.out.println("Fin del parseado del documento");
                    System.out.println();

                } else if (xmlEvent.isCharacters()) {

                    //Estoy en un nodo de texto
                    Characters texto = xmlEvent.asCharacters();

                    //No es un salto de línea Estoy suponiendo que el texto de las etiquetas nodo no lleva un salto
                    // de línea
                    if (!texto.getData().contains("\n")) {
                        System.out.print(texto.getData());
                    }

                    //Añado el texto de dentro de las etiquetas al objeto que estoy creando (alumnoActual)
                    if (!tagActual.equals("")) {
                        switch (tagActual) {
                            case "nombre" :
                                alumnoActual.setNombre(texto.getData());
                                break;
                            case "apellidos" :
                                alumnoActual.setApellidos(texto.getData());
                                break;
                        }
                    }
                }

            }
        } catch (FileNotFoundException | XMLStreamException e) {
            System.out.println(e.getMessage());
        }

        //Al salir del bloque ya tengo en la lista todos los alumnos
        //Puedo sacarla por pantalla
        System.out.println(alumnos);

    }
}
