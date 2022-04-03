package lesson30.hw.dao;

import lesson30.hw.model.City;


import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

public interface CityDao {

    Optional<City> findByName(String nameCity);
    City save(@Valid City city);
    void deleteById(int idCity);
    List<City> findAll();
}
