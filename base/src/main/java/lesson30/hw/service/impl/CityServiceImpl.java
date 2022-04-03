package lesson30.hw.service.impl;

import lesson30.hw.model.City;
import lesson30.hw.repository.CityRepository;
import lesson30.hw.service.CityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CityServiceImpl implements CityService {

    private final CityRepository cityRepository;

    @Override
    public Object save(City city) {
        cityRepository.save(city);
        return null;
    }

    @Override
    public List<City> findAll() {
        return cityRepository.findAll();
    }

}
