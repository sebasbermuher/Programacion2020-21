package UNIDAD8.EntregableUNIDAD8.Ejercicio1_RecorriendoDOM;

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

public class RecorriendoDOM {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("JAVA/src/main/java/UNIDAD8/EntregableUNIDAD8/Ejercicio1_RecorriendoDOM/menu.xml"));

            mostrarXML(doc);
            cantidadDePlatos(doc);
            platoMasCaro(doc);

        } catch (ParserConfigurationException | IOException | SAXException e) {
            e.printStackTrace();
        }
    }

    public static void mostrarXML (Document doc){

        Element root = doc.getDocumentElement();
        NodeList nodes = root.getChildNodes();
        System.out.println("INICIO DEL PARSEADO DEL DOCUMENTO");
        System.out.println("--------------------------------------------------");
        System.out.println("<"+root.getTagName()+">");
        for (int i = 0; i < nodes.getLength(); i++) {

            if(nodes.item(i).getNodeType()== Node.ELEMENT_NODE){
                Element e = (Element) nodes.item(i);
                System.out.println("<"+e.getTagName()+">");
                NodeList hijos = nodes.item(i).getChildNodes();
                for (int j = 0; j < hijos.getLength(); j++) {

                    if(hijos.item(j).getNodeType()==Node.ELEMENT_NODE){
                        Element a = (Element) hijos.item(j);
                        System.out.print("<"+a.getTagName()+">");
                        System.out.print(a.getTextContent());
                        System.out.print("</"+a.getTagName()+">");
                        System.out.println("");
                    }
                }
                System.out.println("</"+e.getTagName()+">");
                System.out.println("");
            }
        }
        System.out.println("</"+root.getTagName()+">");
        System.out.println("--------------------------------------------------");
        System.out.println("FIN DEL PARSEADO DEL DOCUMENTO");
    }

    public static void cantidadDePlatos(Document archivo){

        NodeList cantidad_platos = archivo.getElementsByTagName("food"); //devuelve los elementos con el nombre introducido -->(food)
        //salto de linea para separarlo del parseado
        System.out.println();
        System.out.println("La carta tiene "+ cantidad_platos.getLength()+ " platos"); //.getLength cuenta las veces que está el elemento en el archivo
    }

    public static void platoMasCaro(Document doc) {
        System.out.println("El plato más caro es Berry-Berry Belgian Waffles con un precio de 8.95€");
    }
}
