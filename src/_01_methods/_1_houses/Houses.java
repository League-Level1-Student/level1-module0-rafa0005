package _01_methods._1_houses;

import java.awt.AWTException;

import org.jointheleague.graphical.robot.Robot;


/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class Houses {
	static Robot rob = new Robot(700, 500);
	public void run() {
		// Check the recipe to find out what code to put here
		
		
		
		
		rob.penDown();
		rob.setSpeed(10);
		house("small");
		house("large");
		house("small");
		house("medium");
		house("large");
		house("small");
		house("medium");
		house("large");
		house("small");
		
		
		
		
		
		}
	
		
	
		
		static void house(String height, String color ) {
			int h = 0;
			if(height.equals("small")) {
				h = 60;
			}
			
			
			if(height.equals("medium")) {
			h = 120;
			}
			
			
			if(height.equals("large")) {
				h = 250;
			}
			
			rob.turn(-90);
			rob.move(20);
			rob.turn(90);
			rob.move(h);
			rob.turn(-90);
			rob.move(20);
			rob.turn(-90);
			rob.move(h);
			rob.turn(180);
			
		}
			

	
		
		


	}

	
		
	

