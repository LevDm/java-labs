package lab_8.Example_1;

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

import java.io.File;


public class Task_XMLParser {
    public static void main(String[] args) {
        try {
            File inputFile = new File("src/lab_8/employees.xml");

            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

            System.out.println("Корневой элемент: " + doc.getDocumentElement().getNodeName());
            NodeList nodeList = doc.getElementsByTagName("employee");
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                System.out.println("\nТекущий элемент: " + node.getNodeName());

                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    System.out.println("Имя: " + element.getElementsByTagName("name").item(0).getTextContent());
                    System.out.println("Должность: " + element.getElementsByTagName("position").item(0).getTextContent());
                }
            }

            // Добавление нового элемента
            Element newEmployee = doc.createElement("employee");
            newEmployee.appendChild(createAndAppendElement(doc, "name", "New Employee"));
            newEmployee.appendChild(createAndAppendElement(doc, "position", "New Position"));
            doc.getDocumentElement().appendChild(newEmployee);

            // Поиск и удаление элемента по имени и должности
            Node employeeToRemove = findEmployeeByNameAndPosition(doc, "", "Manager");
            if (employeeToRemove != null) {
                employeeToRemove.getParentNode().removeChild(employeeToRemove);
                System.out.println("Элемент удален" + employeeToRemove.getTextContent());
            } else {
                System.out.println("Элемент 'Manager' не найден.");
            }

            // Запись данных в XML-файл
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("src/lab_8/employees_updated.xml"));
            transformer.transform(source, result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static Element createAndAppendElement(Document doc, String tagName, String textContent) {
        Element element = doc.createElement(tagName);
        element.appendChild(doc.createTextNode(textContent));
        return element;
    }

    public static Node findEmployeeByNameAndPosition(Document doc, String name, String position) {
        NodeList nodeList = doc.getElementsByTagName("employee");
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                if (element.getElementsByTagName("name").item(0).getTextContent().equalsIgnoreCase(name)
                        || element.getElementsByTagName("position").item(0).getTextContent().equalsIgnoreCase(position)) {
                    return node;
                }
            }
        }
        return null;
    }
}