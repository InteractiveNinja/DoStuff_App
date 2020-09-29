package eu.imninja.dostuffweb.Controller;

import eu.imninja.dostuffweb.Repository.KioskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class KioskController {


    @Autowired
    KioskRepository kioskRepository;

    @GetMapping("/kiosk")
    public String home(Model model) {
        model.addAttribute("kiosks",kioskRepository.findAll());
        return "kiosk";
    }


}

