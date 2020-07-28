package _04_int._1_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int userScore = 0;

		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String eggQuestion = JOptionPane.showInputDialog("What has to be broken before you can use it?");
		String eggQuestionAnswer = "egg";
		
		if(eggQuestion.equalsIgnoreCase(eggQuestionAnswer)) {
			JOptionPane.showMessageDialog(null, "You are correct!");
			userScore += 1;
		} else {
			JOptionPane.showMessageDialog(null, "Incorrect, the answer is an egg");
		}
		
		String lightQuestion = JOptionPane.showInputDialog("What can fill up a room but takes no space?");
		String lightQuestionAnswer = "light";
		
		if(lightQuestion.equalsIgnoreCase(lightQuestionAnswer)) {
			JOptionPane.showMessageDialog(null, "You are correct!");
			userScore += 1;
		} else {
			JOptionPane.showMessageDialog(null, "Incorrect, the answer is light");
		}
		
		JOptionPane.showMessageDialog(null, "Thank you for playing! Your score was " + userScore + ".");

		// 4. If they got the answer right, pop up "correct!" and increase the score by one

		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		
	}
}

