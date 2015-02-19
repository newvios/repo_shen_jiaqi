package excerpt.client.config;


public class XMLWriter {
    private static XMLWriter writer;

    private XMLWriter() {

    }

    public static synchronized XMLWriter getInstance() {
        if (writer == null) {
            return new XMLWriter();
        } else {
            return writer;
        }
    }

    public void initConfigWriter() {

    }
}
