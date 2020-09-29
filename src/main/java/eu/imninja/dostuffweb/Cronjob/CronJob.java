package eu.imninja.dostuffweb.Cronjob;


import eu.imninja.dostuffweb.DAO.TaskDAO;
import eu.imninja.dostuffweb.Repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import sun.java2d.pipe.SpanShapeRenderer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;
import java.util.spi.CalendarNameProvider;

@Component
public class CronJob {

    @Autowired
    TaskRepository taskRepository;


   // @Scheduled(cron = "*/5 * * * * *" )
    public void repeatTaskDelete() {
        Set<TaskDAO> t = taskRepository.getAllWithRepeatNever();
        for(TaskDAO ta : t) {
            //taskRepository.deleteById(ta.getId());
            System.out.println(ta.toString());
        }
        System.out.println("Alle Einträge vom heutigen Tag wurden gelöscht");
    }
    @Scheduled(cron = "*/5 * * * * *" )
    public void repeatTaskExtendeDaily() throws ParseException {
        Set<TaskDAO> t = taskRepository.getAllWithRepeatDaily();
        for(TaskDAO ta : t) {

            Date olddate = ta.getZuerledigen();

            String  datestring = olddate.toString().substring(0,10);
            String timestring = olddate.toString().substring(10,olddate.toString().length());
            Calendar c = Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            c.setTime(sdf.parse(datestring));
            c.add(Calendar.DAY_OF_MONTH,1);
            String newdatestring = c.get(Calendar.YEAR)+"-"+c.get(Calendar.MONTH)+"-"+c.get(Calendar.DAY_OF_MONTH) + " " + timestring;
            Date newdate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(newdatestring);


            System.out.println(ta.getZuerledigen().toString());

            ta.setZuerledigen(newdate);

            System.out.println(ta.getZuerledigen().toString());

        }
    }
}
