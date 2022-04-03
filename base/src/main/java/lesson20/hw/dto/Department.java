package lesson20.hw.dto;

import jakarta.xml.bind.annotation.XmlAttribute;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Department {


    @XmlAttribute(name = "division")
    public String division;

    @XmlAttribute(name = "city")
    public String city;


}
