package springbott.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import springbott.demo.entities.City;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {

  City findByCityName(String cityName);
  
}
