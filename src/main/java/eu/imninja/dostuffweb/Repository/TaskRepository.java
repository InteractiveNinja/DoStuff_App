package eu.imninja.dostuffweb.Repository;

import eu.imninja.dostuffweb.DAO.TaskDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Set;

public interface TaskRepository extends CrudRepository<TaskDAO, Integer> {

    // Hole alle von heute und sortiert dieses nach erledigt und bis wann
    @Query(value = "SELECT * FROM task t where t.zuerledigen >= CURDATE() and t.zuerledigen < CURDATE()+1 order by t.erledigt, t.zuerledigen",nativeQuery = true)
    public Set<TaskDAO> getAllToday();

    // Hole alle von heute die keine wiederholung haben
    @Query(value = "SELECT * FROM task t where t.zuerledigen >= CURDATE() and  t.zuerledigen < CURDATE()+1 and t.wiederholungen_id = 1",nativeQuery = true)
    public Set<TaskDAO> getAllWithRepeatNever();

    // Hole alle von heute die eine Tägliche wiederholung haben
    @Query(value = "SELECT * FROM task t where t.zuerledigen >= CURDATE() and  t.zuerledigen < CURDATE()+1 and t.wiederholungen_id = 2",nativeQuery = true)
    public Set<TaskDAO> getAllWithRepeatDaily();

    // Hole alle von heute die eine Wöchentliche wiederholung haben
    @Query(value = "SELECT * FROM task t where t.zuerledigen >= CURDATE() and  t.zuerledigen < CURDATE()+1 and t.wiederholungen_id = 3",nativeQuery = true)
    public Set<TaskDAO> getAllWithRepeatWeekly();

    // Hole alle die Älter als Heute sind
    @Query(value = "SELECT * FROM task t where t.zuerledigen < CURDATE()",nativeQuery = true)
    public Set<TaskDAO> getAllFromYesterday();

    // Hole alle und Ordne diese per Wiederholungs_id und ob es erledigt ist
    @Query(value = "SELECT * FROM task t order by t.wiederholungen_id,t.erledigt",nativeQuery = true)
    public Set<TaskDAO> getAllOrderByRepeater();

}
