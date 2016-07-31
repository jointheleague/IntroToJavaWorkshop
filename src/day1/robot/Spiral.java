package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		Robot a = new Robot();
		a.setSpeed(10);
		a.penDown();
		for (int i = 0; i < 75; i++) {
			a.setRandomPenColor();
			a.move(5*i);
			a.setPenWidth(i);
			a.turn(360/3);
		}

	}
}
