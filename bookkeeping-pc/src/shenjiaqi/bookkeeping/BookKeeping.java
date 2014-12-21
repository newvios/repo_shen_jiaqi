package shenjiaqi.bookkeeping;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Shen Jiaqi
 * @version 2014/12/21
 */
public class BookKeeping {
	public static void main(String[] args) {
		EventQueue.invokeLater( new Runnable() {
			@Override
			public void run( ) {
				JFrame mainFrame = new BookKeepingFrame(  );
				mainFrame.setTitle( "Book Keeping!" );
				mainFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
				mainFrame.setVisible( true );
			}
		} );
	}


}
