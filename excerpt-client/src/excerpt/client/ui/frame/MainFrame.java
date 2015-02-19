package excerpt.client.ui.frame;

import excerpt.client.ui.panel.MainPanel;
import excerpt.client.ui.panel.MenuBar;
import excerpt.client.ui.panel.StatusBar;

import javax.swing.*;
import java.awt.*;

/**
 * @author Shen Jiaqi
 * @version 2015/2/17
 */
public class MainFrame extends JFrame {

    private static final int DEFAULT_WIDTH = 600;
    private static final int DEFAULT_HEIGHT = 400;

    private JMenuBar menuBar;
    private JPanel statusBar;
    private JPanel mainPanel;

    public MainFrame() {
        setLocationByPlatform(true);
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        setTitle("::::..Cool Excerpt..::::");
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
            SwingUtilities.updateComponentTreeUI(this);
        } catch (Exception ex) {

        }


        menuBar = new MenuBar();
        setJMenuBar(menuBar);



        statusBar = new StatusBar();
        add(statusBar, BorderLayout.SOUTH);

        mainPanel = new MainPanel();
        add(new JScrollPane(mainPanel), BorderLayout.CENTER);

//        pack();
    }


}
