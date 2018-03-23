package fr.forgingaura.molecular_expansion;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Utils {

    private static Logger logger;

    public static Logger getLogger() {
        if(logger == null) {
            logger = LogManager.getFormatterLogger(Molecular_Expansion.MOD_ID);
        }
        return logger;
    }
}
