package password.forgotpassword.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import password.forgotpassword.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
