import java.awt.Dimension;
import javax.swing.*;

public class Main {

	public static void main(String[] args) {
	
		System.out.println("Neil");
		JFrame	frame		=	new JFrame();
		Bubble 	b1 			=	new Bubble();
		JLabel 	redLabel	=	new JLabel("Red");
		JLabel 	greenLabel	=	new JLabel("Green");
		JLabel 	blueLabel	=	new JLabel("Blue");
		JButton	btn1		=	new JButton("Submit");
		JTextField	red		=	new JTextField(5);
		JTextField	green	=	new JTextField(5);
		JTextField	blue	=	new JTextField(5);
		JSlider	s1	=	new JSlider(0,200,100);
		
		s1.setPreferredSize(new Dimension(750,100));
		s1.setVisible(true);
	
		
			s1.setPaintTicks(true);
			s1.setMajorTickSpacing(10);
			s1.setMinorTickSpacing(10);
			s1.setPaintLabels(true);
			
			
			b1.add(redLabel);
			b1.add(red);
			b1.add(blueLabel);
			b1.add(blue);
			b1.add(greenLabel);
			b1.add(green);
			b1.add(btn1);
			b1.add(s1);
			
		
			frame.setVisible(true);
			frame.setSize(800, 600);
		
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			
			frame.add(b1);
	}

}
