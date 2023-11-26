package springbott.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import springbott.demo.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
  Employee findById(int id);

  List<Employee> findByEmployeename(String employeename);

  List<Employee> findByDepartmentAndAgeLessThan(String department, int age);
}
