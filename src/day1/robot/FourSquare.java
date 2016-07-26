package day1.robot;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	Robot a = new Robot();

	void go() {
		a.setSpeed(10);
		a.setPenWidth(5);
		for (int i = 0; i < 6; i++) {
			a.setRandomPenColor();
			drawTriangle();
			a.turn(60);
		}
	}

	void drawTriangle() {
		a.penDown();
		for (int i = 0; i < 3; i++) {
			a.move(100);
			a.turn(120);
		}
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}