package eu.imninja.dostuffweb.Repository;

import eu.imninja.dostuffweb.DAO.TaskerDAO;
import org.springframework.data.repository.CrudRepository;

public interface TaskerRepository extends CrudRepository<TaskerDAO,Integer> {
}
