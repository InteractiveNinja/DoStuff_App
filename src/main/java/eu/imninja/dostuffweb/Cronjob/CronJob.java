package eu.imninja.dostuffweb.Cronjob;


import com.sun.xml.bind.v2.TODO;
import eu.imninja.dostuffweb.DAO.TaskDAO;
import eu.imninja.dostuffweb.Repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.thymeleaf.util.DateUtils;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

@Component
public class CronJob {

    @Autowired
    TaskRepository taskRepository;


  //  @Scheduled(cron = "*/5 * * * * *" )
  /*  public void repeatTaskDelete() {
        Set<TaskDAO> t = taskRepository.getAllWithRepeatNever();
        for(TaskDAO ta : t) {
            taskRepository.deleteById(ta.getId());
        }
        System.out.println("Alle Einträge vom heutigen Tag wurden gelöscht");
    } */
    @Scheduled(cron = "*/5 * * * * *" )
    public void repeatTaskExtendeDaily() {
        Set<TaskDAO> t = taskRepository.getAllWithRepeatDaily();
        for(TaskDAO ta : t) {
          //  ta.setZuerledigen(Date.from(LocalDateTime.from(ta.getZuerledigen().toInstant()).plusDays(1).atZone(ZoneId.systemDefault()).toInstant()));
            //taskRepository.save(ta);
            ta.toString();
        }
        System.out.println("Alle Einträge vom heutigen Tag mit verlängerung 1 Tag wurden verlängert");
    }
}
