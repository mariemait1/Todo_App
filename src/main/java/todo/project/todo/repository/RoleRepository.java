package todo.project.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import todo.project.todo.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
