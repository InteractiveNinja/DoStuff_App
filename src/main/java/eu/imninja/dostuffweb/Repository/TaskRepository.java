package eu.imninja.dostuffweb.Repository;

import eu.imninja.dostuffweb.DAO.TaskDAO;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<TaskDAO, Integer> {
}
