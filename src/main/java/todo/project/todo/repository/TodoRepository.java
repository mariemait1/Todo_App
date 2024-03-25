package todo.project.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import todo.project.todo.entity.Todo;
public interface TodoRepository extends JpaRepository<Todo, Long> {
}
