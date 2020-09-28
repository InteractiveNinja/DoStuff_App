package eu.imninja.dostuffweb.Controller;

import eu.imninja.dostuffweb.DAO.TaskDAO;
import eu.imninja.dostuffweb.Repository.TaskRepository;
import eu.imninja.dostuffweb.Repository.TaskerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @Autowired
    TaskRepository taskRepository;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("tasks",taskRepository.findAll());

        return "home";
    }



}

