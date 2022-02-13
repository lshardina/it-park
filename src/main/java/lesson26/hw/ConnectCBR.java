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
import java.net.URL;
import java.net.URLConnection;

@Component
public class ConnectCBR {

    private final String expression = "https://www.cbr-xml-daily.ru/daily.xml";

    public XPath getxPath() throws IOException {
        URL url = new URL(expression);
        URLConnection urlConnection = url.openConnection();
        urlConnection.connect();
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
