package springbott.demo.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import springbott.demo.entities.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country,Integer>{
  Country findById(int id);
}
