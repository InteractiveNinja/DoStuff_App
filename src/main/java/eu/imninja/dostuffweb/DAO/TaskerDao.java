package eu.imninja.dostuffweb.DAO;

public class TaskerDao {

    private int id;
    private String name;

    public TaskerDao() {
    }

    public TaskerDao(int id, String name, String geburtstag) {
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

}
