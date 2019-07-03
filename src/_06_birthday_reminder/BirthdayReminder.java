
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _06_birthday_reminder;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "January 24th";
		String dadsBirthday = "June 9th";
		String myBirthday = "May 2nd";

		// 2. Find out which birthday the user wants and and store their response in a variable
		String birth = JOptionPane.showInputDialog("What birthday do you want to know?");
		// 3. Print out what the user typed
		System.out.println(birth);
		// 4. if user asked for "mom"
			//print mom's birthday
		if (birth.equalsIgnoreCase("mom")) {
			System.out.println(momsBirthday);
		}
		// 5. if user asked for "dad"
			// print dad's birthday
		if (birth.equalsIgnoreCase("dad")) {
			System.out.println(dadsBirthday);
		}
		if (birth.equalsIgnoreCase("George")) {
			System.out.println(myBirthday);
		}
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
		else {
			JOptionPane.showMessageDialog(null, "Sorry, I don't know their birthday!");
		}

	} 
}
