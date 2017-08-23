import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Bubble extends JPanel implements ChangeListener {

	private static final long serialVersionUID = 1L;
	private int raduis = 100;
	private int r, g, b;
	
//	Commit Test

	public void setColorParms(int red, int blue, int green) {
		this.r = red;
		this.b = blue;
		this.g = green;
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		JSlider source = (JSlider) e.getSource();
		raduis = source.getValue();
		repaint();
	}

	@Override
	public void paint(Graphics arg0) {
		super.paint(arg0);
		Color myColor = new Color(this.r, this.g, this.b);
		arg0.setColor(myColor);
		repaint();
		int x = ((super.getWidth() / 2) - (raduis / 2));
		int y = ((super.getHeight() / 2) - (raduis / 2));
		arg0.fillOval(x, y, raduis, raduis);
	}	
}
