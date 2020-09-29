package eu.imninja.dostuffweb.Controller;

import eu.imninja.dostuffweb.DAO.TaskDAO;
import eu.imninja.dostuffweb.DAO.TaskerDAO;
import eu.imninja.dostuffweb.DAO.WiederholungenDAO;
import eu.imninja.dostuffweb.Repository.TaskRepository;
import eu.imninja.dostuffweb.Repository.TaskerRepository;
import eu.imninja.dostuffweb.Repository.WiederholungenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

@Controller
public class SaveController {

    @Autowired
    TaskRepository taskRepository;
    @Autowired
    TaskerRepository taskerRepository;
    @Autowired
    WiederholungenRepository wiederholungenRepository;


    @PostMapping(value = "/save")

    public String save(@RequestParam String beschreibung, @RequestParam String zuerledigen, @RequestParam int tasker_id, @RequestParam int wiederholungs_id) throws ParseException {

        Optional<TaskerDAO> d = taskerRepository.findById(tasker_id);
        Optional<WiederholungenDAO> w = wiederholungenRepository.findById(wiederholungs_id);
        Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(zuerledigen.replace("T", " ") + ":00");
        TaskDAO task = new TaskDAO();
        task.setBeschreibung(beschreibung);
        task.setErledigt(false);
        task.setZuerledigen(date);
        task.setTasker_id(d.get());
        task.setWiederholungen_id(w.get());

        taskRepository.save(task);

        return "save";
    }
}
