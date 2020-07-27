package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthday {
	
	public static void main(String[] args) {
		String unbirthday = JOptionPane.showInputDialog("When is your birthday? ex. 05/15");
		String unbirthdayAnswer = "07/27";
		
		if(unbirthday.equals(unbirthdayAnswer)) {
			JOptionPane.showMessageDialog(null, "Happy Birthday!");
		} else {
			JOptionPane.showMessageDialog(null, "Happy Unbirthday!");
		}
		
		
		
		
		
	}

}
