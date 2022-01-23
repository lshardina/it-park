package lesson20.hw;

import jakarta.xml.bind.*;
import lesson20.hw.dto.Department;
import lesson20.hw.dto.Employee;
import lesson20.hw.dto.Position;
import lesson20.hw.dto.WrapperEmployee;

import java.io.File;
import java.util.Arrays;

public class EmployeeRunner {
    public static void main(String[] args) throws Exception {

        Position analitic = new Position("аналитик", 100);
        Position tester = new Position("тестировщик", 70);
        Position programmer = new Position("разработчик", 150);

        Department central = new Department("Центральный офис", "Москва");
        Department filial = new Department("Филиал", "Владивосток");

        Employee kuznecov = new Employee(372, "kuznec", "Кузнецов Иван Петрович", central, analitic);
        Employee malcev = new Employee(56, "malcev", "Мальцев Александр Александрович", central, programmer);
        Employee smirnov = new Employee(398, "smirnov", "Смирнов Андрей Иванович", filial, analitic);
        Employee volkov = new Employee(877, "volkov", "Волков Алексей Львович", filial, programmer);
        Employee petuhov = new Employee(100, "petuhov", "Петухов Николай Валерьевич", filial, tester);
        Employee zaycev = new Employee(767, "zaycev", "Зайцев Константин Эдуардович", filial, tester);

        WrapperEmployee employees = new WrapperEmployee();
        employees.setWrapperEmployee(Arrays.asList(kuznecov, malcev, smirnov, volkov, petuhov, zaycev));

        writeToXML(employees);
        System.out.println("Файл /resources/employee.xml  сформирован");
    }

    private static void writeToXML(WrapperEmployee emp) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(WrapperEmployee.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

        marshaller.marshal(emp, new File("./src/main/resources/employee.xml"));
    }

}
