package _05_horoscope;

import javax.swing.JOptionPane;

public class Horo {
public static void main(String[] args) {
	String star = JOptionPane.showInputDialog("What is your star sign?");
	if (star.equalsIgnoreCase("aries")) {
		JOptionPane.showMessageDialog(null, "Dont be rude");
	}
	if (star.equalsIgnoreCase("taurus")) {
		JOptionPane.showMessageDialog(null, "Get a pizza");
	}
	if (star.equalsIgnoreCase("Gemini")) {
		JOptionPane.showMessageDialog(null, "Throw a book at someone");
	}
	if (star.equalsIgnoreCase("cancer")) {
		JOptionPane.showMessageDialog(null, "buy a soft blanket");
	}
	if (star.equalsIgnoreCase("Leo")) {
		JOptionPane.showMessageDialog(null, "go make a piece of pottery");
	}
	if (star.equalsIgnoreCase("virgo")) {
		JOptionPane.showMessageDialog(null, "don't think");
	}
	if (star.equalsIgnoreCase("libra")) {
		JOptionPane.showMessageDialog(null, "be yourself");
	}
	if (star.equalsIgnoreCase("scorpio")) {
		JOptionPane.showMessageDialog(null, "you have stuff dude");
	}
	if (star.equalsIgnoreCase("Sagittarius")) {
		JOptionPane.showMessageDialog(null, "Understand");
	}
	if (star.equalsIgnoreCase("capricorn")) {
		JOptionPane.showMessageDialog(null, "buy a hammer");
	}
	if (star.equalsIgnoreCase("aquarius")) {
		JOptionPane.showMessageDialog(null, "stay the same");
	}
	if (star.equalsIgnoreCase("Pisces")) {
		JOptionPane.showMessageDialog(null, "Belive");
	} else {
		JOptionPane.showMessageDialog(null, "Thats not a star sign!");
	}
}
}
