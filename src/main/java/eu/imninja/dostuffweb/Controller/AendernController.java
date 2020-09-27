package eu.imninja.dostuffweb.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AendernController {


    @GetMapping("/aendern")
    public String home() {
        return "aendern";
    }


}

