package eu.imninja.dostuffweb.Repository;

import eu.imninja.dostuffweb.DAO.TaskerDao;
import org.springframework.data.repository.CrudRepository;

public interface TaskerRepository extends CrudRepository<TaskerDao,Integer> {
}
