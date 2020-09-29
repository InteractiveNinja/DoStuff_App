package eu.imninja.dostuffweb.Controller;

import eu.imninja.dostuffweb.DAO.TaskDAO;
import eu.imninja.dostuffweb.DAO.TaskerDAO;
import eu.imninja.dostuffweb.Repository.TaskRepository;
import eu.imninja.dostuffweb.Repository.TaskerRepository;
import eu.imninja.dostuffweb.Repository.WiederholungenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class SaveController {

    @Autowired
    TaskRepository taskRepository;
    @Autowired
    TaskerRepository taskerRepository;
    @Autowired
    WiederholungenRepository wiederholungenRepository;

    @GetMapping(value = "/save")
    @ResponseBody
    public String save(@RequestParam String beschreibung, @RequestParam String zuerledigen, @RequestParam int tasker_id, @RequestParam int wiederholungs_id) {

        return beschreibung+zuerledigen+tasker_id+wiederholungs_id;
    }
}
