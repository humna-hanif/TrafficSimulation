
/********
* Traffic Light
* Author: Humna Hanif
* Date: Spring 2021, SER-120
* 
* App Class
* A Java Swing/AWT application that simulates a traffic light. 
* The App class is the main class that runs the program and extends the JFrame. It creates
 * the Frame for the panels to be displayed on.
*********/

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class App extends JFrame {
	public App() {
		super("Traffic Light");
		this.setSize(1000, 800);
		DrawingPanel dp = new DrawingPanel();
		this.add(dp, BorderLayout.CENTER);
		AutomaticHolder holder = new AutomaticHolder();
		ControlPanel cp = new ControlPanel(dp, holder);
		this.add(cp, BorderLayout.SOUTH);

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		this.setVisible(true);
	}

	public static void main(String[] args) {
		new App();
	}
}
