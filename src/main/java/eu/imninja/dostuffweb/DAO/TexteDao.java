package eu.imninja.dostuffweb.DAO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TexteDao {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String text;
    private String bemerkung;

    public TexteDao() {
    }


    public TexteDao(int id, String text, String bemerkung) {
        this.id = id;
        this.text = text;
        this.bemerkung = bemerkung;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


    public String getBemerkung() {
        return bemerkung;
    }

    public void setBemerkung(String bemerkung) {
        this.bemerkung = bemerkung;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TexteDao texteDao = (TexteDao) o;

        return id == texteDao.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return "Texte{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", bemerkung='" + bemerkung + '\'' +
                '}';
    }
}
