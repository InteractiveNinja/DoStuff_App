package eu.imninja.dostuffweb.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class KioskController {


    @GetMapping("/kiosk")
    public String home() {
        return "kiosk";
    }


}

