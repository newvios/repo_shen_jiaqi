package excerpt.client.config;

/**
 * @author Shen Jiaqi
 * @version 2015/01/29
 */
public class XMLReader {
    private static XMLReader reader;
    private

    private XMLReader() {

    }

    public static synchronized XMLReader getInstance() {
        if (reader == null) {
            return new XMLReader();
        } else {
            return reader;
        }
    }

    public void initConfigReader() {

    }



}
