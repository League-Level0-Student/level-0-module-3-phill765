package _07_years_alive;

import javax.swing.JOptionPane;

public class yeras {
public static void main(String[] args) {
	String yearb = "";
	int yearint = 0;
	 yearb = JOptionPane.showInputDialog("What year were you born?");
	 yearint = Integer.parseInt(yearb);
	for ( int i = yearint; i <= 2019; i++) {
		System.out.println(i);
	}
}
}
