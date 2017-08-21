import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Bubble extends JPanel implements ChangeListener{
	
		int raduis	=	0;
		Random x	=	new Random();  

	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		
			JSlider source	= (JSlider)e.getSource();
			
				raduis	=	source.getValue();
				repaint();
		
	}

	@Override
	public void paint(Graphics arg0) {
		// TODO Auto-generated method stub
		super.paint(arg0);
		
		int x	=	((super.getWidth()/2)-(raduis/2));
		int y	=	((super.getHeight()/2)-(raduis/2));
		if(raduis	== 0 ) {
		arg0.fillOval(x, y, 50, 50);
		} else {
			arg0.fillOval(x, y, raduis, raduis);
		}
	}
}
