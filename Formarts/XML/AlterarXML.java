package XML;

import java.io.File;
import java.util.Date;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


public class AlterarXML {
	 private static final String XML_FILE_PATH = "animais.xml";
	 
	 public void AlterarDog(){
		 //Alterar();
	 }
	 
	 public void Alterar(String nomeCao, String raca, String registroStudBook, String cor, String origemRaca, String criador, String sexo) {
		 try {
	            File xmlFile = new File(XML_FILE_PATH);
	            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	            DocumentBuilder builder = factory.newDocumentBuilder();
	            Document doc = builder.parse(xmlFile);

	            NodeList animalNodes = doc.getElementsByTagName("animal");

	            for (int i = 0; i < animalNodes.getLength(); i++) {
	                Node animalNode = animalNodes.item(i);
	                if (animalNode.getNodeType() == Node.ELEMENT_NODE) {
	                    Element animalElement = (Element) animalNode;
	                    String nomeCaoElement = animalElement.getElementsByTagName("nomecao").item(0).getTextContent();
	                    if (nomeCaoElement.equals(nomeCao)) {
	          
	                        Element racaElement = (Element) animalElement.getElementsByTagName("raca").item(0);
	                        racaElement.setTextContent(raca);
	                        
	                        Element registroStudBookElement = (Element) animalElement.getElementsByTagName("registroStudBook").item(0);
	                        registroStudBookElement.setTextContent(registroStudBook);
	                        
	                        Element corElement = (Element) animalElement.getElementsByTagName("cor").item(0);
	                        corElement.setTextContent(cor);
	                        
	                        Element origemRacaElement = (Element) animalElement.getElementsByTagName("origemRaca").item(0);
	                        origemRacaElement.setTextContent(origemRaca);
	                        
	                        Element criadorElement = (Element) animalElement.getElementsByTagName("criador").item(0);
	                        criadorElement.setTextContent(criador);
	                        
	                        Element sexoElement = (Element) animalElement.getElementsByTagName("sexo").item(0);
	                        sexoElement.setTextContent(sexo);
	                    }
	                }
	            }

	            TransformerFactory transformerFactory = TransformerFactory.newInstance();
	            Transformer transformer = transformerFactory.newTransformer();
	            DOMSource domSource = new DOMSource(doc);
	            StreamResult streamResult = new StreamResult(xmlFile);
	            transformer.transform(domSource, streamResult);

	            System.out.println("Informações do animal alteradas com sucesso!");
	        } catch (Exception e) {
	            e.printStackTrace();
	            System.err.println("Erro ao alterar informações do animal: " + e.getMessage());
	        }
		 
	 }
	 
}
