package eu.imninja.dostuffweb.Controller;

import eu.imninja.dostuffweb.DAO.TaskDAO;
import eu.imninja.dostuffweb.DAO.TaskerDAO;
import eu.imninja.dostuffweb.DAO.WiederholungenDAO;
import eu.imninja.dostuffweb.Repository.TaskRepository;
import eu.imninja.dostuffweb.Repository.TaskerRepository;
import eu.imninja.dostuffweb.Repository.WiederholungenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

@Controller
public class UpdateController {

    @Autowired
    TaskerRepository taskerRepository;
    @Autowired
    WiederholungenRepository wiederholungenRepository;
    @Autowired
    TaskRepository taskRepository;

    @PostMapping(value = "/update")
    public String updateByValues(@RequestParam int id,@RequestParam String beschreibung, @RequestParam String zuerledigen, @RequestParam int tasker_id, @RequestParam int wiederholungs_id) throws ParseException {

        Optional<TaskerDAO> d = taskerRepository.findById(tasker_id);
        Optional<WiederholungenDAO> w = wiederholungenRepository.findById(wiederholungs_id);
        Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(zuerledigen.replace("T", " ") + ":00");
        TaskDAO task = new TaskDAO();
        task.setId(id);
        task.setBeschreibung(beschreibung);
        task.setErledigt(false);
        task.setZuerledigen(date);
        task.setTasker_id(d.get());
        task.setWiederholungen_id(w.get());
        taskRepository.save(task);

        return "update";

    }

    @GetMapping(value = "valuedone")
    @ResponseBody
    public String finishById(@RequestParam int id) {
        TaskDAO task = taskRepository.findById(id).get();
        task.setErledigt(true);
        taskRepository.save(task);

        return "true";
    }

    @GetMapping(value = "valuenotdone")
    @ResponseBody
    public String unFinishById(@RequestParam int id) {
        TaskDAO task = taskRepository.findById(id).get();
        task.setErledigt(false);
        taskRepository.save(task);

        return "true";
    }
}
