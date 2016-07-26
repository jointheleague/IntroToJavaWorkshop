package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		Robot dexter = new Robot();
		dexter.setSpeed(800);
		dexter.penDown();
		dexter.setRandomPenColor();
		for (int i = 0; i < 360; i++) {
			dexter.move(5);
			dexter.turn(1);
		}

	}
}
