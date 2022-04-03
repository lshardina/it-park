package lesson22.hw.dto;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "current")
public class WeatherRegion {

    private City city;
    private Temperature temperature;
    private Feels_like feels_like;
    private Humidity humidity;
    private Pressure pressure;
    private Wind wind;
    private Clouds clouds;
    private Visibility visibility;
    private Precipitation precipitation;
    private Weather weather;
    private Lastupdate lastupdate;


}
