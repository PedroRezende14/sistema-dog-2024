package XML;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class AnimalFormulario extends JFrame {
    private JPanel contentPane;
    private JTextField textFieldNomecao;
    private JTextField textFieldRaca;
    private JTextField textFieldRegistroStudBook;
    private JTextField textFieldCor;
    private JTextField textFieldOrigemRaca;
    private JTextField textFieldCriador;
    private JComboBox<String> comboBoxSexo;
    private File xmlFile; // Arquivo XML

    public void CadastroXML() {
        EventQueue.invokeLater(() -> {
            try {
                AnimalFormulario frame = new AnimalFormulario();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public AnimalFormulario() {
        setTitle("Formulário de Animal");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new GridLayout(0, 2, 10, 10));

        JLabel lblNomecao = new JLabel("Nomeção:");
        contentPane.add(lblNomecao);

        textFieldNomecao = new JTextField();
        contentPane.add(textFieldNomecao);
        textFieldNomecao.setColumns(10);

        JLabel lblRaca = new JLabel("Raça:");
        contentPane.add(lblRaca);

        textFieldRaca = new JTextField();
        contentPane.add(textFieldRaca);
        textFieldRaca.setColumns(10);

        JLabel lblRegistroStudBook = new JLabel("Registro StudBook:");
        contentPane.add(lblRegistroStudBook);

        textFieldRegistroStudBook = new JTextField();
        contentPane.add(textFieldRegistroStudBook);
        textFieldRegistroStudBook.setColumns(10);

        JLabel lblCor = new JLabel("Cor:");
        contentPane.add(lblCor);

        textFieldCor = new JTextField();
        contentPane.add(textFieldCor);
        textFieldCor.setColumns(10);

        JLabel lblOrigemRaca = new JLabel("Origem da Raça:");
        contentPane.add(lblOrigemRaca);

        textFieldOrigemRaca = new JTextField();
        contentPane.add(textFieldOrigemRaca);
        textFieldOrigemRaca.setColumns(10);

        JLabel lblCriador = new JLabel("Criador:");
        contentPane.add(lblCriador);

        textFieldCriador = new JTextField();
        contentPane.add(textFieldCriador);
        textFieldCriador.setColumns(10);

        JLabel lblSexo = new JLabel("Sexo:");
        contentPane.add(lblSexo);

        comboBoxSexo = new JComboBox<>();
        comboBoxSexo.addItem("Masculino");
        comboBoxSexo.addItem("Feminino");
        contentPane.add(comboBoxSexo);

        JButton btnSave = new JButton("Salvar");
        btnSave.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                salvarDadosEmXML(xmlFile);
            }
        });
        contentPane.add(btnSave);

        JButton btnClear = new JButton("Limpar");
        btnClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                limparCampos();
            }
        });
        contentPane.add(btnClear);

        xmlFile = new File("animal.xml"); // Defina o arquivo XML padrão
    }

    private void salvarDadosEmXML(File file) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc;

            
            if (!file.exists()) {
                doc = builder.newDocument();
                Element rootElement = doc.createElement("animais");
                doc.appendChild(rootElement);
            } else {
                doc = builder.parse(file);
            }

            Element rootElement = doc.getDocumentElement();

            Element animalElement = doc.createElement("animal");
            rootElement.appendChild(animalElement);
            
            addElement(doc, animalElement, "nomecao", textFieldNomecao.getText());
            addElement(doc, animalElement, "raca", textFieldRaca.getText());
            addElement(doc, animalElement, "registroStudBook", textFieldRegistroStudBook.getText());
            addElement(doc, animalElement, "cor", textFieldCor.getText());
            addElement(doc, animalElement, "origemRaca", textFieldOrigemRaca.getText());
            addElement(doc, animalElement, "criador", textFieldCriador.getText());
            addElement(doc, animalElement, "sexo", (String) comboBoxSexo.getSelectedItem());

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource domSource = new DOMSource(doc);
            StreamResult streamResult = new StreamResult(file);
            transformer.transform(domSource, streamResult);
            JOptionPane.showMessageDialog(this, "Dados salvos com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao salvar dados: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void addElement(Document doc, Element parent, String tagName, String textContent) {
        Element element = doc.createElement(tagName);
        element.appendChild(doc.createTextNode(textContent));
        parent.appendChild(element);
    }
    
 

    private void limparCampos() {
        textFieldNomecao.setText("");
        textFieldRaca.setText("");
        textFieldRegistroStudBook.setText("");
        textFieldCor.setText("");
        textFieldOrigemRaca.setText("");
        textFieldCriador.setText("");
        comboBoxSexo.setSelectedIndex(0);
    }
}
