package eu.imninja.dostuffweb.Controller;

import eu.imninja.dostuffweb.Repository.TaskRepository;
import eu.imninja.dostuffweb.Repository.TaskerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DeleteController {
    
    @Autowired
    TaskRepository taskRepository;

    @GetMapping(value = "/delete")
    public String deleteById(@RequestParam int id) {
        taskRepository.deleteById(id);
        return "deleted";

    }
}
