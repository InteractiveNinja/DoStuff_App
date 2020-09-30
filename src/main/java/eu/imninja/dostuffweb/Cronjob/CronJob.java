package eu.imninja.dostuffweb.Cronjob;


import eu.imninja.dostuffweb.DAO.TaskDAO;
import eu.imninja.dostuffweb.Repository.TaskRepository;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Set;

@Component
public class CronJob {


    TaskRepository taskRepository;

    public CronJob(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }
    //Löscht alle Task die ohne Wiederholung markiert sind.
    @Scheduled(cron = "59 23 * * * *" )
    public void repeatTaskDelete() {
        Set<TaskDAO> t = taskRepository.getAllWithRepeatNever();
        for(TaskDAO ta : t) {
            taskRepository.deleteById(ta.getId());
        }

    }
    @Scheduled(cron = "59 23 * * * *" )
    //Task mit der wiederholung Täglich werden hier um ein Tag verlängert und auf nicht erledigt gesetzt
    //@Scheduled(cron = "*/5 * * * * *" )
    public void repeatTaskExtendeDaily() throws ParseException {
        Set<TaskDAO> t = taskRepository.getAllWithRepeatDaily();
        for(TaskDAO ta : t) {

            Date olddate = ta.getZuerledigen();
            String timestring = olddate.toString().substring(10,olddate.toString().length());

            LocalDate nextWeek = LocalDate.now().plusDays(1);
            Date newdate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(nextWeek.toString() + " " + timestring);
            ta.setZuerledigen(newdate);
            ta.setErledigt(false);

            taskRepository.save(ta);





        }
    }
    //Task mit der wiederholung Wöchentlich werden hier um eine Woche verlängert und auf nicht erledigt gesetzt
    @Scheduled(cron = "59 23 * * * *" )
    public void repeatTaskExtendeWeekly() throws ParseException {
        Set<TaskDAO> t = taskRepository.getAllWithRepeatWeekly();
        for(TaskDAO ta : t) {

            Date olddate = ta.getZuerledigen();
            String timestring = olddate.toString().substring(10,olddate.toString().length());

            LocalDate nextWeek = LocalDate.now().plusDays(7);
            Date newdate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(nextWeek.toString() + " " + timestring);
            ta.setZuerledigen(newdate);
            ta.setErledigt(false);

            taskRepository.save(ta);




        }

    }

}
