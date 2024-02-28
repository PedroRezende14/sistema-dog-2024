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
            // Carregar o arquivo XML
            File xmlFile = new File("animal.xml");

            // Criar um construtor de documentos
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            // Parsear o arquivo XML
            Document document = builder.parse(xmlFile);

            // Obter a lista de elementos <animal>
            NodeList animalNodes = document.getElementsByTagName("animal");

            // Iterar sobre os elementos <animal>
            for (int i = 0; i < animalNodes.getLength(); i++) {
                Node animalNode = animalNodes.item(i);
                if (animalNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element animalElement = (Element) animalNode;
                    
                    // Obter os elementos filhos de <animal>
                    String nomecao = animalElement.getElementsByTagName("nomecao").item(0).getTextContent();
                    String raca = animalElement.getElementsByTagName("raca").item(0).getTextContent();
                    String registroStudBook = animalElement.getElementsByTagName("registroStudBook").item(0).getTextContent();
                    String cor = animalElement.getElementsByTagName("cor").item(0).getTextContent();
                    String origemRaca = animalElement.getElementsByTagName("origemRaca").item(0).getTextContent();
                    String criador = animalElement.getElementsByTagName("criador").item(0).getTextContent();
                    String sexo = animalElement.getElementsByTagName("sexo").item(0).getTextContent();

                    // Exibir os dados do animal
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


