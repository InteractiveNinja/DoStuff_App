package eu.imninja.dostuffweb.Controller;

import eu.imninja.dostuffweb.DAO.KioskDAO;
import eu.imninja.dostuffweb.Repository.KioskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IPController {


    @Autowired
    KioskRepository kioskRepository;

    @PostMapping(value = "/ip")
    @ResponseBody
    public String addIP(@RequestParam String ip, @RequestParam String hostname) {

        KioskDAO kiosk = new KioskDAO();
        kiosk.setHostname(hostname);
        kiosk.setIp(ip);
        kioskRepository.save(kiosk);

        return "done";
    }
}
