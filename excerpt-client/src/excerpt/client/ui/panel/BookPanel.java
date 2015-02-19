package excerpt.client.ui.panel;

import javax.swing.*;
import java.awt.*;

/**
 * @author Shen Jiaqi
 * @version 2015/2/17
 */
public class BookPanel extends JPanel {
    private Image bookImage = new ImageIcon("images\\DefaultImage.jpg", "").getImage();

    public BookPanel(String bookName) {
        setLayout(new BorderLayout());
        setSize(50, 500);

        bookImage = new ImageIcon("image\\" + bookName + ".jpg", bookName).getImage();

        add(new JComponent() {
            @Override
            public void paintComponent(Graphics g) {
                g.drawImage(bookImage, 0, 0, this.getWidth(), this.getHeight(), this);
            }
        }, BorderLayout.CENTER);

        add(new JTextField("Test Book!"), BorderLayout.SOUTH);
    }
}
