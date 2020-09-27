package eu.imninja.dostuffweb.DAO;

public class KioskDao {

    private int id;
    private String ip;
    private String hostname;

    public KioskDao() {
    }

    public KioskDao(int id, String ip, String hostname) {
        this.id = id;
        this.ip = ip;
        this.hostname = hostname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }
}
