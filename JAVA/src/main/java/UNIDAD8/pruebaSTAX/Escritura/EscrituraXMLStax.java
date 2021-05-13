package UNIDAD8.pruebaSTAX.Escritura;

import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class EscrituraXMLStax {
    public static void main(String[] args) {

        ArrayList<Alumno> alumnos = new ArrayList<>();

        //Creo los objeto necesarios para
        Alumno p1 = new Alumno("Sebastian", "Bermudez Herrera");
        Alumno p2 = new Alumno("Isidro", "Perez Padilla");


        //Los añado a la lista
        alumnos.add(p1);
        alumnos.add(p2);


        try {

            //Creo el objeto que me va a servir para escribir
            XMLOutputFactory xmlOutputFactory = XMLOutputFactory.newInstance();
            XMLEventWriter xmlWriter = xmlOutputFactory.createXMLEventWriter(new FileOutputStream("JAVA/src/main/java/pruebaSTAX/alumnos.xml"));

            //Creo el objeto que me va a servir para crear los eventos
            XMLEventFactory eventFactory = XMLEventFactory.newInstance();

            //Creo el evento de principio de documento y lo escribo con el objeto escritor
            StartDocument startDocument = eventFactory.createStartDocument();
            xmlWriter.add(startDocument);

            //Creo el evento para introducir el salto de línea y el de salto de línea con tabulador
            //Los usaré para maquetar el fichero correctamente (aunque no son estrictamente necesarios)
            Characters saltoDeLinea = eventFactory.createCharacters("\n");
            Characters saltoDeLineaTab = eventFactory.createCharacters("\n\t");
            Characters tabulador = eventFactory.createCharacters("\t");
            xmlWriter.add(saltoDeLinea);



            //Creo el evento necesario para crear la etiqueta raíz pedidos
            StartElement pedidosStartElement = eventFactory.createStartElement("","","alumnos");
            xmlWriter.add(pedidosStartElement);
            xmlWriter.add(saltoDeLineaTab);

            //Recorro pedidos y voy creando las etiquetas (eventos) necesarias para cada uno de elllas

            //Esta variable la creo para controlar si es el último de los pedidos ya que querré diferente salida
            int longitud = 0;

            for (Alumno p : alumnos) {

                //Creo todas las etiquetas de apertura  que va a tener cada uno de los pedidos
                StartElement alumnoStart = eventFactory.createStartElement("","","alumno");
                StartElement nombreStart = eventFactory.createStartElement("","","nombre");
                StartElement apellidosStart = eventFactory.createStartElement("","","apellidos");






                //Creo todas las etiquetas de cierre que va a tener cada uno de los pedidos
                EndElement alumnoEnd = eventFactory.createEndElement("","","alumno");
                EndElement nombreEnd = eventFactory.createEndElement("","","nombre");
                EndElement apellidosEnd = eventFactory.createEndElement("","","apellidos");


                //Creo los contenidos
                Characters nombre = eventFactory.createCharacters(p.getNombre());
                Characters apellidos  = eventFactory.createCharacters(p.getApellidos());



                //Añado todos los elementos correspondientes a un pedido en el orden que es necesario
                xmlWriter.add(alumnoStart);

                //Añado el atributo
                //xmlWriter.add(id);

                xmlWriter.add(saltoDeLineaTab);
                xmlWriter.add(tabulador);

                //Lo hijos de cada pedido
                xmlWriter.add(nombreStart);
                xmlWriter.add(nombre);
                xmlWriter.add(nombreEnd);
                xmlWriter.add(saltoDeLineaTab);
                xmlWriter.add(tabulador);
                xmlWriter.add(apellidosStart);
                xmlWriter.add(apellidos);
                xmlWriter.add(apellidosEnd);
                xmlWriter.add(saltoDeLineaTab);

                //Cierro el pedido que estoy escribiendo
                xmlWriter.add(alumnoEnd);

                //En el último quiero un tratamiendo diferente
                if (longitud == alumnos.size() - 1) {
                    xmlWriter.add(saltoDeLinea);
                } else {
                    xmlWriter.add(saltoDeLineaTab);
                }
                longitud++;

            }



            //Creo el evento necesario para cerrar la etiqueta raíz pedidos
            EndElement pedidosEndElement = eventFactory.createEndElement("","","alumnos");
            xmlWriter.add(pedidosEndElement);
            xmlWriter.add(saltoDeLinea);



            //Creo el evento de finalización del documento y lo escribo con el objeto escritor
            EndDocument endDocument = eventFactory.createEndDocument();
            xmlWriter.add(endDocument);
            xmlWriter.close();// <<- ¡¡IMPORTANTE!! para que genere contenido en el XML nuevo


        } catch (XMLStreamException | FileNotFoundException e) {
            System.out.println(e.getStackTrace());
        }


    }
}
