package lesson22.hw.dto;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public class Direction {

    @XmlAttribute
    double value;
    @XmlAttribute
    String code;
    @XmlAttribute
    String name;
}
