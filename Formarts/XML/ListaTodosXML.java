package XML;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import java.io.File;
public class ListaTodosXML {
	
	public void ListaTodos() {
		try {
       
            File xmlFile = new File("animal.xml");

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            Document document = builder.parse(xmlFile);

            NodeList animalNodes = document.getElementsByTagName("animal");

            for (int i = 0; i < animalNodes.getLength(); i++) {
                Node animalNode = animalNodes.item(i);
                if (animalNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element animalElement = (Element) animalNode;
                    
                    String nomecao = animalElement.getElementsByTagName("nomecao").item(0).getTextContent();
                    String raca = animalElement.getElementsByTagName("raca").item(0).getTextContent();
                    String registroStudBook = animalElement.getElementsByTagName("registroStudBook").item(0).getTextContent();
                    String cor = animalElement.getElementsByTagName("cor").item(0).getTextContent();
                    String origemRaca = animalElement.getElementsByTagName("origemRaca").item(0).getTextContent();
                    String criador = animalElement.getElementsByTagName("criador").item(0).getTextContent();
                    String sexo = animalElement.getElementsByTagName("sexo").item(0).getTextContent();

                    System.out.println("Nomeção: " + nomecao);
                    System.out.println("Raça: " + raca);
                    System.out.println("Registro StudBook: " + registroStudBook);
                    System.out.println("Cor: " + cor);
                    System.out.println("Origem da Raça: " + origemRaca);
                    System.out.println("Criador: " + criador);
                    System.out.println("Sexo: " + sexo);
                    System.out.println();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	}


