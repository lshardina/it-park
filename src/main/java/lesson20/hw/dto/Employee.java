package lesson20.hw.dto;

import jakarta.xml.bind.annotation.XmlType;
import lombok.AllArgsConstructor;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;

@AllArgsConstructor
@XmlType(propOrder = {"department", "position", "tabNum", "fullName", "login"})
public class Employee {

    @XmlAttribute(name = "tab")
    public int tabNum;

    @XmlAttribute(name = "login")
    public String login;

    @XmlAttribute(name = "FIO")
    public String fullName;

    @XmlElement(name = "department")
    Department department;

    @XmlElement(name = "position")
    Position position;


}




