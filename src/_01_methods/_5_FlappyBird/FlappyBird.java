package _01_methods._5_FlappyBird;

import processing.core.PApplet;
import processing.core.PImage;

public class FlappyBird extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        
    }

    @Override
    public void draw() {
    	PImage bird;
    	
    	bird = loadImage("images/bird.png");
    	bird.resize(40, 40);
        image(bird, 50, 300);
       
    }
       
                 

    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
}
