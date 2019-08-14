package capgemini_labbook;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

	class Radiobutton extends JFrame implements ActionListener {
		private JRadioButton red;
		private JRadioButton orange;
		private JRadioButton green;
		Container container;
		public Radiobutton(){
			super("Radion Button Test");
			container = getContentPane();
			container.setLayout(new FlowLayout());
			setVisible(true);
			setSize(400,250);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		red= new JRadioButton("red");
		orange= new JRadioButton("orange");
		green= new JRadioButton("green");
		ButtonGroup group= new ButtonGroup();
		group.add(red);
		group.add(orange);
		group.add(green);
		red.addActionListener(this);
		orange.addActionListener(this);
		green.addActionListener(this);
		container.add(red);
		container.add(orange);
		container.add(green);
		
		}
		
		public void actionPerformed(ActionEvent e){
			if(e.getSource()==red)
			{
				container.setBackground(Color.red);
			}
			if(e.getSource()==orange)
			{
				container.setBackground(Color.orange);
			}
			if(e.getSource()==green)
			{
				container.setBackground(Color.green);
			}

		}
	}
	
	public class lab5_Ex1_TrafficLight {
	public static void main(String[] args) {
		Radiobutton r1= new Radiobutton();
	}
	
}
	