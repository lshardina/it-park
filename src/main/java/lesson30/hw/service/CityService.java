package lesson30.hw.service;

import lesson30.hw.model.City;
import org.hibernate.criterion.Example;

import java.util.List;

public interface CityService {

    void save(City city);
    List <City> findAll();

}
