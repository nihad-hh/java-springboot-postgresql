package springbott.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springbott.demo.entities.Employee;
import springbott.demo.repositories.EmployeeRepository;

@Service
public class EmployeeService {
  @Autowired
  EmployeeRepository employeeRepository;

  public EmployeeService() {
  }
  
  public List<Employee> saveAllEmployees(List<Employee> employees) {
    return employeeRepository.saveAll(employees);
  }

  public List<Employee> findAllEmployees() {
    return employeeRepository.findAll();
  }

  public Employee findEmployeeById(int id) {
    return employeeRepository.findById(id);
  }

  public List<Employee> findEmployeesByName(String employeename) {
    return employeeRepository.findByEmployeename(employeename);
  }

  public List<Employee> findAllEmployeesByIds(List<Integer> ids) {
    return employeeRepository.findAllById(ids);
  }
}
