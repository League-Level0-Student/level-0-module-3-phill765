package _04_are_you_happy;

import javax.swing.JOptionPane;

public class Happ {
public static void main(String[] args) {
	int emotion = JOptionPane.showConfirmDialog(null, "Are you happy?");
	System.out.println(emotion);
	if (emotion==0) {
		JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");
	} if (emotion==1) {
		int nothap = JOptionPane.showConfirmDialog(null, "Do you want to be happy?");
		if (nothap==0) {
			JOptionPane.showMessageDialog(null, "Then change something");
		} if (nothap==1) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");
		}
	}
}
}
