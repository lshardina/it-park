package lesson30.hw;

import lesson30.hw.model.City;
import lesson30.hw.service.CityService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class CityRunner {

    public static void main(String[] args) {

        final ConfigurableApplicationContext appContext = SpringApplication.run(CityRunner.class, args);
        final CityService cityService = appContext.getBean(CityService.class);
        System.out.println("Создан справочник CITY из файла \\db\\migration\\dataCity.xml");

        City city = new City("Уфа", "Ufa", 1126);
        cityService.save(city);
        System.out.println("В справочник добавлен город: " + city);

        System.out.println("На текущий момент в справочнике содержатся сведения о следующих городах:");
        System.out.println(cityService.findAll());

    }
}

