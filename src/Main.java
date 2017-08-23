import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Main extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	JTextField redT 	= new JTextField(5);
	JTextField greenT 	= new JTextField(5);
	JTextField blueT 	= new JTextField(5);
	Bubble b1 			= new Bubble();
	private int red, blue, green;

	public void setColors() {
		red		= Integer.parseInt(String.valueOf(redT.getText()));
		green 	= Integer.parseInt(String.valueOf(greenT.getText()));
		blue 	= Integer.parseInt(String.valueOf(blueT.getText()));
		b1.setColorParms(red, blue, green);
	}

	public Main() {
		JButton btn1 		= new JButton("Submit");
		JLabel  redLabel 	= new JLabel("Red");
		JLabel  greenLabel 	= new JLabel("Green");
		JLabel  blueLabel 	= new JLabel("Blue");
		JSlider s1 			= new JSlider(0, 200, 100);
		
		btn1.addActionListener(this);

		s1.setPreferredSize(new Dimension(750, 100));
		s1.setVisible(true);
		s1.setPaintTicks(true);
		s1.setMajorTickSpacing(10);
		s1.setMinorTickSpacing(10);
		s1.setPaintLabels(true);
		s1.addChangeListener(b1);
		
		b1.add(redLabel);
		b1.add(redT);
		b1.add(blueLabel);
		b1.add(blueT);
		b1.add(greenLabel);
		b1.add(greenT);
		b1.add(btn1);
		b1.add(s1);
		add(b1);
	}

	public static void createGUI() {
		JFrame frame = new Main();
		frame.setVisible(true);
		frame.setSize(800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		if (command.equals("Submit")) {
			setColors();
		}
	}

	public static void main(String[] args) {
		createGUI();
	}
}
