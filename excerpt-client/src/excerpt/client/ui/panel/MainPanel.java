package excerpt.client.ui.panel;

import javax.swing.*;
import java.awt.*;

/**
 * @author Shen Jiaqi
 * @version 2015/2/17
 */
public class MainPanel extends JPanel {
    private JPanel bookPanel1;
    private JPanel bookPanel2;
    private JPanel bookPanel3;
    private JPanel bookPanel4;
    private JPanel bookPanel5;
    private JPanel bookPanel6;

    public MainPanel() {
        this.setLayout(new GridLayout(2, 3));

        bookPanel1 = new BookPanel("Fifty Great Short Stories");
        bookPanel2 = new BookPanel("狼图腾(修订版)");
        bookPanel3 = new BookPanel("自控力(斯坦福大学最受欢迎的心理学课程)");
        bookPanel4 = new BookPanel("百年孤独(根据马尔克斯指定版本翻译,未做任何增删)");
        bookPanel5 = new BookPanel("Lean In Women, Work, and the Will to Lead");
        bookPanel6 = new BookPanel("In Cold Blood A True Account of a Multiple Murder and Its Consequences");


        this.add(bookPanel1);
        this.add(bookPanel2);
        this.add(bookPanel3);
        this.add(bookPanel4);
        this.add(bookPanel5);
        this.add(bookPanel6);


    }

/*    private class BookPanel extends JPanel {
        private Image bookImage = new ImageIcon(".\\images\\TestBook.jpg", "Just a test book.").getImage();

        private BookPanel() {
            setLayout(new BorderLayout());
            add(new JComponent() {
                @Override
                public void paintComponent(Graphics g) {
                    g.drawImage(bookImage, 0, 0, null);
                }
            }, BorderLayout.CENTER);

            add(new JTextField("Test Book!", 10), BorderLayout.SOUTH);
        }
    }*/

}
