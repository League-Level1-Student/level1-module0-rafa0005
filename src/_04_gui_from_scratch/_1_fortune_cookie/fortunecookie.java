package _04_gui_from_scratch._1_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class fortunecookie implements ActionListener {
	JFrame frame = new JFrame();
	JButton button = new JButton("Click this");
public  void showButton() {
	System.out.println("Button clicked");
	
	frame.setVisible(true);
	frame.add(button);
	frame.pack();
	button.addActionListener(this);

}
@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	
	JOptionPane.showMessageDialog(null, "Woohoo!");
	int rand = new Random().nextInt(5);
	if(rand == 0) {
		JOptionPane.showMessageDialog(null, "You will become a billionaire");
	}
	if(rand == 1) {
		JOptionPane.showMessageDialog(null, "You will become be poor");
	}
	if(rand == 2) {
		JOptionPane.showMessageDialog(null, "You will become homeless");
	}
	if(rand == 3) {
		JOptionPane.showMessageDialog(null, "You will become a millionaire");
	}
	if(rand == 4) {
		JOptionPane.showMessageDialog(null, "You will become a you will be homeless but will eventuallly become a billionaire");
	}
}


}
