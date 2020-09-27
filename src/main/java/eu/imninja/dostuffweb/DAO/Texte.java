package eu.imninja.dostuffweb.DAO;

public class Texte {

    private int id;
    private String text;
    private String bemerkung;

    public Texte() {
    }


    public Texte(int id, String text, String bemerkung) {
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
