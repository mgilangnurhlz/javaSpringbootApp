package password.forgotpassword.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import password.forgotpassword.entity.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}