package eu.imninja.dostuffweb.Controller;

import eu.imninja.dostuffweb.DAO.TaskDAO;
import eu.imninja.dostuffweb.DAO.TaskerDAO;
import eu.imninja.dostuffweb.DAO.WiederholungenDAO;
import eu.imninja.dostuffweb.DateFormatter.DateFormatter;
import eu.imninja.dostuffweb.Repository.TaskRepository;
import eu.imninja.dostuffweb.Repository.TaskerRepository;
import eu.imninja.dostuffweb.Repository.WiederholungenRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.util.Date;
import java.util.Optional;

@Controller
public class ChangeController {

    TaskRepository taskRepository;
    TaskerRepository taskerRepository;
    WiederholungenRepository wiederholungenRepository;
    DateFormatter dateFormatter;

    public ChangeController(TaskRepository taskRepository, TaskerRepository taskerRepository, WiederholungenRepository wiederholungenRepository, DateFormatter dateFormatter) {
        this.taskRepository = taskRepository;
        this.taskerRepository = taskerRepository;
        this.wiederholungenRepository = wiederholungenRepository;
        this.dateFormatter = dateFormatter;
    }

    @GetMapping("/aendernid")
    public String deleteID(@RequestParam int id, Model model) {
        model.addAttribute("taskers",taskerRepository.findAll());
        model.addAttribute("task",taskRepository.findById(id).get());
        model.addAttribute("wiederholungen",wiederholungenRepository.findAll());
        return "aendernid";
    }

    @GetMapping(value = "/delete")
    public String deleteById(@RequestParam int id) {
        taskRepository.deleteById(id);
        return "deleted";

    }

    @PostMapping(value = "/save")
    public String save(@RequestParam String beschreibung, @RequestParam String zuerledigen, @RequestParam int tasker_id, @RequestParam int wiederholungs_id) throws ParseException {

        Optional<TaskerDAO> d = taskerRepository.findById(tasker_id);
        Optional<WiederholungenDAO> w = wiederholungenRepository.findById(wiederholungs_id);
        Date date = dateFormatter.formatDate(zuerledigen);
        taskRepository.save(new TaskDAO(beschreibung,false,date,d.get(),w.get()));

        return "save";
    }

    @PostMapping(value = "/update")
    public String updateByValues(@RequestParam int id,@RequestParam String beschreibung, @RequestParam String zuerledigen, @RequestParam int tasker_id, @RequestParam int wiederholungs_id) throws ParseException {

        Optional<TaskerDAO> d = taskerRepository.findById(tasker_id);
        Optional<WiederholungenDAO> w = wiederholungenRepository.findById(wiederholungs_id);
        Date date = dateFormatter.formatDate(zuerledigen);
        taskRepository.save(new TaskDAO(id,beschreibung,date,d.get(),w.get(),false));

        return "update";

    }

    @GetMapping(value = "erledigt")
    @ResponseBody
    public String finishById(@RequestParam int id) {
        TaskDAO task = taskRepository.findById(id).get();
        if(task.isErledigt()) {
            task.setErledigt(false);
        } else {
            task.setErledigt(true);
        }

        taskRepository.save(task);

        return "task auf " + task.isErledigt() + " gesetzt" ;
    }
}
