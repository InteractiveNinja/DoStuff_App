package eu.imninja.dostuffweb.Repository;

import eu.imninja.dostuffweb.DAO.TaskDAO;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface TaskRepository extends CrudRepository<TaskDAO, Integer> {

    @Query(value = "SELECT * FROM TASK t where t.zuerledigen >= CURDATE() and t.zuerledigen < CURDATE()+1 ",nativeQuery = true)
    public Set<TaskDAO> getAllToday();

    @Query(value = "SELECT * FROM TASK t where t.zuerledigen >= CURDATE() and t.wiederholungen_id = 1",nativeQuery = true)
    public Set<TaskDAO> getAllWithRepeatNever();

    @Query(value = "SELECT * FROM TASK t where t.zuerledigen >= CURDATE() and t.wiederholungen_id = 3",nativeQuery = true)
    public Set<TaskDAO> getAllWithRepeatDaily();

    @Query(value = "SELECT * FROM TASK t where t.zuerledigen >= CURDATE() and t.wiederholungen_id = 2",nativeQuery = true)
    public Set<TaskDAO> getAllWithRepeatWeekly();

}
