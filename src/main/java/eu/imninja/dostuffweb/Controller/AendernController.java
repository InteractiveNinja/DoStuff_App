package eu.imninja.dostuffweb.Controller;

import eu.imninja.dostuffweb.Repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AendernController {

    @Autowired
    TaskRepository taskRepository;

    @GetMapping("/aendern")
    public String aendern(Model model) {
        model.addAttribute("tasks",taskRepository.findAll());
        return "aendern";
    }

}

