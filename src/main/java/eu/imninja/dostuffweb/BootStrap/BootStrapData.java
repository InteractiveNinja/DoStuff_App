package eu.imninja.dostuffweb.BootStrap;

import eu.imninja.dostuffweb.DAO.TaskerDAO;
import eu.imninja.dostuffweb.DAO.WiederholungenDAO;
import eu.imninja.dostuffweb.Repository.TaskerRepository;
import eu.imninja.dostuffweb.Repository.WiederholungenRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import sun.java2d.pipe.SpanShapeRenderer;

import java.sql.Date;
import java.text.SimpleDateFormat;

@Component
public class BootStrapData implements CommandLineRunner {

    WiederholungenRepository wiederholungenRepository;
    TaskerRepository taskerRepository;

    public BootStrapData(WiederholungenRepository wiederholungenRepository, TaskerRepository taskerRepository) {
        this.wiederholungenRepository = wiederholungenRepository;
        this.taskerRepository = taskerRepository;
    }

    @Value("${im.ninja}")
    private boolean isNinja;

    @Override
    public void run(String... args) throws Exception {

        WiederholungenDAO w = new WiederholungenDAO(1,"nie");
        WiederholungenDAO ww = new WiederholungenDAO(2,"täglich");
        WiederholungenDAO www = new WiederholungenDAO(3,"wöchentlich");
        wiederholungenRepository.save(w);
        wiederholungenRepository.save(ww);
        wiederholungenRepository.save(www);

        if(isNinja) {


        TaskerDAO t = new TaskerDAO(1,"Gabriel",new SimpleDateFormat("yyyy-MM-dd").parse("2003-09-03"));
        TaskerDAO tt = new TaskerDAO(2,"Melody",new SimpleDateFormat("yyyy-MM-dd").parse("2007-11-16"));
        TaskerDAO ttt = new TaskerDAO(3,"Bodo",new SimpleDateFormat("yyyy-MM-dd").parse("1967-01-01"));
        TaskerDAO tttt = new TaskerDAO(4,"Cleo",new SimpleDateFormat("yyyy-MM-dd").parse("1975-06-05"));

        taskerRepository.save(t);
        taskerRepository.save(tt);
        taskerRepository.save(ttt);
        taskerRepository.save(tttt);
        }

    }
}
