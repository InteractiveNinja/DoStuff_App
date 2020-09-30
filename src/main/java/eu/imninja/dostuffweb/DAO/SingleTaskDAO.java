package eu.imninja.dostuffweb.DAO;

import java.util.Date;

public class SingleTaskDAO {
    private int id;
    private String beschreibung;
    private Date zuerledigen;
    private String tasker_name;
    private String widerholungs_name;
    private boolean erledigt;

    public SingleTaskDAO(int id, String beschreibung, Date zuerledigen, String tasker_name, String widerholungs_name, boolean erledigt) {
        this.id = id;
        this.beschreibung = beschreibung;
        this.zuerledigen = zuerledigen;
        this.tasker_name = tasker_name;
        this.widerholungs_name = widerholungs_name;
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

    public Date getZuerledigen() {
        return zuerledigen;
    }

    public void setZuerledigen(Date zuerledigen) {
        this.zuerledigen = zuerledigen;
    }

    public String getTasker_name() {
        return tasker_name;
    }

    public void setTasker_name(String tasker_name) {
        this.tasker_name = tasker_name;
    }

    public String getWiderholungs_name() {
        return widerholungs_name;
    }

    public void setWiderholungs_name(String widerholungs_name) {
        this.widerholungs_name = widerholungs_name;
    }

    public boolean isErledigt() {
        return erledigt;
    }

    public void setErledigt(boolean erledigt) {
        this.erledigt = erledigt;
    }

    @Override
    public String toString() {
        return "SingleTaskDAO{" +
                "id=" + id +
                ", beschreibung='" + beschreibung + '\'' +
                ", zuerledigen=" + zuerledigen +
                ", tasker_name='" + tasker_name + '\'' +
                ", widerholungs_name='" + widerholungs_name + '\'' +
                ", erledigt=" + erledigt +
                '}';
    }
}
