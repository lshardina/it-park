package lesson20.hw;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import lesson20.hw.dto.Employee;
import lesson20.hw.dto.WrapperEmployee;

import java.io.File;
import java.io.InputStream;
import java.util.List;

public class EmployeeJson {

    public static void main(String[] args) throws Exception {

   //     ObjectMapper objectMapper = new ObjectMapper();
  //      objectMapper.writeValue(new File("./src/main/resources/employee.json"), kuznecov);

        try (InputStream inputStream = EmployeeJson.class.getResourceAsStream("/employee.xml")) {
           // WrapperEmployee empl = JAXB.unmarshal(inputStream, WrapperEmployee.class);
            String string = inputStream.toString();
            System.out.println(asJson(string));
        }

    }

    private static List<Employee> asJson(String string) throws JAXBException {
//        StringWriter stringWriter = new StringWriter();
//        new ObjectMapper().configure(SerializationFeature.INDENT_OUTPUT, true)
//                          .writeValue(stringWriter, emp);
//        String result = stringWriter.toString();
//        return result;
 //       public static List<Car> getCars(String xmlContent) throws JAXBException {
            JAXBContext context = JAXBContext.newInstance(WrapperEmployee.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            WrapperEmployee result = (WrapperEmployee) unmarshaller.unmarshal(new File(string));
            return result == null ? null : result.getWrapperEmployee();
    }


}
