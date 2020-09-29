package eu.imninja.dostuffweb.Controller;

import eu.imninja.dostuffweb.Repository.TaskRepository;
import eu.imninja.dostuffweb.Repository.TaskerRepository;
import eu.imninja.dostuffweb.Repository.WiederholungenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PlanenController {

    @Autowired
    TaskerRepository taskerRepository;
    @Autowired
    WiederholungenRepository wiederholungenRepository;

    @GetMapping("/planen")
    public String planen(Model model) {
        model.addAttribute("taskers",taskerRepository.findAll());
        model.addAttribute("wiederholungen",wiederholungenRepository.findAll());
        return "planen";
    }


}

