package eu.imninja.dostuffweb.DAO;

import javax.persistence.*;

@Entity(name="texte")
public class TexteDAO {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "Text",length="50",nullable = false)
    private String text;
    @Column(name = "Bemerkung",length="60",nullable = false)
    private String bemerkung;


    public TexteDAO() {
    }

    public TexteDAO(int id, String text, String bemerkung) {
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
}
