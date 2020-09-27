package eu.imninja.dostuffweb.Repository;

import eu.imninja.dostuffweb.DAO.Tasker;
import org.springframework.data.repository.CrudRepository;

public interface TaskerRepository extends CrudRepository<Tasker,Integer> {
}
