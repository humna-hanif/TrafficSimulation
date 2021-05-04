
/********
* Traffic Light
* Author: Humna Hanif
* Date: Spring 2021, SER-120
* 
* DrawingPanel Class
* Center panel which has an ellipse drawn in the center to repreent the light. 
* This class allows the color of the light to change every three seconds with
* the implementation of a timer.
*********/
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class DrawingPanel extends JPanel {
	private ColorEllipse ellipse;
	private Timer animationTimer;

	public DrawingPanel() {
		super();
		this.setBackground(Color.white);
		ellipse = new ColorEllipse();
		ellipse.setSize(400, 400);
		ellipse.setLocation(300, 100);
		ellipse.setColor(Color.green);
		animationTimer = new Timer(3000, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (ellipse.getFillColor() == Color.green) {
					ellipse.setFillColor(Color.yellow);
					ellipse.setBorderColor(Color.yellow);
					repaint();
				} else if (ellipse.getFillColor() == Color.yellow) {
					ellipse.setFillColor(Color.red);
					ellipse.setBorderColor(Color.red);
					repaint();
				} else {
					ellipse.setFillColor(Color.green);
					ellipse.setBorderColor(Color.green);
					repaint();
				}
			}

		});
		animationTimer.start();
	}

	public void stopTimer() {
		animationTimer.stop();
	}

	public void startTimer() {
		animationTimer.start();
	}

	public void setColor(Color color) {
		if (color == Color.green) {
			ellipse.setColor(Color.green);
			ellipse.setBorderColor(Color.green);
			repaint();
		} else if (color == Color.yellow) {
			ellipse.setColor(Color.yellow);
			ellipse.setBorderColor(Color.yellow);
			repaint();
		} else {
			ellipse.setColor(Color.red);
			ellipse.setColor(Color.red);
			repaint();
		}
	}

	// refreshing and redrawing the screen; only in the panel
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D brush = (Graphics2D) g;
		ellipse.paint(brush);
	}

}
