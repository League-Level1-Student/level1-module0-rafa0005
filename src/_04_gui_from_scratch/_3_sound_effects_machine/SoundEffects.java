package _04_gui_from_scratch._3_sound_effects_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffects implements ActionListener  {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
        public static void main(String[] args) {
            new SoundEffects().showButton();
            
      }

		private void showButton() {
			// TODO Auto-generated method stub
			frame.setVisible(true);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.add(panel);
			panel.add(button);
			panel.add(button2);
			panel.add(button3);
			frame.pack();
			button.addActionListener(this);
			button2.addActionListener(this);
			button3.addActionListener(this);

		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
   }

