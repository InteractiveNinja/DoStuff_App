package eu.imninja.dostuffweb.Logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class LoggerController {

    Logger logger = LoggerFactory.getLogger(LoggerController.class);

    public void logInfo(String msg) {
        logger.info(msg);
    }
}
