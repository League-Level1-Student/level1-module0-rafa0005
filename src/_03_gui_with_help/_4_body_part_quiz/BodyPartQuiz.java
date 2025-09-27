package _03_gui_with_help._4_body_part_quiz;

import java.awt.Image;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class BodyPartQuiz {

	// You can use the celebrity photos we have placed in the recipe java
	// package,or if you prefer, get celebrity photos from the Internet,
	// place them in the recipe package(body_part_quiz), and change the names below.

	String firstImage = "src/_03_gui_with_help/_4_body_part_quiz/Link2.jpg";
	String secondImage = "src/_03_gui_with_help/_4_body_part_quiz/kratos.jpg";
	String thirdImage = "src/_03_gui_with_help/_4_body_part_quiz/batman.jpg";
	String fourthImage = "src/_03_gui_with_help/_4_body_part_quiz/samus.jpg";
	String fifthImage = "src/_03_gui_with_help/_4_body_part_quiz/bowser.jpg";
	String sixthImage = "src/_03_gui_with_help/_4_body_part_quiz/mario.jpg";
	String seventhImage = "src/_03_gui_with_help/_4_body_part_quiz/donkeykong.jpg";
	String eighthImage = "src/_03_gui_with_help/_4_body_part_quiz/knight.jpg";
	String ninthImage = "src/_03_gui_with_help/_4_body_part_quiz/arkhamknight.jpg";
	String tenthImage = "src/_03_gui_with_help/_4_body_part_quiz/demondragon.jpg";
	String eleventhImage = "src/_03_gui_with_help/_4_body_part_quiz/devildoom.jpg";
	String twelfthImage = "src/_03_gui_with_help/_4_body_part_quiz/kingkrool.jpg";
	String thirteenthImage = "src/_03_gui_with_help/_4_body_part_quiz/darksamus.jpg";
	String fourteenthImage = "src/_03_gui_with_help/_4_body_part_quiz/masterchief.jpg";
	String fifteenthImage = "src/_03_gui_with_help/_4_body_part_quiz/doomslayer.jpg";
	String sixteenthImage = "src/_03_gui_with_help/_4_body_part_quiz/kraven.jpg";
	String seventeenthImage = "src/_03_gui_with_help/_4_body_part_quiz/venom.jpg";
	String eighteenthImage = "src/_03_gui_with_help/_4_body_part_quiz/peter parker.jpg";
	String nineteenthImage = "src/_03_gui_with_help/_4_body_part_quiz/milesmorales.jpg";
	String twentiethImage = "src/_03_gui_with_help/_4_body_part_quiz/odin.jpg";
	String twentyfirstImage = "src/_03_gui_with_help/_4_body_part_quiz/shadow.jpg";
	String twentysecondImage = "src/_03_gui_with_help/_4_body_part_quiz/loki.jpg";
	String twentythirdImage = "src/_03_gui_with_help/_4_body_part_quiz/hades.jpg";
	String twentyfourthImage = "src/_03_gui_with_help/_4_body_part_quiz/poseidon.jpg";
	String twentyfifthImage = "src/_03_gui_with_help/_4_body_part_quiz/zeus.jpg";
	
	
	
	JFrame window = new JFrame();
	JPanel panel = new JPanel();

	public void run() {
		initializeGui();
		startQuiz();
	}

	private void initializeGui() {
		initializeImageList();
		imageIterator = imageList.iterator();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.add(panel);
		window.setSize(1000, 1000);

		// 3. Change the size of the window so that you can only see part of the
		// image.
	
		showNextImage();

	}

	private void startQuiz() {

		// 1. Make an int variable to hold the score.
		int score =0;
		// 2. Set the size of the window in the initializeGui() method 
		
		// 4. Ask the user who this person is and store their answer
		String guess = JOptionPane.showInputDialog("who is this and which game are they from?");

		// 5. Check their answer. If they guessed correctly:
		// -- Tell them they are right and increase the score by 1
		if(guess.equalsIgnoreCase("link from the legend of zelda breath of the wild")) {
			JOptionPane.showMessageDialog(null, "you are correct");
			}
		else {
			JOptionPane.showMessageDialog(null, "you are incorrect");
		}
		
		showNextImage();
		guess = JOptionPane.showInputDialog("who is this and which game are they from?");
		
		if(guess.equalsIgnoreCase("kratos from god of war 3")) {
			JOptionPane.showMessageDialog(null, "you are correct");
		}
		else {
			JOptionPane.showMessageDialog(null, "you are incorrect");
		}
		showNextImage();
		guess = JOptionPane.showInputDialog("who is this and which game are they from?");
		if(guess.equalsIgnoreCase("batman from batman arkham knight")) {
			JOptionPane.showMessageDialog(null, "you are correct");
		}
		else {
			JOptionPane.showMessageDialog(null, "you are incorrect");
		}
		showNextImage();
		guess = JOptionPane.showInputDialog("who is this and which game are they from?");
		if(guess.equalsIgnoreCase("samus from metroid prime 4")) {
			JOptionPane.showMessageDialog(null, "you are correct");
			}
		else {
			JOptionPane.showMessageDialog(null, "you are incorrect");
		}
		showNextImage();
		guess = JOptionPane.showInputDialog("who is this and which game are they from?");
		if(guess.equalsIgnoreCase("bowser from bowsers fury")) {
			JOptionPane.showMessageDialog(null, "you are correct");
		}
		else {
			JOptionPane.showMessageDialog(null, "you are incorrect");
		}
		showNextImage();
		guess = JOptionPane.showInputDialog("who is this and which game are they from?");
		if(guess.equalsIgnoreCase("mario from mario odyssey")) {
			JOptionPane.showMessageDialog(null, "you are correct");
		}
		else {
			JOptionPane.showMessageDialog(null, "you are incorrect");
		}
		showNextImage();
		guess = JOptionPane.showInputDialog("who is this and which game are they from?");
		if(guess.equalsIgnoreCase("donkey kong from donkey kong bananza")) {
			JOptionPane.showMessageDialog(null, "you are correct");
			}
		else {
			JOptionPane.showMessageDialog(null, "you are incorrect");
		}
		showNextImage();
		guess = JOptionPane.showInputDialog("who is this and which game are they from?");
		if(guess.equalsIgnoreCase("knight from sonic frontiers")) {
			JOptionPane.showMessageDialog(null, "you are correct");
		}
		else {
			JOptionPane.showMessageDialog(null, "you are incorrect");
		}
		showNextImage();
		guess = JOptionPane.showInputDialog("who is this and which game are they from?");
		if(guess.equalsIgnoreCase("arkham knight from batman arkham knight")) {
			JOptionPane.showMessageDialog(null, "you are correct");
		}
		else {
			JOptionPane.showMessageDialog(null, "you are incorrect");
		}
		showNextImage();
		guess = JOptionPane.showInputDialog("who is this and which game are they from?");
		if(guess.equalsIgnoreCase("demon dragon from the legend of zelda tears of the kingdom")) {
			JOptionPane.showMessageDialog(null, "you are correct");
		}
		else {
			JOptionPane.showMessageDialog(null, "you are incorrect");
		}
		showNextImage();
		guess = JOptionPane.showInputDialog("who is this and which game are they from?");
		if(guess.equalsIgnoreCase("devil doom from shadow generations")) {
			JOptionPane.showMessageDialog(null, "you are correct");
		}
		else {
			JOptionPane.showMessageDialog(null, "you are incorrect");
		}
		showNextImage();
		guess = JOptionPane.showInputDialog("who is this and which game are they from?");
		if(guess.equalsIgnoreCase("king k rool from donkey kong bananza")) {
			JOptionPane.showMessageDialog(null, "you are correct");
			}
		else {
			JOptionPane.showMessageDialog(null, "you are incorrect");
		}
		showNextImage();
		guess = JOptionPane.showInputDialog("who is this and which game are they from?");
		
		if(guess.equalsIgnoreCase("dark samus from metroid prime 4")) {
			JOptionPane.showMessageDialog(null, "you are correct");
		}
		else {
			JOptionPane.showMessageDialog(null, "you are incorrect");
		}
		showNextImage();
		guess = JOptionPane.showInputDialog("who is this and which game are they from?");
		if(guess.equalsIgnoreCase("master chief from halo 3")) {
			JOptionPane.showMessageDialog(null, "you are correct");
		}
		else {
			JOptionPane.showMessageDialog(null, "you are incorrect");
		}
		showNextImage();
		guess = JOptionPane.showInputDialog("who is this and which game are they from?");
		if(guess.equalsIgnoreCase("doomslayer from doom")) {
			JOptionPane.showMessageDialog(null, "you are correct");
			}
		else {
			JOptionPane.showMessageDialog(null, "you are incorrect");
		}
		showNextImage();
		guess = JOptionPane.showInputDialog("who is this and which game are they from?");
		if(guess.equalsIgnoreCase("kraven the hunter from spiderman 2")) {
			JOptionPane.showMessageDialog(null, "you are correct");
		}
		else {
			JOptionPane.showMessageDialog(null, "you are incorrect");
		}
		showNextImage();
		guess = JOptionPane.showInputDialog("who is this and which game are they from?");
		if(guess.equalsIgnoreCase("venom from spiderman 2")) {
			JOptionPane.showMessageDialog(null, "you are correct");
		}
		else {
			JOptionPane.showMessageDialog(null, "you are incorrect");
		}
		showNextImage();
		guess = JOptionPane.showInputDialog("who is this and which game are they from?");
		if(guess.equalsIgnoreCase("peter parker from spiderman 2")) {
			JOptionPane.showMessageDialog(null, "you are correct");
			}
		else {
			JOptionPane.showMessageDialog(null, "you are incorrect");
		}
		showNextImage();
		guess = JOptionPane.showInputDialog("who is this and which game are they from?");
		if(guess.equalsIgnoreCase("miles morales from spiderman 2")) {
			JOptionPane.showMessageDialog(null, "you are correct");
		}
		else {
			JOptionPane.showMessageDialog(null, "you are incorrect");
		}
		showNextImage();
		guess = JOptionPane.showInputDialog("who is this and which game are they from?");
		if(guess.equalsIgnoreCase("odin from god of war rangarok ")) {
			JOptionPane.showMessageDialog(null, "you are correct");
		}
		else {
			JOptionPane.showMessageDialog(null, "you are incorrect");
		}
		showNextImage();
		guess = JOptionPane.showInputDialog("who is this and which game are they from?");
		if(guess.equalsIgnoreCase("shadow from shadow generations")) {
			JOptionPane.showMessageDialog(null, "you are correct");
		}
		else {
			JOptionPane.showMessageDialog(null, "you are incorrect");
		}
		showNextImage();
		guess = JOptionPane.showInputDialog("who is this and which game are they from?");
		if(guess.equalsIgnoreCase("loki from god of war ragnarok")) {
			JOptionPane.showMessageDialog(null, "you are correct");
		}
		else {
			JOptionPane.showMessageDialog(null, "you are incorrect");
		}
		showNextImage();
		guess = JOptionPane.showInputDialog("who is this and which game are they from?");
		if(guess.equalsIgnoreCase("hades from god of war 3")) {
			JOptionPane.showMessageDialog(null, "you are correct");
		}
		else {
			JOptionPane.showMessageDialog(null, "you are incorrect");
		}
		showNextImage();
		guess = JOptionPane.showInputDialog("who is this and which game are they from?");
		if(guess.equalsIgnoreCase("poseidon from god of war 3")) {
			JOptionPane.showMessageDialog(null, "you are correct");
		}
		else {
			JOptionPane.showMessageDialog(null, "you are incorrect");
		}
		showNextImage();
		guess = JOptionPane.showInputDialog("who is this and which game are they from?");
		if(guess.equalsIgnoreCase("zeus from god of war 3")) {
			JOptionPane.showMessageDialog(null, "you are correct");
		}
		else {
			JOptionPane.showMessageDialog(null, "you are incorrect");
		}
		showNextImage();
		
		// 6. Otherwise:
		// -- Tell them they are wrong and who the person is

		// 7. Use the showNextImage() method below to get the next image
		showNextImage();

		// 8. .... repeat 4-7 for all your images.....

		// 9. Show them their current score
		
	}

	public void showNextImage() {
		window.remove(panel);
		panel = new JPanel();
		window.add(panel);
		
		panel.add(getNextImage());
		window.setVisible(true);
	}

	private JLabel loadImage(String fileName) {
		Icon icon = new ImageIcon(fileName);
		JLabel label = new JLabel(icon);
		return label;
	}

	ArrayList<JLabel> imageList = new ArrayList<JLabel>();
	Iterator<JLabel> imageIterator;

	private void initializeImageList() {
		JLabel imageLabel = loadImage(firstImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(secondImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(thirdImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(fourthImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(fifthImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(sixthImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(seventhImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(eighthImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(ninthImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(tenthImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(eleventhImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(twelfthImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(thirteenthImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(fourteenthImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(fifteenthImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(sixteenthImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(seventeenthImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(eighteenthImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(nineteenthImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(twentiethImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(twentyfirstImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(twentysecondImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(twentythirdImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(twentyfourthImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(twentyfifthImage);
		imageList.add(imageLabel);
		
	}

	private JLabel getNextImage() {
		if (imageIterator.hasNext())
			return imageIterator.next();

		return new JLabel("No more images");
	}
}