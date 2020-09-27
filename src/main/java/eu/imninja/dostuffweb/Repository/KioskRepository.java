package eu.imninja.dostuffweb.Repository;

import eu.imninja.dostuffweb.DAO.KioskDao;
import org.springframework.data.repository.CrudRepository;

public interface KioskRepository extends CrudRepository<KioskDao, Integer> {
}
