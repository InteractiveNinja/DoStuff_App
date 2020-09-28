package eu.imninja.dostuffweb.DAO;

import javax.persistence.*;

@Entity(name = "wiederholungen")
public class WiederholungenDAO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "Name",length="45",nullable = false)
    private String name;

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
}
