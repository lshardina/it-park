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

    private final ConnectCBR connectCBR;

    @Override
    public String getDate() throws IOException, ParserConfigurationException, SAXException, XPathExpressionException {
        String date = "/ValCurs/@Date";
        String currentDate = connectCBR.getxPath().evaluate(date, connectCBR.getDocument());
        return currentDate;
    }

    @Override
    public String getCourse(String valute) throws IOException, ParserConfigurationException, SAXException, XPathExpressionException {
        String code = "/ValCurs/Valute[CharCode='" + valute + "']/Value/text()";
        String course = connectCBR.getxPath().evaluate(code, connectCBR.getDocument());
        return course;
    }

    @Override
    public String getNameValute(String valute) throws IOException, ParserConfigurationException, SAXException, XPathExpressionException {
        String name = "/ValCurs/Valute[CharCode='" + valute + "']/Name/text()";
        String nameValute = connectCBR.getxPath().evaluate(name, connectCBR.getDocument());
        return nameValute;
    }

    @Override
    public String getNominal(String valute) throws IOException, ParserConfigurationException, SAXException, XPathExpressionException {
        String nominal = "/ValCurs/Valute[CharCode='" + valute + "']/Nominal/text()";
        String nominalValute = connectCBR.getxPath().evaluate(nominal, connectCBR.getDocument());
        return nominalValute;
    }

    @Override
    public Boolean existValute(String valute) throws XPathExpressionException, IOException, ParserConfigurationException, SAXException {
        String code = "/ValCurs/Valute[CharCode='" + valute + "']/CharCode/text()";
        String codeValute = connectCBR.getxPath().evaluate(code, connectCBR.getDocument());
        Boolean exist = true;
        if (codeValute.equals("")) {
            exist = false;
        }
        return exist;
    }
}
