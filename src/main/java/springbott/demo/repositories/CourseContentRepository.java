package springbott.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import springbott.demo.entities.CourseContents;

@Repository
public interface CourseContentRepository extends JpaRepository<CourseContents, Integer> {
  public CourseContents findById(int id);
}
