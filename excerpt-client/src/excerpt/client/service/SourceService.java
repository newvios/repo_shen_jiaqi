package excerpt.client.service;

import excerpt.client.config.XMLReader;
import excerpt.client.config.XMLWriter;
import excerpt.client.ui.FrameManager;

/**
 * @author Shen Jiaqi
 * @version 2015/2/1
 */
public class SourceService {
    private static SourceService sourceService;
    private FrameManager frameManager;
    private XMLWriter XMLWriter;
    private XMLReader XMLReader;

    private SourceService() {
        XMLWriter = XMLWriter.getInstance();
        XMLReader = XMLReader.getInstance();
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
        XMLWriter.initConfigWriter();
        XMLReader.initConfigReader();
        frameManager.initMainFrame();
    }
}
