package lesson33.hw.service.impl;

import lesson33.hw.ConnectCbr;
import lesson33.hw.service.ExchangeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;
import java.io.IOException;


@RequiredArgsConstructor
@Service
public class ExchangeServiceImpl implements ExchangeService {

    private final ConnectCbr connectCbr;

    @Override
    public String countingCourse(String val1, String val2, Integer amount2) throws XPathExpressionException, IOException, ParserConfigurationException, SAXException {
        Double dbl = ((Double.valueOf(getCourse(val2))) / (Double.valueOf(getNominal(val2)))) /
                ((Double.valueOf(getCourse(val1))) / (Double.valueOf(getNominal(val1)))) * amount2;
        String str = String.format("%.2f", dbl);
        return str;
    }

    @Override
    public String getDate() throws IOException, ParserConfigurationException, SAXException, XPathExpressionException {
        String date = "/ValCurs/@Date";
        String currentDate = connectCbr.getXPath().evaluate(date, connectCbr.getDocument());
        return currentDate;
    }

    @Override
    public String getCourse(String valute) throws IOException, ParserConfigurationException, SAXException, XPathExpressionException {
        if (valute.equals("RUB")) {
            return "1";
        } else {
            String code = "/ValCurs/Valute[CharCode='" + valute + "']/Value/text()";
            String course = connectCbr.getXPath().evaluate(code, connectCbr.getDocument());
            return course.replace(",", ".");
        }
    }

    @Override
    public String getNameValute(String valute) throws IOException, ParserConfigurationException, SAXException, XPathExpressionException {
        if (valute.equals("RUB")) {
            return "руб.";
        } else {
            String name = "/ValCurs/Valute[CharCode='" + valute + "']/Name/text()";
            String nameValute = connectCbr.getXPath().evaluate(name, connectCbr.getDocument());
            return nameValute;
        }
    }

    @Override
    public String getNominal(String valute) throws IOException, ParserConfigurationException, SAXException, XPathExpressionException {
        if (valute.equals("RUB")) {
            return "1";
        } else {
            String nominal = "/ValCurs/Valute[CharCode='" + valute + "']/Nominal/text()";
            String nominalValute = connectCbr.getXPath().evaluate(nominal, connectCbr.getDocument());
            return nominalValute.replace(",", ".");
        }
    }

}
