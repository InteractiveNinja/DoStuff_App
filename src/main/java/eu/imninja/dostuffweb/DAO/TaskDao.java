package eu.imninja.dostuffweb.DAO;

public class TaskDao {
    private int id;
    private String beschreibung;
    private String zuerledigen;
    private int tasked_id;
    private int wiederholungs_id;
    private int erledigt;

    public TaskDao() {
    }

    public TaskDao(int id, String beschreibung, String zuerledigen, int tasked_id, int wiederholungs_id, int erledigt) {
        this.id = id;
        this.beschreibung = beschreibung;
        this.zuerledigen = zuerledigen;
        this.tasked_id = tasked_id;
        this.wiederholungs_id = wiederholungs_id;
        this.erledigt = erledigt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public String getZuerledigen() {
        return zuerledigen;
    }

    public void setZuerledigen(String zuerledigen) {
        this.zuerledigen = zuerledigen;
    }

    public int getTasked_id() {
        return tasked_id;
    }

    public void setTasked_id(int tasked_id) {
        this.tasked_id = tasked_id;
    }

    public int getWiederholungs_id() {
        return wiederholungs_id;
    }

    public void setWiederholungs_id(int wiederholungs_id) {
        this.wiederholungs_id = wiederholungs_id;
    }

    public int getErledigt() {
        return erledigt;
    }

    public void setErledigt(int erledigt) {
        this.erledigt = erledigt;
    }
}
