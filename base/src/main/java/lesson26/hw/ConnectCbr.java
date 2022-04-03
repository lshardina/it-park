package lesson26.hw;

import org.springframework.stereotype.Component;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathFactory;
import java.io.IOException;

@Component
public class ConnectCbr {

    private final String expression = "https://www.cbr-xml-daily.ru/daily.xml";

    public XPath getXPath() {
//        URL url = new URL(expression);  ЛИШНЕЕ!!!!!
//        URLConnection urlConnection = url.openConnection();
//        urlConnection.connect();
        XPath xPath = XPathFactory.newInstance().newXPath();
        return xPath;
    }

    public Document getDocument() throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(expression);
        return document;
    }

}
