package Utl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by pav15p on 22/02/2017.
 */
public class Log {
    /**
     * Uninheritable final calss
     */
    private Class<?> clazz;
    /**
     * private logger instance declaration
     */
    private Logger logger;

    /**
     * Creating the generic type class constructor
     *
     * @param clazz
     */
    public Log(Class<?> clazz) {
        this.clazz = clazz;
        this.logger = LoggerFactory.getLogger(clazz);
    }

    /**
     * to log the message at the Info level
     *
     * @param message
     * @return
     */
    public void info(String message) {
        logger.info(clazz.getCanonicalName() + ": " + message);
    }

    /**
     * to log the message at the error level
     *
     * @param message
     */
    public void error(String message) {
        logger.error(clazz.getCanonicalName() + ":" + message);
    }

    /**
     * to log the message at the trace level
     *
     * @param message
     */
    public void trace(String message) {
        logger.trace(clazz.getCanonicalName() + ": " + message);
    }

    /**
     * to log the message at the warn level
     *
     * @param message
     */
    public void warn(String message) {
        logger.warn(clazz.getCanonicalName() + ": " + message);
    }
}
