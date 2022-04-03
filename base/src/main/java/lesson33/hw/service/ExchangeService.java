package lesson33.hw.service;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;
import java.io.IOException;

public interface ExchangeService {

    String getDate() throws IOException, ParserConfigurationException, SAXException, XPathExpressionException;

    String getCourse(String valute) throws IOException, ParserConfigurationException, SAXException, XPathExpressionException;

    String getNameValute(String valute) throws IOException, ParserConfigurationException, SAXException, XPathExpressionException;

    String getNominal(String valute) throws IOException, ParserConfigurationException, SAXException, XPathExpressionException;

    String countingCourse(String val1, String val2, Integer amount2) throws XPathExpressionException, IOException, ParserConfigurationException, SAXException;
}
