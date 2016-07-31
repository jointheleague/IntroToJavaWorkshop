package day3;

import javax.swing.JOptionPane;

public class Greeter {
	
	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog("What's your name?");
		System.out.println("Hello " + answer);
		JOptionPane.showMessageDialog(null, "Hello " + answer);
	}

}
