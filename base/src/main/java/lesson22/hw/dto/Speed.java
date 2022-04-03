package lesson22.hw.dto;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public class Speed {
    @XmlAttribute
    double value;
    @XmlAttribute
    String unit;
    @XmlAttribute
    String name;

}
