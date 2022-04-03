package lesson20.hw.dto;

import jakarta.xml.bind.annotation.*;
import lombok.Data;

import java.util.List;

@Data
@XmlRootElement(name = "Сотрудники_ООО_Рога_и_копыта")
@XmlAccessorType(XmlAccessType.FIELD)
public class WrapperEmployee {

    @XmlElement(name = "employee")
    private List<Employee> wrapperEmployee;
}
