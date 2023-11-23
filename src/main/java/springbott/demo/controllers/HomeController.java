package springbott.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import springbott.demo.Pojos.CityRequest;
import springbott.demo.entities.City;
import springbott.demo.services.CityService;

@RestController
public class HomeController {
  
  @Autowired
  CityService cityService;
  
  @GetMapping("/sayhello")
  public String sayHello() {
    return "Hello user";

  }
  @GetMapping("/getcities")
  public List<City> getCities() {
    return cityService.getCities();
  }

  @PostMapping("addcity")
  public City saveCity(@RequestBody City city) {
    return cityService.saveCity(city);
  }

  @GetMapping("getcity")
  public City geCity(String cityName) {
    return cityService.getCity(cityName);
  }

  @PostMapping("savecity")
  public City addCity(@RequestBody CityRequest cityRequest) {
    return cityService.addCity(cityRequest);
  }
}