package UNIDAD9.U8U9_Examen.Ejercicio1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ModificandoDOM {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca los datos del nuevo libro:");
        System.out.println("Titulo:");
        String titulo = teclado.nextLine();
        System.out.println("Autor");
        String autor = teclado.nextLine();
        System.out.println("Ediorial:");
        String editorial=teclado.nextLine();
        System.out.println("Paginas:");
        int paginas = teclado.nextInt();
        System.out.println();

        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document docu = db.parse(new File("JAVA/src/main/java/UNIDAD9/U8U9_Examen/Ejercicio1/biblioteca.xml"));

            Element root = docu.getDocumentElement();
            NodeList nodos = root.getChildNodes();


            Element libro_xml = docu.createElement("libro");
            Element titulo_xml = docu.createElement("titulo");
            titulo_xml.setTextContent(titulo);

            Element autor_xml = docu.createElement("autor");
            autor_xml.setTextContent((autor));

            Element editorial_xml = docu.createElement("editorial");
            editorial_xml.setTextContent((editorial));

            Element paginas_xml = docu.createElement("paginas");
            paginas_xml.setTextContent(Integer.toString(paginas));

            libro_xml.appendChild(titulo_xml);
            libro_xml.appendChild(autor_xml);
            libro_xml.appendChild(editorial_xml);
            libro_xml.appendChild(paginas_xml);
            root.appendChild(libro_xml);

            //inserta el nuevo nodo pais
            for (int i = 0; i < nodos.getLength(); i++){
                if(nodos.item(i).getNodeType()== Node.ELEMENT_NODE){
                    Element pais_xml = docu.createElement("pais");
                    pais_xml.setTextContent("España");
                    nodos.item(i).appendChild(pais_xml);
                }
            }

            nuevo_xml(docu);

        } catch (ParserConfigurationException | IOException | SAXException e) {
            e.printStackTrace();
        }
    }

    //Funcion para crear el nuevo archivo xml (ejercicio2.xml)
    public static void nuevo_xml (Document doc){
        try {
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer nuevo_xml = tf.newTransformer();

            nuevo_xml.setOutputProperty( OutputKeys.INDENT, "yes" );
            nuevo_xml.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            nuevo_xml.setOutputProperty( OutputKeys.OMIT_XML_DECLARATION, "no" );
            nuevo_xml.setOutputProperty( OutputKeys.METHOD, "xml" );
            nuevo_xml.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

            Element root = doc.getDocumentElement();
            DOMSource origen = new DOMSource(root);

            File nuevo_doc = new File("JAVA/src/main/java/UNIDAD9/U8U9_Examen/Ejercicio1/ejercicio2.xml");
            StreamResult destino = new StreamResult(nuevo_doc);

            nuevo_xml.transform(origen, destino);

        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        }
    }
}

