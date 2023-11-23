package springbott.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springbott.demo.Pojos.CityRequest;
import springbott.demo.entities.City;
import springbott.demo.entities.Country;
import springbott.demo.repositories.CityRepository;
import springbott.demo.repositories.CountryRepository;

@Service
public class CityService {

  @Autowired
  CityRepository citiesRepository;
  
  @Autowired
  CountryRepository countryRepository;

  public CityService() {

  }

  public List<City> getCities() {
    return citiesRepository.findAll();
  }

  public City saveCity(City city) {
    return citiesRepository.save(city);
  }

  public City getCity(String cityName) {
    return citiesRepository.findByCityName(cityName);
  }

  public City addCity(CityRequest cityRequest) {
    Country country = countryRepository.findById(cityRequest.country_id);

    City city = new City();
    city.setCityName(cityRequest.cityName);
    city.setCityCode(cityRequest.cityCode);
    city.setCountry(country);
    return citiesRepository.save(city);
  }
  
}
