package shenjiaqi.bookkeeper;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

/**
 *
 * @author Shen Jiaqi
 * @version 2014/12/21
 */
public class BookKeeper {
	public static void main(String[] args) {
		EventQueue.invokeLater( new Runnable() {
			@Override
			public void run( ) {
				JFrame mainFrame = new BookKeeperFrame(  );
				mainFrame.setTitle( "Book Keeping!" );
				mainFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
				mainFrame.setVisible( true );
			}
		} );
	}

}
