package _01_methods._5_FlappyBird;

import processing.core.PApplet;
import processing.core.PImage;

public class FlappyBird extends PApplet {
	static final int WIDTH = 800;
	static final int HEIGHT = 600;
	PImage bird;
	PImage flappyBackground;
	int x = 50;
	int y;
	int birdYVelocity = -8;
	int gravity = 1;
	int pipeX = 800;

	int upperPipeHeight = (int) random(100, 400);
	int pipeGap = 170;
	int lowerY = upperPipeHeight + pipeGap;
	int score;
	boolean pipeCleared = false;

	@Override
	public void settings() {
		size(WIDTH, HEIGHT);
		bird = loadImage("images/bird.png");
		bird.resize(40, 40);

		flappyBackground = loadImage("images/flappyBackground.jpg");
		flappyBackground.resize(800, 600);
	}

	@Override
	public void setup() {

	}

	@Override
	public void draw() {
		background(flappyBackground);

		textSize(20);
		text("score" + score, 200, 20);
		image(bird, x, y);
		y += birdYVelocity;
		birdYVelocity += gravity;
		fill(0, 255, 0, 200);
		rect(pipeX, 0, 70, upperPipeHeight);
		rect(pipeX, lowerY, 70, 600 - (upperPipeHeight + pipeGap));
		pipeX -= 3 + score / 2;

		teleportPipes();
		boolean crazy = intersectsPipes();
		if (crazy == true) {
			System.exit(0);
		}
		if (pipeX < 0 && pipeCleared == false) {
			pipeCleared = true;
			score++;
			pipeGap -= 4;
		}
			
	}

	public void teleportPipes() {
		if (pipeX < -70) {
			pipeX = 800;
			upperPipeHeight = (int) random(100, 400);
			lowerY = upperPipeHeight + pipeGap;
			pipeCleared = false;
		}

	}

	public void mousePressed() {
		birdYVelocity = -10;
	}

	boolean intersectsPipes() {
		if (y < upperPipeHeight && x > pipeX && x < (pipeX + 70)) {
			return true;
		} else if (y > lowerY && x > pipeX && x < (pipeX + 70)) {
			return true;
		} else {
			return false;
		}
	}

	static public void main(String[] args) {
		PApplet.main(FlappyBird.class.getName());
	}
}
