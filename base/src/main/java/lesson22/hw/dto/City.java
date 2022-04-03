package lesson22.hw.dto;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;


@XmlAccessorType(XmlAccessType.FIELD)
public class City {

    @XmlAttribute
    int id;
    @XmlAttribute
    String name;
    Coord coord;
    String country;
    int timezone;
    Sun sun;



}
