package Utl;

import sun.security.krb5.Config;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by LT102 on 6/20/2017.
 */
class ConfigUtils {

    private ConfigUtils() {
        throw new IllegalStateException("ConfigUtils");
    }

    /**
     * This method reads and returns specified property from properties file
     * Note that VM argument -Dfuse.env=value is mandatory
     */
    public static String getProperty(String text) {
        Log log = new Log(ConfigUtils.class);
        Properties prop = new Properties();
        String propFileName = "config."+ ConfigUtils.getEnvironmentVariable()+".properties";

        InputStream inputStream = ConfigUtils.class.getClassLoader()
                .getResourceAsStream(propFileName);
        try {
            prop.load(inputStream);
        } catch (IOException e) {
            log.trace(e.getStackTrace());
        }
        if (inputStream == null) {
            try {
                throw new FileNotFoundException("Property file '"
                        + propFileName + "' not found in classpath");
            } catch (FileNotFoundException e) {
                log.trace(e.getStackTrace());
            }
        }

        return prop.getProperty(text);

    }

    /**
     * This method reads the environment variables supplied as vm arguments to
     * the program
     *
     * @return fusetest.env
     */
    private static String getEnvironmentVariable() {
        return System.getProperty("fusetest.env");
    }
}
