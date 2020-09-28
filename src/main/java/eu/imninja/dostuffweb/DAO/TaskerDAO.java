package eu.imninja.dostuffweb.DAO;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "tasker")
public class TaskerDAO {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    @Column(name = "Name",length=45,nullable = false)
    private String name;
    @Column(name = "Geburtstag",nullable = false)
    private Date geburtstag;
    @OneToMany(mappedBy = "tasker_id")
    private Set<TaskDAO> task = new HashSet<TaskDAO>();

    public TaskerDAO() {
    }

    public TaskerDAO(int id, String name, Date geburtstag, Set<TaskDAO> task) {
        this.id = id;
        this.name = name;
        this.geburtstag = geburtstag;
        this.task = task;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getGeburtstag() {
        return geburtstag;
    }

    public void setGeburtstag(Date geburtstag) {
        this.geburtstag = geburtstag;
    }

    public Set<TaskDAO> getTask() {
        return task;
    }

    public void setTask(Set<TaskDAO> task) {
        this.task = task;
    }
}
