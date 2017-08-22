import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Neil");
		JFrame	frame	=	new JFrame();
		JLabel redLabel	=	new JLabel("Red");
		JLabel greenLabel	=	new JLabel("Green");
		JLabel blueLabel	=	new JLabel("Blue");
		
		JTextField	red	=	new JTextField(10);
		JTextField	green	=	new JTextField(10);
		JTextField	blue	=	new JTextField(10);
		
		
		redLabel.setLabelFor(red);
		JSlider	s1	=	new JSlider(0,200,100);
		s1.setPreferredSize(new Dimension(750,100));
		s1.setVisible(true);
		
			s1.setPaintTicks(true);
			s1.setMajorTickSpacing(10);
			s1.setMinorTickSpacing(10);
			s1.setPaintLabels(true);
			Bubble b1 	=	new Bubble();
			b1.setLayout(new FlowLayout(FlowLayout.TRAILING));
			s1.addChangeListener(b1);
			b1.add(s1);
			redLabel.setLabelFor(red);
			greenLabel.setLabelFor(green);
			blueLabel.setLabelFor(blue);
			b1.add(redLabel);
			b1.add(greenLabel);
			b1.add(green);
			b1.add(red);
			
			
		
			frame.setVisible(true);
			frame.setSize(800, 600);
		
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//			frame.add(s1);
			
			frame.add(b1);
	}

}
