package excerpt.client.service;

import excerpt.client.conf.ConfigReader;
import excerpt.client.conf.ConfigWriter;
import excerpt.client.ui.FrameManager;

/**
 * @author Shen Jiaqi
 * @version 2015/2/1
 */
public class SourceService {
    private static SourceService sourceService;
    private FrameManager frameManager;
    private ConfigWriter configWriter;
    private ConfigReader configReader;

    private SourceService(){
        configWriter = ConfigWriter.getInstance();
        configReader = ConfigReader.getInstance();
        frameManager = FrameManager.getInstance();
    }

    public static synchronized SourceService getInstance() {
        if (sourceService == null) {
            return new SourceService();
        } else {
            return sourceService;
        }
    }

    public void init() {
        configWriter.initConfigWriter();
        configReader.initConfigReader();
        frameManager.initMainFrame();
    }
}
