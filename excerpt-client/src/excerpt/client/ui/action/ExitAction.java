package excerpt.client.ui.action;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * @author Shen Jiaqi
 * @version 2015/2/17
 */
public class ExitAction extends AbstractAction {

    public ExitAction(String name) {
        putValue(Action.NAME, name);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
}
