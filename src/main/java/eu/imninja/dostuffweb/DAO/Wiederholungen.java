package eu.imninja.dostuffweb.DAO;

import javax.persistence.*;

@Entity
public class Wiederholungen {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;


    public Wiederholungen() {
    }

    public Wiederholungen(int id, String name) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Wiederholungen that = (Wiederholungen) o;

        return id == that.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return "Wiederholungen{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
