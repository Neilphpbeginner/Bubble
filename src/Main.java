import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Neil");
		JFrame	frame	=	new JFrame();
		JTextField	red	=	new JTextField("Red");
		red.setSize(3, 0);
		JSlider	s1	=	new JSlider(0,200,100);
		s1.setPreferredSize(new Dimension(750,100));
		s1.setVisible(true);
		
			s1.setPaintTicks(true);
			s1.setMajorTickSpacing(10);
			s1.setMinorTickSpacing(10);
			s1.setPaintLabels(true);
			Bubble b1 	=	new Bubble();
			b1.setLayout(new GridLayout(2, 3));
			s1.addChangeListener(b1);
			b1.add(s1);
			b1.add(red);
			
		
			frame.setVisible(true);
			frame.setSize(800, 600);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//			frame.add(s1);
			frame.add(b1);
	}

}
