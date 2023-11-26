package springbott.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import springbott.demo.entities.Employee;
import springbott.demo.repositories.EmployeeRepository;
import springbott.demo.services.EmployeeService;

@RestController
@RequestMapping("employees/")
public class EmployeeController {
  @Autowired
  EmployeeService employeeService;

  @Autowired
  EmployeeRepository employeeRepository;

  @PostMapping("addemployees")
  public List<Employee> addAllEmployees(@RequestBody List<Employee> employees) {
    return employeeService.saveAllEmployees(employees);
  }

  @GetMapping("allemployees")
  public List<Employee> getAllEmployees() {
    return employeeService.findAllEmployees();
  }

  @GetMapping("employeeswithname")
  public List<Employee> getAllEmployeesWithName(@RequestParam String employeename) {
    return employeeService.findEmployeesByName(employeename);
  }

  @GetMapping("employeebyid")
  public Employee getEmployeeById(@RequestParam int id) {
    return employeeService.findEmployeeById(id);
  }

  @GetMapping("employeesbyids")
  public List<Employee> getEmployeesByIds(@RequestParam List<Integer> ids) {
    return employeeService.findAllEmployeesByIds(ids);
  }

  @GetMapping("empbydeptandage")
  public List<Employee> getEmpByDeptAndAge(@RequestParam String department, @RequestParam int age) {
    return employeeRepository.findByDepartmentAndAgeLessThan(department, age);
  }
}
