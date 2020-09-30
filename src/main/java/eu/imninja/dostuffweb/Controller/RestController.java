package eu.imninja.dostuffweb.Controller;

import com.sun.xml.bind.v2.runtime.unmarshaller.XsiNilLoader;
import eu.imninja.dostuffweb.DAO.SingleTaskDAO;
import eu.imninja.dostuffweb.DAO.TaskDAO;
import eu.imninja.dostuffweb.Repository.TaskRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    TaskRepository taskRepository;

    public RestController(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @GetMapping(value = "/tasks")
    public List<SingleTaskDAO> today() {

        //Mapping from TaskDao to SingleTaskDao
        Set<TaskDAO> t = taskRepository.getAllToday();
        List<SingleTaskDAO> nt = new ArrayList<SingleTaskDAO>();
        for (TaskDAO ta:t
             ) {
            nt.add(new SingleTaskDAO(ta.getId(),ta.getBeschreibung(),ta.getZuerledigen(),ta.getTasker_id().getName(),ta.getWiederholungen_id().getName(),ta.isErledigt()));

        }

        return nt;
    }

}
