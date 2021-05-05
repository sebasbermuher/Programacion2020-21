package UNIDAD8.Tarea1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class ParseadorDOMPersonas {

    public static void main(String[] args) {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newDefaultInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("JAVA/src/main/java/UNIDAD8/Tarea1/personasXML.xml"));

            NodeList nl = doc.getElementsByTagName("personas");

            System.out.println("En este Fichero, tengo " + nl.getLength() + " etiquetas personas.");

            for (int i = 0; i < nl.getLength(); i++) {
                Node nodo = nl.item(i);

                Element e = (Element) nl.item(i);
                System.out.println("Estoy en una Etiqueta: " + e.getTagName());

                if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                    if (nodo.hasChildNodes()) {
                        System.out.println("Y esta Etiqueta, tiene a su vez " + nodo.getChildNodes().getLength() + " Nodos Hijos.");

                        NodeList listaInterior = nodo.getChildNodes();

                        for (int j = 0; j < listaInterior.getLength(); j++) {
                            if (listaInterior.item(j).getNodeType() == Node.ELEMENT_NODE) {
                                Element hijo = (Element) listaInterior.item(j);

                                System.out.println("Uno de los Nodos Hijos, es la Etiqueta " + hijo.getTagName());
                                System.out.println("Cuyo contenido, es:" + hijo.getTextContent());
                            }
                        }
                    }
                }
            }
        } catch (ParserConfigurationException | SAXException | IOException e) {
            System.out.println(e.getStackTrace());
        }
    }
}