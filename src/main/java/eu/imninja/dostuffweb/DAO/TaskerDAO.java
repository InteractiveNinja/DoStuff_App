package eu.imninja.dostuffweb.DAO;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "tasker")
public class TaskerDAO {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "Name",length="45",nullable = false)
    private String name;
    @Column(name = "Geburtstag",nullable = false)
    private Date geburtstag;

    public TaskerDAO() {
    }

    public TaskerDAO(int id, String name,Date geburtstag) {
        this.id = id;
        this.name = name;
        this.geburtstag = geburtstag;
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
}
