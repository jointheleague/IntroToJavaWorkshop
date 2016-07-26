package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class TriangleShell {

	Robot a = new Robot();
	
	void go() {
		a.setSpeed(10);
		int size = 50;
		for (int i = 0; i < 60; i++) {
			a.setRandomPenColor();
			size = size + 10;
			drawTriangle(size);
			a.turn(6);
		}
	}

	private void drawTriangle(int length) {
		a.penDown();
		for (int i = 0; i < 3; i++) {
			a.move(length);
			a.turn(120);
		}		
	}

	
	public static void main(String[] args) {
		new TriangleShell().go();
	}
}