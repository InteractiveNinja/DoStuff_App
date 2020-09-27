package eu.imninja.dostuffweb.DAO;

import javax.persistence.*;

@Entity
public class Tasker {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;

    public Tasker() {
    }

    public Tasker(int id, String name, String geburtstag) {
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

    public String getGeburtstag() {
        return geburtstag;
    }

    public void setGeburtstag(String geburtstag) {
        this.geburtstag = geburtstag;
    }

    private String geburtstag;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tasker tasker = (Tasker) o;

        return id == tasker.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return "TaskerDao{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", geburtstag='" + geburtstag + '\'' +
                '}';
    }
}
