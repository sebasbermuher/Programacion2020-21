/*
a) Crea un fichero "FichPersona.dat",  y almacena varios objetos persona.
b) Tomando como base el fichero anterior, crea un documento XML usando DOM.
c) Prueba los parsers de la Tarea 1 para comprobar que permiten leer el documento XML que has
   generado en el apartado anterior.
 */
package UNIDAD8.Tarea2;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.concurrent.TransferQueue;
import java.util.stream.Stream;

public class main {
    public static void main(String[] args) {
        Persona p1 = new Persona("Sebas", 21);
        Persona p2 = new Persona("Ana", 22);

        try{
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db =dbf.newDocumentBuilder();
            Document doc = (Document) db.newDocument();
            Element root = doc.createElement("Personas"); //Elemento raiz
            Element ele1 = doc.createElement("Nombre"); //Elemento dentro de la raiz
            doc.appendChild(root); //escribe el elemento en el doc
            Element personas = doc.createElement("Persona");
            Element personas1 = doc.createElement("Persona");
            ele1.setTextContent(p1.getNombre()); //Anido el contenido al elemento1
            Element ele2 = doc.createElement("Edad"); //Crea un segundo elemento
            ele2.setTextContent(String.valueOf(p1.getEdad()));//Añade el contenido

            Element ele3 = doc.createElement("Nombre"); //Elemento dentro de la raiz
            ele3.setTextContent(p2.getNombre()); //Anido el contenido al elemento1
            Element ele4 = doc.createElement("Edad"); //Crea un segundo elemento
            ele4.setTextContent(String.valueOf(p2.getEdad()));//Añade el contenido

            personas.appendChild(ele1);
            personas.appendChild(ele2);
            personas1.appendChild(ele3);
            personas1.appendChild(ele4);
            root.appendChild(personas);
            root.appendChild(personas1);
            root.appendChild(personas);
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer t = tf.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult resultado = new StreamResult(new File("JAVA/src/main/java/UNIDAD8/Tarea2/FichPersona.dat"));
            t.transform(source,resultado);

        }
        catch (ParserConfigurationException | TransformerException e){
            System.out.println("Error");
    }

}
}
