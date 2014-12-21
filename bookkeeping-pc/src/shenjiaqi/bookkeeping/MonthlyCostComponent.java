package shenjiaqi.bookkeeping;

import java.awt.*;

/**
 * @author Shen Jiaqi
 * @version 2014/12/21
 */
public class MonthlyCostComponent extends Component {
	public static final int TEXT_X = 50;
	public static final int TEXT_Y = 50;

	private static final int DEFAULT_WIDTH = 300;
	private static final int DEFAULT_HEIGHT = 100;

	public void paintComponent(Graphics graphics) {
		Graphics2D graphics2D = (Graphics2D) graphics;
		graphics2D.drawString( "Test of Monthly Cost", TEXT_X, TEXT_Y );
	}
}
