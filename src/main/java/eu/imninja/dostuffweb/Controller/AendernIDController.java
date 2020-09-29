package eu.imninja.dostuffweb.Controller;

import eu.imninja.dostuffweb.DAO.TaskDAO;
import eu.imninja.dostuffweb.Repository.TaskRepository;
import eu.imninja.dostuffweb.Repository.TaskerRepository;
import eu.imninja.dostuffweb.Repository.WiederholungenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AendernIDController {


    @Autowired
    TaskRepository taskRepository;
    @Autowired
    TaskerRepository taskerRepository;
    @Autowired
    WiederholungenRepository wiederholungenRepository;

    @GetMapping("/aendernid")
    public String deleteID(@RequestParam int id, Model model) {
        model.addAttribute("taskers",taskerRepository.findAll());
        model.addAttribute("task",taskRepository.findById(id).get());
        model.addAttribute("wiederholungen",wiederholungenRepository.findAll());
        return "aendernid";
    }

}
