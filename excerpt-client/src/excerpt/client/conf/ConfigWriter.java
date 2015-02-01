package excerpt.client.conf;


public class ConfigWriter {
	private static ConfigWriter writer;

    private ConfigWriter() {

    }

    public static synchronized ConfigWriter getInstance() {
        if (writer == null) {
            return new ConfigWriter();
        } else {
            return writer;
        }
    }

    public void initConfigWriter() {

    }
}
