package day5;

import javax.swing.JOptionPane;

public class MadLibs {

	public static void main(String[] args) {
		String adj1 = JOptionPane.showInputDialog("Enter an adjective.");
		String adj2 = JOptionPane.showInputDialog("Enter an adjective.");
		String pln1 = JOptionPane.showInputDialog("Enter a plural noun.");
		String pln2 = JOptionPane.showInputDialog("Enter a plural noun.");
		String adj3 = JOptionPane.showInputDialog("Enter an adjective.");
		String n1 = JOptionPane.showInputDialog("Enter a noun.");
		String n2 = JOptionPane.showInputDialog("Enter a noun.");
		String pln3 = JOptionPane.showInputDialog("Enter a plural noun.");
		String adj4 = JOptionPane.showInputDialog("Enter an adjective.");
		String person = JOptionPane.showInputDialog("Enter a person in the room (male).");
		String adj5 = JOptionPane.showInputDialog("Enter an adjective.");
		String n3 = JOptionPane.showInputDialog("Enter a noun.");
		String adj6 = JOptionPane.showInputDialog("Enter an adjective.");
		String n4 = JOptionPane.showInputDialog("Enter a noun.");
		String pln4 = JOptionPane.showInputDialog("Enter a plural noun.");
		String pln5 = JOptionPane.showInputDialog("Enter a plural noun.");
		String adj7 = JOptionPane.showInputDialog("Enter an adjective.");
		String adj8 = JOptionPane.showInputDialog("Enter an adjective.");
		String adj9 = JOptionPane.showInputDialog("Enter an adjective.");
		JOptionPane.showMessageDialog(null,
				"Ladies and gentlemen, on this " + adj1 + " occasion it is a privilege to address such a/an " + adj2
						+ "-looking group of " + pln1 + ". I can tell from your smiling " + pln2
						+ " that you will support my " + adj3
						+ " program in the coming election. I promise that, if elected, there will be a/an " + n1
						+ " in every " + n2 + " and two " + pln3 + " in every garage. I want to warn you against my "
						+ adj4 + " opponent, Mr. " + person + ". The man is nothing but a/an " + adj5 + " " + n3
						+ ". He has a/an " + adj6 + " character and is working " + n4
						+ " in glove with the criminal element. If elected, I promise to eliminate vice. I will keep the "
						+ pln4 + " off the city's streets. I will keep crooks from dipping their " + pln5
						+ " in the public till. I promise you " + adj7 + " government, " + adj8 + " taxes, and " + adj9
						+ " schools.");
	}

}
