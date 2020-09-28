package eu.imninja.dostuffweb.DAO;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "task")
public class TaskDAO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "Beschreibung",length=50,nullable = false)
    private String beschreibung;
    @Column(name = "Zuerledigen",nullable = false)
    private Date zuerledigen;
    @ManyToOne
    @JoinColumn(name = "tasker_id")
    private TaskerDAO tasker_id;
    @ManyToOne
    @JoinColumn(name = "wiederholungen_id")
    private WiederholungenDAO wiederholungen_id;
    @Column(name = "Erledigt",length=1,nullable = false)
    private int erledigt;

    public TaskDAO() {
    }

    public TaskDAO(int id, String beschreibung, Date zuerledigen, TaskerDAO tasker_id, WiederholungenDAO wiederholungen_id, int erledigt) {
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

    public TaskerDAO getTasker_id() {
        return tasker_id;
    }

    public void setTasker_id(TaskerDAO tasker_id) {
        this.tasker_id = tasker_id;
    }

    public WiederholungenDAO getWiederholungen_id() {
        return wiederholungen_id;
    }

    public void setWiederholungen_id(WiederholungenDAO wiederholungen_id) {
        this.wiederholungen_id = wiederholungen_id;
    }

    public int getErledigt() {
        return erledigt;
    }

    public void setErledigt(int erledigt) {
        this.erledigt = erledigt;
    }
}
