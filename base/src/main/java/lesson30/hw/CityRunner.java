package lesson30.hw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class CityRunner {

    public static void main(String[] args) {

        SpringApplication.run(CityRunner.class, args);
        System.out.println("Создан справочник CITY из файла \\db\\migration\\dataCity.xml");

        System.out.println("На текущий момент в справочнике содержатся сведения о следующих городах:");
        //System.out.println(cityService.findAll());

    }
}

