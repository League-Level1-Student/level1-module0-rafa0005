package _04_gui_from_scratch._2_jack_in_the_box;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class JackInTheBox implements ActionListener {
	JFrame frame = new JFrame();
	JButton suprise = new JButton();
	int jack = 0;
	private void showPicture(String fileName) {
	     try {
	          JLabel imageLabel = createLabelImage(fileName);
	          JFrame frame = new JFrame();
	          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	          frame.add(imageLabel);
	          frame.setVisible(true);
	          frame.pack();
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}


	private JLabel createLabelImage(String fileName) {
	     try {
	          URL imageURL = getClass().getResource(fileName);
	          if (imageURL == null) {
	               System.err.println("Could not find image " + fileName);
	               return new JLabel();
	          } else {
	               Icon icon = new ImageIcon(imageURL);
	               JLabel imageLabel = new JLabel(icon);
	               return imageLabel;
	          }
	     } catch (Exception e) {
	          System.err.println("Could not find image " + fileName);
	          return new JLabel();
	     }
	}
	private void playSound(String soundFile) {
	     try {
	          AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
	          sound.play();
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}





        public static void main(String[] args) {
            new JackInTheBox().showButton();    
      }
        

		private void showButton() {
			// TODO Auto-generated method stub
			 frame.setVisible(true); 
			 frame.add(suprise);
			 frame.pack();
			 suprise.addActionListener(this);
			 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			  
			if(jack == 5) {
				JOptionPane.showMessageDialog(null, "Suprise");
			}
	
				 
			 }


		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println(jack);
			 jack +=1;
			 if(jack == 5) {
					JOptionPane.showMessageDialog(null, "Suprise");
					showPicture("jackInTheBox.png");
					playSound("homer-woohoo.wav");
				}
		
		}
			     
			
			 
		}
   


