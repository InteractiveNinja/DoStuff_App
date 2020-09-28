package eu.imninja.dostuffweb.DAO;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "task")
public class TaskDAO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "Beschreibung",length="50",nullable = false)
    private String beschreibung;
    @Column(name = "Zuerledigen",nullable = false)
    private Date zuerledigen;
    @OneToMany(mappedBy = "task")
    private int tasker_id;
    @OneToMany(mappedBy = "task")
    private int wiederholungen_id;
    @Column(name = "Erledigt",length="1",nullable = false)
    private int erledigt;

    public TaskDAO() {
    }

    public TaskDAO(int id, String beschreibung, Date zuerledigen, int tasker_id, int wiederholungen_id, int erledigt) {
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

    public Date getZuerledigen() {
        return zuerledigen;
    }

    public void setZuerledigen(Date zuerledigen) {
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
}
