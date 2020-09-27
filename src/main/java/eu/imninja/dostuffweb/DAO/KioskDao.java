package eu.imninja.dostuffweb.DAO;

import javax.persistence.*;

@Entity
public class KioskDao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        KioskDao kioskDao = (KioskDao) o;

        return id == kioskDao.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return "KioskDao{" +
                "id=" + id +
                ", ip='" + ip + '\'' +
                ", hostname='" + hostname + '\'' +
                '}';
    }
}
