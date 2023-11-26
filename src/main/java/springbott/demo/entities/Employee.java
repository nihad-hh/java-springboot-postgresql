package springbott.demo.entities;

import java.sql.Date;
import java.time.ZonedDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employees")
public class Employee {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="employee_id")
  private int id;

  private String employeename;

  private String department;

  private Date joiningdate;

  private int age;

  private String address;

  private float salary;

  private ZonedDateTime lefton;

  private boolean leftjob;

  public Employee() {
  }

  
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public Date getJoiningdate() {
    return joiningdate;
  }

  public void setJoiningdate(Date joiningdate) {
    this.joiningdate = joiningdate;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public float getSalary() {
    return salary;
  }

  public void setSalary(float salary) {
    this.salary = salary;
  }

  public ZonedDateTime getLefton() {
    return lefton;
  }

  public void setLefton(ZonedDateTime lefton) {
    this.lefton = lefton;
  }

  public boolean isLeftjob() {
    return leftjob;
  }

  public void setLeftjob(boolean leftjob) {
    this.leftjob = leftjob;
  }


  public String getEmployeename() {
    return employeename;
  }


  public void setEmployeename(String employeename) {
    this.employeename = employeename;
  }

  
}
