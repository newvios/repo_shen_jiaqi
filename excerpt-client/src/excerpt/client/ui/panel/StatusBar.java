package excerpt.client.ui.panel;

import javax.swing.*;

/**
 * @author Shen Jiaqi
 * @version 2015/2/17
 */
public class StatusBar extends JPanel {
    private JTextField statusText = new StatusText();

    public StatusBar() {
        add(statusText);
    }


    private class StatusText extends JTextField {
        public StatusText() {

        }

    }


}
