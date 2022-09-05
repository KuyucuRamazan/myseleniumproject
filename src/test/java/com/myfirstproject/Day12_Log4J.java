package com.myfirstproject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class Day12_Log4J {
    private static Logger logger= LogManager.getLogger(Day12_Log4J.class.getName());
    @Test
    public void log4jTest(){
        logger.warn("Warning Log!");
        logger.fatal("Fatal Log!");
        logger.error("Error log!");
        logger.debug("Debug Log!");
        logger.info("Info Log'");
    }
}
