package shenjiaqi.bookkeeping;

import javax.swing.*;

/**
 * @author Shen Jiaqi
 * @version 2014/12/21
 */
public class BookKeepingFrame extends JFrame {
	public BookKeepingFrame() {
		add( new MonthlyCostComponent() );
		pack();
	}
}
