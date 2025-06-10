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
		drawpointyroof("small");
		house("large");
		drawpointyroof("small");
		drawpointyroof("small");
		house("large");
		drawpointyroof("small");
		drawpointyroof("small");
		house("large");
		drawpointyroof("small");
		
		
	
		
		
		
		
		
		
		
		}
	
		
	
		
		




		static void house(String height ) {
			int h = 0;
			
			
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
			
			
			rob.setRandomPenColor();
			
		}
			
		static void drawpointyroof(String peak) {
			
			int i=0;
			if(peak.equals("small")){
				i = 60;
			}
			
			if(peak.equals("medium")){
				i = 120;
			}
			
			rob.turn(-90);
			rob.move(20);
			rob.turn(90);
			rob.move(100);
			rob.turn(-45);
			rob.move(20);
			rob.turn(-90);
			rob.move(20);
			rob.turn(-45);
			rob.move(100);
			rob.turn(180);
		rob.setRandomPenColor();	

}
		
		


	}

	
		
	

