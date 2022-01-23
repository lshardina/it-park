package lesson20.hw.dto;

import jakarta.xml.bind.annotation.XmlAttribute;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Position {

    @XmlAttribute(name = "position")
    private String namePosition;

    @XmlAttribute(name = "salary")
    private int salary;
}
