package eu.imninja.dostuffweb.Controller;

import org.springframework.stereotype.Controller;

@Controller
public class ErrorPageController {

    public String error() {
        return "error";
    }
}
