package shenjiaqi.bookkeeper;

import javax.swing.*;

/**
 *
 * @author Shen Jiaqi
 * @version 2014/12/21
 */
public class BookKeeperFrame extends JFrame {
	public BookKeeperFrame( ) {
		add( new MonthlyCostComponent() );
		pack();
	}
}
