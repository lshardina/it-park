package lesson22.hw.dto;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class Wind {
    Speed speed;
    String gusts;
    Direction direction;
}
