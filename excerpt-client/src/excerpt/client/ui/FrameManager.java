package excerpt.client.ui;

import excerpt.client.ui.frame.MainFrame;

import javax.swing.*;
import java.awt.*;

/**
 * @author Shen Jiaqi
 * @version 2015/01/29
 */
public class FrameManager {

    private static FrameManager frameManager = null;

    private FrameManager() {

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
                JFrame excerptFrame = new MainFrame();
                excerptFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                excerptFrame.setVisible(true);
            }
        });
    }
}
