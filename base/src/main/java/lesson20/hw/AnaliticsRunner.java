package lesson20.hw;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.*;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;


public class AnaliticsRunner {
    public static void main(String[] args) throws Exception {

        try (InputStream inputStream = lesson20.hw.AnaliticsRunner.class.getResourceAsStream("/employee.xml")) {
            Document xmlDocument = getXML(inputStream);
            XPath xPath = XPathFactory.newInstance().newXPath();
            String expression = "//employee/position[@salary<'100']";

            double avg = (Double) xPath
                    .compile("sum(//employee/position/@salary)" + "div count(//employee/position)")
                    .evaluate(xmlDocument, XPathConstants.NUMBER);
            String avgCorrect = String.format("%.2f", avg);
            System.out.println("Средняя зарплата в ООО Рога и копыта: " + avgCorrect);

            List<Node> richEmployee = getRichEmployee(xmlDocument, xPath, avg);
            System.out.println("Зарплату выше средней получают сотрудники: \n " + richEmployee);

        } catch (IllegalArgumentException e) {
            System.out.println("Файл  employee.xml не найден в папке /resources");
            System.out.println("Чтобы его сформировать, необходимо запустить EmployeeRunner.java");
        }
    }

    private static Document getXML(InputStream inputStream) throws ParserConfigurationException, SAXException, IOException {
        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = builderFactory.newDocumentBuilder();
        return builder.parse(inputStream);
    }

    private static List<Node> getRichEmployee(Document doc, XPath xPath, double value) {
        List<Node> list = new ArrayList<>();
        try {
            XPathExpression xPathExpression = xPath.compile(
                    "//employee/position[@salary >" + value + "]"
            );
            NodeList nodeList = (NodeList) xPathExpression.evaluate(doc, XPathConstants.NODESET);
            for (int i = 0; i < nodeList.getLength(); i++)
                list.add(nodeList.item(i)
                        .getParentNode()
                        .getAttributes()
                        .getNamedItem("FIO"));

        } catch (XPathExpressionException e) {
            e.printStackTrace();
        }
        return list;

    }
}
