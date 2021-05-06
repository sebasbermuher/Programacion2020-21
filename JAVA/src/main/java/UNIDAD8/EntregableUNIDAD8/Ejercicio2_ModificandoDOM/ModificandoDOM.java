package UNIDAD8.EntregableUNIDAD8.Ejercicio2_ModificandoDOM;

import org.w3c.dom.*;
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

        //Añada una nueva comida al menu solicitando los datos al usuario.
        // Yo voy añadir Pizza,5 euros, Plato italiano, 700cal
        System.out.println("INSERTE LOS DATOS DEL NUEVO PLATO DEL MENU");
        System.out.println("-------------------------------------------");

        System.out.println("NOMBRE:");
        String nombre = teclado.nextLine();

        System.out.println("PRECIO");
        double precio = teclado.nextDouble();

        teclado.nextLine();

        System.out.println("DESCRIPCION:");
        String descripcion=teclado.nextLine();

        System.out.println("CALORIAS:");
        int calorias = teclado.nextInt();
        System.out.println("-------------------------------------------");

        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document docu = db.parse(new File("JAVA/src/main/java/UNIDAD8/EntregableUNIDAD8/Ejercicio2_ModificandoDOM/menu.xml"));

            Element root = docu.getDocumentElement();
            NodeList nodes = root.getChildNodes();

            Element food_comida = docu.createElement("food");
            Element name_nombre = docu.createElement("name");
            name_nombre.setTextContent(nombre);

            Element price_precio = docu.createElement("price");
            price_precio.setTextContent(Double.toString(precio));

            Element decrip = docu.createElement("description");
            decrip.setTextContent((descripcion));

            Element calories_as = docu.createElement("calories");
            calories_as.setTextContent(Integer.toString(calorias));

            food_comida.appendChild(name_nombre);
            food_comida.appendChild(price_precio);
            food_comida.appendChild(decrip);
            food_comida.appendChild(calories_as);
            root.appendChild(food_comida);


            //Inserte al final de cada nodo food (incluido el nuevo) la siguiente
            // etiqueta <healthy>true</healthy>
            for (int i = 0; i < nodes.getLength(); i++){
                if(nodes.item(i).getNodeType()== Node.ELEMENT_NODE){
                    Element etiqueta_healthy = docu.createElement("healthy");
                    etiqueta_healthy.setTextContent("true");
                    nodes.item(i).appendChild(etiqueta_healthy);
                }
            }

            nuevo_archivo_xml(docu);

        } catch (ParserConfigurationException | IOException | SAXException e) {
            e.printStackTrace();
        }


    }

    //Escriba todo esto en un fichero llamado ejercicio2.xml

    public static void nuevo_archivo_xml (Document doc){
        try {
            
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer archivo_nuevo = tf.newTransformer();

            archivo_nuevo.setOutputProperty( OutputKeys.INDENT, "yes" );
            archivo_nuevo.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            archivo_nuevo.setOutputProperty( OutputKeys.OMIT_XML_DECLARATION, "no" );
            archivo_nuevo.setOutputProperty( OutputKeys.METHOD, "xml" );
            archivo_nuevo.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

            Element root = doc.getDocumentElement();
            DOMSource origenDOM = new DOMSource(root);

            File nuevo_doc = new File("JAVA/src/main/java/UNIDAD8/EntregableUNIDAD8/Ejercicio2_ModificandoDOM/ejercicio2.xml");
            StreamResult destinoDOM = new StreamResult(nuevo_doc);

            archivo_nuevo.transform(origenDOM, destinoDOM);

        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        }
    }
}
