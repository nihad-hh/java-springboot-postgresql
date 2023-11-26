package springbott.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import springbott.demo.entities.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {
  public Course findById(int id);
}
