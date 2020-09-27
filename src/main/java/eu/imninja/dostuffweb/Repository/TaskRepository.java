package eu.imninja.dostuffweb.Repository;

import eu.imninja.dostuffweb.DAO.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Integer> {
}
