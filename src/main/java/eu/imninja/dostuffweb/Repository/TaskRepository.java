package eu.imninja.dostuffweb.Repository;

import eu.imninja.dostuffweb.DAO.TaskDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Set;

public interface TaskRepository extends JpaRepository<TaskDAO, Integer> {

    @Query(value = "SELECT * FROM task t where t.zuerledigen >= CURDATE() and t.zuerledigen < CURDATE()+1 ",nativeQuery = true)
    public List<TaskDAO> getAllToday();

    @Query(value = "SELECT * FROM task t where t.zuerledigen >= CURDATE() and  t.zuerledigen < CURDATE()+1 and t.wiederholungen_id = 1",nativeQuery = true)
    public Set<TaskDAO> getAllWithRepeatNever();


    @Query(value = "SELECT * FROM task t where t.zuerledigen >= CURDATE() and  t.zuerledigen < CURDATE()+1 and t.wiederholungen_id = 2",nativeQuery = true)
    public Set<TaskDAO> getAllWithRepeatDaily();

    @Query(value = "SELECT * FROM task t where t.zuerledigen >= CURDATE() and  t.zuerledigen < CURDATE()+1 and t.wiederholungen_id = 3",nativeQuery = true)
    public Set<TaskDAO> getAllWithRepeatWeekly();

}
