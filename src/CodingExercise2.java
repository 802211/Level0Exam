/* Level 0 Exam: Coding  Exercise #2 */
import javax.swing.JOptionPane;

/**
 * Write a program that asks the user for their age. 
 * Tell them which year they were born. 
 * If they are over 30, tell them they are too old to play this game.
 **/

public class CodingExercise2 {

	public static void main(String[]args){
	
	String age = JOptionPane.showInputDialog("How old are you?");
	int age2 = Integer.parseInt(age);
	int time = 2015;
	int year = time-age2;{
	
	if(age2 < 30){
		JOptionPane.showMessageDialog(null, "You can play the game. You were born in" +year);
	}
	else if(age2 > 30){	
JOptionPane.showMessageDialog(null, "You are too old to play the game. You were born in" +year);}
else {
	   if(age2 == 30){
			JOptionPane.showMessageDialog(null, "Wait a while. You will soon be too old to play the game. You were born" +year);}
		
		
		
}
	}

}
}


