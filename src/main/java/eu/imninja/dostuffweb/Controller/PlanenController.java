package eu.imninja.dostuffweb.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PlanenController {


    @GetMapping("/planen")
    public String home() {
        return "planen";
    }


}

