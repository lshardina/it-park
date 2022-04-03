package lesson26.hw;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;
import java.io.IOException;

@Component
@RequiredArgsConstructor
public class CBR implements GetCbr {

    private final ConnectCbr connectCbr;

    @Override
    public String getDate() throws IOException, ParserConfigurationException, SAXException, XPathExpressionException {
        String date = "/ValCurs/@Date";
        String currentDate = connectCbr.getXPath().evaluate(date, connectCbr.getDocument());
        return currentDate;
    }

    @Override
    public String getCourse(String valute) throws IOException, ParserConfigurationException, SAXException, XPathExpressionException {
        String code = "/ValCurs/Valute[CharCode='" + valute + "']/Value/text()";
        String course = connectCbr.getXPath().evaluate(code, connectCbr.getDocument());
        return course;
    }

    @Override
    public String getNameValute(String valute) throws IOException, ParserConfigurationException, SAXException, XPathExpressionException {
        String name = "/ValCurs/Valute[CharCode='" + valute + "']/Name/text()";
        String nameValute = connectCbr.getXPath().evaluate(name, connectCbr.getDocument());
        return nameValute;
    }

    @Override
    public String getNominal(String valute) throws IOException, ParserConfigurationException, SAXException, XPathExpressionException {
        String nominal = "/ValCurs/Valute[CharCode='" + valute + "']/Nominal/text()";
        String nominalValute = connectCbr.getXPath().evaluate(nominal, connectCbr.getDocument());
        return nominalValute;
    }

    @Override
    public Boolean existValute(String valute) throws XPathExpressionException, IOException, ParserConfigurationException, SAXException {
        String code = "/ValCurs/Valute[CharCode='" + valute + "']/CharCode/text()";
        String codeValute = connectCbr.getXPath().evaluate(code, connectCbr.getDocument());
        Boolean exist = true;
        if (codeValute.equals("")) {
            exist = false;
        }
        return exist;
    }
}
