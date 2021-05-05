package UNIDAD8.Tarea3;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

public class ModificandoArbol {
    public static void main(String[] args) {

        try {

            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();

            Document doc = db.parse(new File("JAVA/src/main/java/UNIDAD8/Tarea3/personasXML.xml"));

            Node root = doc.getDocumentElement();

            Text saltoLinea = doc.createTextNode("\n");

            Comment comentario = doc.createComment("Escribe la lista de personas");

            Element primeraPersona = (Element) doc.getElementsByTagName("persona").item(0);


            root.insertBefore(comentario,primeraPersona);


            Element persona = doc.createElement("persona");
            persona.setAttribute("id","4");

            Element nombre = doc.createElement("nombre");
            nombre.setTextContent("Sebas");

            Element edad = doc.createElement("edad");
            edad.setTextContent("21");
            persona.appendChild(nombre);
            persona.appendChild(edad);
            root.appendChild(persona);


            NodeList nl = doc.getElementsByTagName("persona");
            Node node = nl.item(nl.getLength()-1);
            Element personaClonada = (Element) node.cloneNode(true);


            personaClonada.setAttribute("id","5");


            root.appendChild(personaClonada);


            Element segundaPersona = (Element) doc.getElementsByTagName("persona").item(1);
            root.removeChild(segundaPersona);

            root.replaceChild(personaClonada,primeraPersona);

            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();

            transformer.setOutputProperty( OutputKeys.INDENT, "yes" );
            transformer.setOutputProperty("{http://xml.apache.org/xslt%7Dindent-amount", "4");
            transformer.setOutputProperty( OutputKeys.OMIT_XML_DECLARATION, "no" );
            transformer.setOutputProperty( OutputKeys.METHOD, "xml" );
            transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

            DOMSource origenDOM = new DOMSource(root);

            File nuevoPersonas = new File("JAVA/src/main/java/UNIDAD8/Tarea3/nuevoPersonasXML.xml");
            StreamResult destino = new StreamResult(nuevoPersonas);

            transformer.transform(origenDOM,destino);

        } catch (ParserConfigurationException | IOException | SAXException
                | TransformerException e) {
            System.out.println(e.getStackTrace());
        }
    }
}