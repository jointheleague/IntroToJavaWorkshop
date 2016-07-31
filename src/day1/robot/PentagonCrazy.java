package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

/* Teacher’s note: before beginning, draw a pentagon and have students work out the angle that the robot will have to turn (360/5) */

public class PentagonCrazy {

	private void makePrettyThings() {
		Robot a = new Robot();
		a.penDown();
		a.setSpeed(10);
		int sides = 5;
		int angle = 360/sides;
		for (int i = 0; i < 200; i++) {
			a.setRandomPenColor();
			a.move(2*i);				
			a.turn(angle);	
			a.turn(1);
		}
	}

	// Variations:
	// *12. make the pattern really huge
	// *13. randomize the color of the pattern 
	// *14. experiment with different shapes

	public static void main(String[] args) {
		new PentagonCrazy().makePrettyThings();
	}
}