package excerpt.client.conf;

/**
 * @author Shen Jiaqi
 * @version 2015/01/29
 */
public class ConfigReader {
    private static ConfigReader reader;

    private ConfigReader() {

    }

    public static synchronized ConfigReader getInstance() {
        if (reader == null) {
            return new ConfigReader();
        } else {
            return reader;
        }
    }

    public void initConfigReader() {

    }
}
