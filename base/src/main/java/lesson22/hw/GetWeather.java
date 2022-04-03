package lesson22.hw;

import jakarta.xml.bind.JAXBException;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class GetWeather {

    public static void main(String[] args) throws URISyntaxException, IOException, JAXBException, ParserConfigurationException, SAXException, XPathExpressionException {
        Scanner cityScanner = new Scanner(System.in);
        System.out.println("Введите, пожалуйста, номер региона из справочника:");
        CityNSI regions = new CityNSI();
        regions.fillRegion();
        String city = cityScanner.nextLine();

        URI uri = new URI("https://api.openweathermap.org/data/2.5/weather?q=" + regions.getCity(city) + "&appid=e6ac69eb3b2396e10852b52827ab3d69&mode=xml&units=metric");

        URL url = uri.toURL();
        URLConnection urlConnection = url.openConnection();
        urlConnection.connect();

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse("https://api.openweathermap.org/data/2.5/weather?q=" + regions.getCity(city) + "&appid=e6ac69eb3b2396e10852b52827ab3d69&mode=xml&units=metric");
        XPath xPath = XPathFactory.newInstance().newXPath();

        String expression1 = "/current/temperature/@value";
        String expression2 = "/current/feels_like/@value";
        String expression3 = "/current/wind/speed/@value";


        System.out.println("Прогноз погоды в г. " + regions.getCity(city) + " на сегодня:");
        System.out.println("Температура воздуха: " + xPath.evaluate(expression1, document) +
                "°С, ощущается как " + xPath.evaluate(expression2, document) + "°С");
        System.out.println("Ветер " + getWindDirection(xPath, document) + ", скорость ветра: " + xPath.evaluate(expression3, document) + " м/с");
        System.out.println("Осадки: " + getPrecipitation(xPath, document));
        System.out.println("Облачность: " + getClouds(xPath, document));

    }

    private static String getPrecipitation(XPath xp, Document doc) throws XPathExpressionException {
        String precipitation;
        String expression5 = "/current/precipitation/@mode";
        switch (xp.evaluate(expression5, doc)) {
            case "no": {
                precipitation = "осадков не ожидается";
                break;
            }
            case "rain": {
                precipitation = "дождь";
                break;
            }
            default: {
                precipitation = "снег";
                break;
            }
        }
        return precipitation;
    }

    private static String getWindDirection(XPath xp, Document doc) throws XPathExpressionException {
        String windDirection;
        String expression6 = "/current/wind/direction/@code";
        switch (xp.evaluate(expression6, doc)) {
            case "N": {
                windDirection = "северный";
                break;
            }
            case "S": {
                windDirection = "южный";
                break;
            }
            case "NW":
            case "NNW": {
                windDirection = "северно-западный";
                break;
            }
            case "NE":
            case "NNE": {
                windDirection = "северо-восточный";
                break;
            }
            case "SSW":
            case "SW": {
                windDirection = "юго-западный";
                break;
            }
            default: {
                windDirection = "юго-восточный";
                break;
            }
        }
        return windDirection;
    }

    private static String getClouds(XPath xp, Document doc) throws XPathExpressionException {
        String clouds;
        String expression4 = "/current/clouds/@name";
        switch (xp.evaluate(expression4, doc)) {
            case "few clouds": {
                clouds = "небольшие облака";
                break;
            }
            case "clear sky": {
                clouds = "ясно";
                break;
            }
            case "overcast clouds": {
                clouds = "пасмурно";
                break;
            }
            default: {
                clouds = "переменная облачность";
                break;
            }
        }
        return clouds;
    }
}
