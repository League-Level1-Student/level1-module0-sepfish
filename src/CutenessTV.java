import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class CutenessTV implements ActionListener {
	
	Dimension small = new Dimension(25,75);
	Random random = new Random();
	int rand = random.nextInt(3);
	
	public static void main(String[] args) {
		CutenessTV why = new CutenessTV();
		why.doWhatever();
	}
	
	public void doWhatever() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		JButton button = new JButton();
		button.setText("Click me!");
		button.addActionListener(this);
		frame.add(button);
		button.setPreferredSize(small);
		frame.pack();
	}
	
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
	     try {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(rand == 0) {
			showDucks();
			rand = random.nextInt(3);
		}
		if (rand == 1){
			showFrog();
			rand = random.nextInt(3);
		}
		if (rand == 2) {
			showFluffyUnicorns();
			rand = random.nextInt(3);
		}
		
	}
}
