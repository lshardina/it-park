package lesson22.hw.dto;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public class Temperature {
    @XmlAttribute
    double value;
    @XmlAttribute
    double min;
    @XmlAttribute
    double max;
    @XmlAttribute
    String unit;
}
