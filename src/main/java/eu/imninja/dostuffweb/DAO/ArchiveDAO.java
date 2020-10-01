package eu.imninja.dostuffweb.DAO;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "archiv")
public class ArchiveDAO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "Beschreibung",length=50,nullable = false)
    private String beschreibung;
    @Column(name = "Zuerledigen",nullable = false)
    private Date zuerledigen;
    @Column(name = "tasker_name",length = 45,nullable = false)
    private String tasker_name;
    @Column(name = "Erledigt",nullable = false)
    private boolean erledigt;

    public ArchiveDAO() {
    }

    public ArchiveDAO(String beschreibung, Date zuerledigen, String tasker_name, boolean erledigt) {
        this.beschreibung = beschreibung;
        this.zuerledigen = zuerledigen;
        this.tasker_name = tasker_name;
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

    public boolean isErledigt() {
        return erledigt;
    }

    public void setErledigt(boolean erledigt) {
        this.erledigt = erledigt;
    }

    @Override
    public String toString() {
        return "ArchiveDAO{" +
                "id=" + id +
                ", beschreibung='" + beschreibung + '\'' +
                ", zuerledigen=" + zuerledigen +
                ", tasker_name='" + tasker_name + '\'' +
                ", erledigt=" + erledigt +
                '}';
    }
}
