package eu.imninja.dostuffweb.DAO;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "wiederholungen")
public class WiederholungenDAO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "Name",length=45,nullable = false)
    private String name;
    @OneToMany(mappedBy = "wiederholungen_id")
    private Set<TaskDAO> task = new HashSet<>();

    public WiederholungenDAO() {
    }

    public WiederholungenDAO(int id, String name) {
        this.id = id;
        this.name = name;

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

    public Set<TaskDAO> getTask() {
        return task;
    }

    public void setTask(Set<TaskDAO> task) {
        this.task = task;
    }
}
