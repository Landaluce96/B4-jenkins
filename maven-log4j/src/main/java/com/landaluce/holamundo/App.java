package com.landaluce.holamundo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        messages();
    }

    public static void messages(){
        Logger logger= LogManager.getLogger(App.class);
        logger.debug("This is a debug message");
        logger.info("This is an info message");
        logger.trace("This is a trace message");
        logger.warn("This is a warm message");
        logger.error("This is a error message");
        logger.fatal("This is a fatal message");
    }

}
