package lesson26.hw;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;
import java.io.IOException;
import java.util.Scanner;

public class CbrDaily {

    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException, XPathExpressionException {

        final AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext("lesson26.hw");
        final GetCbr getCbr = applicationContext.getBean(GetCbr.class);

        System.out.println("Введите интересующую валюту, например, USD, CAD, CNY, EUR, GBP, TRY, CZK и т.д.:");
        Scanner scanner = new Scanner(System.in);
        String valute = scanner.nextLine();

        if (getCbr.existValute(valute) == true) {
            System.out.println("Центральный Банк РФ установил на " + getCbr.getDate() + " курс валюты:");
            System.out.println(getCbr.getNominal(valute) + " " + getCbr.getNameValute(valute) + " равен(ны) " + getCbr.getCourse(valute) + " руб.");
        } else {
            System.out.println("Валюты с кодом " + valute + " в на сайте Цб не найдено.");
        }

    }

}
