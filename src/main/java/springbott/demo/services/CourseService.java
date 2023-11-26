package springbott.demo.services;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springbott.demo.Pojos.CourseRequest;
import springbott.demo.entities.Course;
import springbott.demo.entities.CourseContents;
import springbott.demo.repositories.CourseContentRepository;
import springbott.demo.repositories.CourseRepository;

@Service
public class CourseService {
  @Autowired
  CourseRepository courseRepository;

  @Autowired
  CourseContentRepository cContentRepository;

  public CourseService() {
  }
  
  public Course addCourseWithContents(CourseRequest courseRequest) {
    Course course = new Course();
    
    course.setId(courseRequest.id);
    course.setCourseName(courseRequest.courseName);
    course.setCoursecontents(courseRequest.courseContents.stream().map(courseContent -> {
      CourseContents cContents = courseContent;
      if (cContents.getId() > 0) {
        cContents = cContentRepository.findById((cContents.getId()));
      }
      cContents.addCourse(course);
      return cContents;
    }).collect(Collectors.toSet()));

    return courseRepository.save(course);
  }
  
}
