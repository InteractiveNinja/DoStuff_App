package eu.imninja.dostuffweb.Repository;

import eu.imninja.dostuffweb.DAO.TaskDao;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<TaskDao, Integer> {
}
