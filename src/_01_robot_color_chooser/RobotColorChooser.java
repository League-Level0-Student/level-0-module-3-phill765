//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _01_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;
import java.util.Random;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		int r = 0;
		int g = 0;
		int b = 0;
		boolean always = true;
		Random rancol = new Random();
		Robot color = new Robot();
		color.penDown();
		color.setSpeed(400);
		color.hide();
		while (always = true) {
			color.clear();
		//3. Ask the user what color they would like the robot to draw
		String cc = JOptionPane.showInputDialog("What color should the square be?");
		//5. Use an if/else statement to set the pen color that the user requested
		if (cc.equalsIgnoreCase("Red")) {
			color.setPenColor(255, 0, 0);
		} else if (cc.equalsIgnoreCase("Green")) {
			color.setPenColor(0, 255, 0);
		} else if (cc.equalsIgnoreCase("Blue")) {
			color.setPenColor(0, 0, 255);
		} else {
			r = rancol.nextInt(255);
			g = rancol.nextInt(255);
			b = rancol.nextInt(255);
			System.out.println(r+g+b);
			color.setPenColor(r, g, b);
		}
        //6. If the user doesn’t enter anything, choose a random color

        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		color.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)
		for (int i = 0; i < 4; i++) {
			color.move(100);
			color.turn(90);
		}
		}
	}
}
