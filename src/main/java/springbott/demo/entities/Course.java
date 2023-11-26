package springbott.demo.entities;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="courses")
public class Course {
  @Id
  @Column(name = "course_id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  private String courseName;

  @ManyToMany(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
  @JoinTable(name = "course_coursecontents_mapping",
  joinColumns=@JoinColumn(name="course_id"),
  inverseJoinColumns = @JoinColumn(name="content_id") )
  
  private Set<CourseContents> coursecontents = new HashSet<>();

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getCourseName() {
    return courseName;
  }

  public void setCourseName(String courseName) {
    this.courseName = courseName;
  }

  public Set<CourseContents> getCoursecontents() {
    return coursecontents;
  }

  public void setCoursecontents(Set<CourseContents> coursecontents) {
    this.coursecontents = coursecontents;
  }

  

}
