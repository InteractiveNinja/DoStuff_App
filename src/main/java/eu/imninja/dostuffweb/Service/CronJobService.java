package eu.imninja.dostuffweb.Service;


import eu.imninja.dostuffweb.DAO.ArchiveDAO;
import eu.imninja.dostuffweb.DAO.TaskDAO;
import eu.imninja.dostuffweb.DateFormatter.DateFormatter;
import eu.imninja.dostuffweb.Repository.ArchiveRepository;
import eu.imninja.dostuffweb.Repository.TaskRepository;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Set;

@Service
public class CronJobService {


    TaskRepository taskRepository;
    LoggerControllerService loggerControllerService;
    ArchiveRepository archiveRepository;
    DateFormatter dateFormatter;

    public CronJobService(TaskRepository taskRepository, LoggerControllerService loggerControllerService, ArchiveRepository archiveRepository, DateFormatter dateFormatter) {
        this.taskRepository = taskRepository;
        this.loggerControllerService = loggerControllerService;
        this.archiveRepository = archiveRepository;
        this.dateFormatter = dateFormatter;
    }

    //Löscht alle Task die ohne Wiederholung markiert sind.
    @Scheduled(cron = "${cronjob.time}")
    public void repeatTaskDelete() {
        Set<TaskDAO> t = taskRepository.getAllWithRepeatNever();
        int i = 0;
        for(TaskDAO ta : t) {
            archiveRepository.save(new ArchiveDAO(ta.getBeschreibung(),ta.getZuerledigen(),ta.getTasker_id().getName(),ta.isErledigt()));
            taskRepository.deleteById(ta.getId());
            i++;
        }

        loggerControllerService.logInfo("Tägliche Einträge wurden gelöscht, insgesamt=" + i);

    }
    @Scheduled(cron = "${cronjob.time}")
    //Task mit der wiederholung Täglich werden hier um ein Tag verlängert und auf nicht erledigt gesetzt
    public void repeatTaskExtendeDaily() throws ParseException {
        Set<TaskDAO> t = taskRepository.getAllWithRepeatDaily();
        int i = 0;
        for(TaskDAO ta : t) {
            ta.setZuerledigen(dateFormatter.formatDateWithShift(ta.getZuerledigen().toString(),1));
            ta.setErledigt(false);
            taskRepository.save(ta);
            i++;
        }
        loggerControllerService.logInfo("Tägliche Wiederholungseinträge wurden verlängert, insgesamt=" + i);
    }
    //Task mit der wiederholung Wöchentlich werden hier um eine Woche verlängert und auf nicht erledigt gesetzt
    @Scheduled(cron = "${cronjob.time}")
    public void repeatTaskExtendeWeekly() throws ParseException {
        Set<TaskDAO> t = taskRepository.getAllWithRepeatWeekly();
        int i = 0;
        for(TaskDAO ta : t) {
            ta.setZuerledigen(dateFormatter.formatDateWithShift(ta.getZuerledigen().toString(),7));
            ta.setErledigt(false);
            taskRepository.save(ta);
            i++;


        }
        loggerControllerService.logInfo("Wöchentliche Wiederholungseinträge wurden verlängert, insgesamt=" + i);


    }

    @Scheduled(cron = "${cronjob.time}")
    public void deleteUnknownOldTasks() {
        Set<TaskDAO> t = taskRepository.getAllFromYesterday();
        int i = 0;
        for(TaskDAO ta : t) {
            archiveRepository.save(new ArchiveDAO(ta.getBeschreibung(),ta.getZuerledigen(),ta.getTasker_id().getName(),ta.isErledigt()));
            taskRepository.deleteById(ta.getId());
            i++;
        }

        loggerControllerService.logInfo("Es wurden Einträge gelöscht die in der Vergangenheit liegen, insgesamt=" + i);

    }

}
