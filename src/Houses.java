import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot gumi;
	public static void main(String[] args) {
		gumi = new Robot("mini");
		Houses megpoid = new Houses();
		Random rand = new Random();
		gumi.setX(25);
		gumi.setY(350);
		gumi.penDown();
		gumi.setSpeed(10);
		gumi.setPenWidth(5);
		
		megpoid.drawHouse("large", "glitterbeige");
		megpoid.drawHouse("medium", "purple");
		megpoid.drawHouse("small", "blue");
		megpoid.drawHouse("medium", "orange");
		megpoid.drawHouse("medium", "green");
		megpoid.drawHouse("large", "red");
		megpoid.drawHouse("small", "glitterbeige");
		megpoid.drawHouse("medium", "yellow");
		megpoid.drawHouse("large", "blue");
		megpoid.drawHouse("large", "orange");
	}

	void drawHouse(String height, String color) {
		//height
			int tall = 0;
			if (height.equalsIgnoreCase("small")) {
				tall = 60;
			} else
				if (height.equalsIgnoreCase("medium")) {
					tall = 120;
				} else
					if (height.equalsIgnoreCase("large")) {
						tall = 250;
					} else {
						tall = 100;
					}
		//color
			if (color.equalsIgnoreCase("red")) {
				gumi.setPenColor(203, 41, 8);
				} else
					if (color.equalsIgnoreCase("orange")) {
						gumi.setPenColor(255, 158, 0);
					} else
						if (color.equalsIgnoreCase("yellow")) {
							gumi.setPenColor(255, 255, 0);
						} else
							if (color.equalsIgnoreCase("green")) {
								gumi.setPenColor(69, 245, 70);
							} else
								if (color.equalsIgnoreCase("blue")) {
									gumi.setPenColor(69, 231, 245);
								} else
									if (color.equalsIgnoreCase("purple")) {
										gumi.setPenColor(99, 12, 193);
									} else
										if (color.equalsIgnoreCase("glitterbeige")) {
											gumi.sparkle();
											gumi.setPenColor(247, 213, 145);
										} else {
											gumi.setRandomPenColor();
										}
			
		//the actual frickin code
		gumi.move(tall);
		if (tall == 250) {
			drawFlatRoof();
		} else {
			drawPointyRoof();
		}
		gumi.move(tall);
		gumi.turn(-90);
		gumi.setPenColor(115, 157, 38);
		gumi.move(20);
		gumi.turn(-90);
		gumi.unSparkle();
	}
	
	void drawPointyRoof() {
		gumi.turn(45);
		gumi.move(15);
		gumi.turn(90);
		gumi.move(15);
		gumi.turn(45);
	}
	
	void drawFlatRoof() {
		gumi.turn(90);
		gumi.move(21);
		gumi.turn(90);
	}




}
