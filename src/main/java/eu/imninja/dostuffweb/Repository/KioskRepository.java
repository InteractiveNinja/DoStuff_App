package eu.imninja.dostuffweb.Repository;

import eu.imninja.dostuffweb.DAO.KioskDAO;
import org.springframework.data.repository.CrudRepository;

public interface KioskRepository extends CrudRepository<KioskDAO, Integer> {
}
