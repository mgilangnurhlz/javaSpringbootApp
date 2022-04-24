package password.forgotpassword.service.framework;

import password.forgotpassword.entity.Employee;

import java.util.List;

public interface EmployeeService {
    void saveEmployee(Employee emp);
    List<Employee> getAllEmployees();
    void deleteEmployeeById(Integer id);
    Employee getEmployeeById(Integer id);
    void updateEmployee(Employee emp);
}
