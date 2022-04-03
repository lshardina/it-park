package lesson30.hw.dao.impl;

import lesson30.hw.dao.CityDao;
import lesson30.hw.model.City;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import org.springframework.validation.annotation.Validated;

import javax.persistence.EntityManager;
import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Slf4j
@Validated
@Repository
@RequiredArgsConstructor
public class CityDaoJpa implements CityDao {

    private final EntityManager em;

    @Override
    public Optional<City> findByName(String nameRus) {
        return Optional.ofNullable(em.find(City.class, nameRus));
    }

    @Override
    public City save(@Valid City city) {
        if (city.getId() == 0) {
            em.persist(city);
        } else
            return em.merge(city);
        return city;
    }

    @Override
    public void deleteById(int idCity) {
        em.createQuery("delete from City c where c.id = :idCity")
                .setParameter("idCity", idCity)
                .executeUpdate();

    }

    @Override
    public List<City> findAll() {
        return null;
    }
}
