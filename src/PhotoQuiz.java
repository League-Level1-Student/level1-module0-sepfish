/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */


import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		int score = 0;
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
                quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // This will make sure the program exits when you close the window

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image Address”)
        String imageurl = "https://www.thoughtco.com/thmb/V730t_mpJTCPloy2OdWuaWU4qHQ=/768x0/filters:no_upscale():max_bytes(150000):strip_icc()/103545157-56af5d8a3df78cf772c38ddb.jpg";
		// 2. create a variable of type "Component" that will hold your image
        Component component = createImage(imageurl);
		// 3. use the "createImage()" method below to initialize your Component

		// 4. add the image to the quiz window
        quizWindow.add(component);
		// 5. call the pack() method on the quiz window
        quizWindow.pack();
		// 6. ask a question that relates to the image
        String question1 = JOptionPane.showInputDialog("What color is the leaf?");
		// 7. print "CORRECT" if the user gave the right answer
        if (question1.equalsIgnoreCase("green")) {
        		System.out.println("CORRECT");
        		score++;
        } else {
		// 8. print "INCORRECT" if the answer is wrong
        		System.out.println("INCORRECT");
        }
		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
        quizWindow.remove(component);
		// 10. find another image and create it (might take more than one line of code)
        Component component2 = createImage("https://s3.amazonaws.com/s3.timetoast.com/public/uploads/photos/5784562/Compass_2.jpg?1477078027");
		// 11. add the second image to the quiz window
        quizWindow.add(component2);
		// 12. pack the quiz window
        quizWindow.pack();
		// 13. ask another question
        String question2 = JOptionPane.showInputDialog("Which way is the compass pointing?");
		// 14+ check answer, say if correct or incorrect, etc.
        if (question2.equalsIgnoreCase("northwest")) {
        		System.out.println("CORRECT");
        		score++;
        } else {
        		System.out.println("INCORRECT");
        }
        JOptionPane.showMessageDialog(null, "Your score is " + score);
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}





