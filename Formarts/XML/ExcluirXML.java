package XML;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
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
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExcluirXML extends JFrame {
	
	public void ExcluirDog(){
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o nome");
		String delet = entrada.nextLine();
		Excluir(delet);
	}
	
	void Excluir(String nomecao) {
        try {
            File xmlFile = new File("animal.xml");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(xmlFile);
            NodeList animalNodes = doc.getElementsByTagName("animal");
            List<Node> nodesToRemove = new ArrayList<>();

            for (int i = 0; i < animalNodes.getLength(); i++) {
                Node animalNode = animalNodes.item(i);
                if (animalNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element animalElement = (Element) animalNode;
                    String nomecaoElement = animalElement.getElementsByTagName("nomecao").item(0).getTextContent();
                    if (nomecaoElement.equals(nomecao)) {
                        nodesToRemove.add(animalNode);
                    }
                }
            }

         
            for (Node nodeToRemove : nodesToRemove) {
                nodeToRemove.getParentNode().removeChild(nodeToRemove);
            }

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource domSource = new DOMSource(doc);
            StreamResult streamResult = new StreamResult(xmlFile);
            transformer.transform(domSource, streamResult);
            JOptionPane.showMessageDialog(this, "Animal excluído com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao excluir animal: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
    

