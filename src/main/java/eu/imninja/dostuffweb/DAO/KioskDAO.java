package eu.imninja.dostuffweb.DAO;

import javax.persistence.*;

@Entity(name = "kiosk")
public class KioskDAO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "IP",length="13",nullable = false)
    private String ip;
    @Column(name = "Hostname",length="50",nullable = false)
    private String hostname;

    public KioskDAO() {
    }

    public KioskDAO(int id, String ip, String hostname) {
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
