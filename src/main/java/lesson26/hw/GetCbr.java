package lesson26.hw;


import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;
import java.io.IOException;


public interface GetCbr {

    String getDate() throws IOException, ParserConfigurationException, SAXException, XPathExpressionException;

    String getCourse(String valute) throws IOException, ParserConfigurationException, SAXException, XPathExpressionException;

    String getNameValute(String valute) throws IOException, ParserConfigurationException, SAXException, XPathExpressionException;

    String getNominal(String valute) throws IOException, ParserConfigurationException, SAXException, XPathExpressionException;

    Boolean existValute(String valute) throws IOException, ParserConfigurationException, SAXException, XPathExpressionException;
}
