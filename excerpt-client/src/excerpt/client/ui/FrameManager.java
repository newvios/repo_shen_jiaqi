package excerpt.client.ui;

import javax.swing.*;
import java.awt.*;

/**
 * @author Shen Jiaqi
 * @version 2015/01/29
 */
public class FrameManager {

    private static FrameManager frameManager = null;

    private FrameManager() {
        initMainFrame();
    }

    public static synchronized FrameManager getInstance() {
        if (frameManager == null) {
            return new FrameManager();
        } else {
            return frameManager;
        }
    }

    public void initMainFrame() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}
