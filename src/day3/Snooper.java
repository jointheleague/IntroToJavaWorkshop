package day3;

import javax.swing.JOptionPane;

public class Snooper {
	
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("What is your name?");
		String age = JOptionPane.showInputDialog("How old are you?");
		String number = JOptionPane.showInputDialog("What is your phone number?");
		String address = JOptionPane.showInputDialog("What is your address?");
		String ssn = JOptionPane.showInputDialog("What's your social security number?");
		String gender = JOptionPane.showInputDialog("What is your gender?");
		String color = JOptionPane.showInputDialog("What's your favorite color?");
		JOptionPane.showMessageDialog(null, "Hello " + name + ". " + "You are " + age + " years old. Your phone number is "
				+ number + ", your address is " + address + ", and your social security number is " + ssn + ". You are a "
				+ gender + " and your favorite color is " + color + ".");
	}

}