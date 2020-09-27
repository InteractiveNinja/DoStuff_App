package eu.imninja.dostuffweb.DAO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String beschreibung;
    private String zuerledigen;
    private int tasker_id;
    private int wiederholungen_id;
    private int erledigt;

    public Task() {
    }

    public Task(int id, String beschreibung, String zuerledigen, int tasker_id, int wiederholungen_id, int erledigt) {
        this.id = id;
        this.beschreibung = beschreibung;
        this.zuerledigen = zuerledigen;
        this.tasker_id = tasker_id;
        this.wiederholungen_id = wiederholungen_id;
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

    public int getTasker_id() {
        return tasker_id;
    }

    public void setTasker_id(int tasker_id) {
        this.tasker_id = tasker_id;
    }

    public int getWiederholungen_id() {
        return wiederholungen_id;
    }

    public void setWiederholungen_id(int wiederholungen_id) {
        this.wiederholungen_id = wiederholungen_id;
    }

    public int getErledigt() {
        return erledigt;
    }

    public void setErledigt(int erledigt) {
        this.erledigt = erledigt;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Task taskDao = (Task) o;

        return id == taskDao.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return "TaskDao{" +
                "id=" + id +
                ", beschreibung='" + beschreibung + '\'' +
                ", zuerledigen='" + zuerledigen + '\'' +
                ", tasked_id=" + tasker_id +
                ", wiederholungs_id=" + wiederholungen_id +
                ", erledigt=" + erledigt +
                '}';
    }
}
