package lesson30.hw.service;

import lesson30.hw.model.City;

import java.util.List;

public interface CityService {

    Object save(City city);
    List <City> findAll();

}
