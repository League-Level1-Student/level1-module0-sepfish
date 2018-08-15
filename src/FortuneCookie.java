import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	
	Dimension smol = new Dimension(100,100);
	Random random = new Random();
	int rand = random.nextInt(5);
	
	public static void main(String[] args) {
		FortuneCookie soap = new FortuneCookie();
		soap.showButton();
	}

	public void showButton() {
		JFrame frame = new JFrame();
		JButton button = new JButton();
		button.addActionListener(this);
		button.setPreferredSize(smol);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(button);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (rand == 0) {
			JOptionPane.showMessageDialog(null, "You will have a great day.");
			rand = random.nextInt(5);
		}
		if (rand == 1) {
			JOptionPane.showMessageDialog(null, "You will have an okay day.");
			rand = random.nextInt(5);
		}
		if (rand == 2) {
			JOptionPane.showMessageDialog(null, "You will code a lot today.");
			rand = random.nextInt(5);
		}
		if (rand == 3) {
			JOptionPane.showMessageDialog(null, "You will see a bee today.");
			rand = random.nextInt(5);
		}
		if (rand == 4) {
			JOptionPane.showMessageDialog(null, "You will have some luck today.");
			rand = random.nextInt(5);
		}
		JOptionPane.showMessageDialog(null, "This concludes your fortune. Come again soon.");
	}
}
