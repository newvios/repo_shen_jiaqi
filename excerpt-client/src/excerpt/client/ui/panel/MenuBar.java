package excerpt.client.ui.panel;

import excerpt.client.ui.action.*;

import javax.swing.*;

/**
 * @author Shen Jiaqi
 * @version 2015/2/17
 */
public class MenuBar extends JMenuBar {
    public MenuBar() {
        addFileMenu();
        addEditMenu();
        addOptionMenu();
        addHelpMenu();
    }

    private void addFileMenu() {
        JMenu fileMenu = new JMenu("File");

        JMenuItem newItem = fileMenu.add(new NewAction("New"));
        JMenuItem openItem = fileMenu.add(new OpenAction("Open"));
        JMenuItem saveItem = fileMenu.add(new SaveAction("Save"));
        JMenuItem saveAsItem = fileMenu.add(new SaveAsAction("Save As"));
        JMenuItem exitItem = fileMenu.add(new ExitAction("Exit"));

        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.add(saveAsItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);

        this.add(fileMenu);
    }

    private void addEditMenu() {
        JMenu editMenu = new JMenu("Edit");

        this.add(editMenu);
    }

    private void addOptionMenu() {
        JMenu optionMenu = new JMenu("Option");

        JMenuItem preferenceItem = optionMenu.add(new PreferenceAction("Preference"));

        optionMenu.add(preferenceItem);

        this.add(optionMenu);
    }

    private void addHelpMenu() {
        JMenu helpMenu = new JMenu("Help");

        this.add(helpMenu);
    }


}
