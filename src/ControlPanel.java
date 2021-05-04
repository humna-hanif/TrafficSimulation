
/********
* Traffic Light
* Author: Humna Hanif
* Date: Spring 2021, SER-120
* 
* ControlPanel Class
* Class in which the control panel content is created with the four unique buttons. 
* An association with a holder is created to allow the user to only change
* the color of the light when the state of it is 2(or in other words the automatic
* change is off).
* An association with the DrawingPanel class is also created as it allows for the ellipse to 
* either change color or the timer to stop/start if the regular button is clicked.
*********/
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class ControlPanel extends JPanel {
	private JButton regular;
	private JRadioButton red, yellow, green;
	private DrawingPanel dp;
	private AutomaticHolder holder;
	private ButtonGroup bg;

	public ControlPanel(DrawingPanel dp, AutomaticHolder holder) {
		super();
		this.dp = dp;
		this.holder = holder;
		regular = new JButton("Change Off");
		regular.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (regular.getText().equals("Change Off")) {
					regular.setText("Change On");
					dp.stopTimer();
					holder.setState(2);
				} else {
					regular.setText("Change Off");
					dp.startTimer();
					holder.setState(1);
					bg.clearSelection();
				}

			}

		});

		red = new JRadioButton("Red");
		red.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (holder.getState() == 2) {
					dp.setColor(Color.red);
				}
			}

		});

		yellow = new JRadioButton("Yellow");
		yellow.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (holder.getState() == 2) {
					dp.setColor(Color.yellow);
				}

			}

		});

		green = new JRadioButton("Green");
		green.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (holder.getState() == 2) {
					dp.setColor(Color.green);
				}
			}

		});

		bg = new ButtonGroup();
		bg.add(red);
		bg.add(yellow);
		bg.add(green);

		this.add(regular);
		this.add(red);
		this.add(yellow);
		this.add(green);

	}
}