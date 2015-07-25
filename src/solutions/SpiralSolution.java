package solutions;
import org.jointheleague.graphical.robot.Robot;

public class SpiralSolution {

		public static void main(String[] args) {
			// 1. Create a new Robot and set its pen to the down position
			Robot robot = new Robot();
			robot.penDown();
			// 3. Set the robot to go as fast as possible
			robot.setSpeed(10);
			// 4. Do the following (steps 5-8) 75 times
			for(int i = 0; i < 75; i++)
			{
				// 6. Change the pen color to random
				robot.setRandomPenColor();
				// 5. Move the robot 5 times the current line number you are drawing (5*i)
				robot.move(5*i);
				// 2. Turn the robot 1/3 of 360 degrees to the right
				//rob.turn(360 / 3);
				// 7. Change the number of sides to 7 (don’t add a new line of code for this one!)
				robot.turn(360 / 7);
				// 8. Set the pen width to i
				robot.setPenWidth(i);
			}
		}
}