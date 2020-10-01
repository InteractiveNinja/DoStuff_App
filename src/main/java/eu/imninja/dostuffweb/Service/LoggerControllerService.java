package eu.imninja.dostuffweb.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class LoggerControllerService {

    Logger logger = LoggerFactory.getLogger(LoggerControllerService.class);

    public void logInfo(String msg) {
        logger.info(msg);
    }
}
