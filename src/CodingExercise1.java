/* Level 0 Exam: Coding  Exercise #1 */
import javax.swing.JOptionPane;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;


public class CodingExercise1
{
	public static void main(String[] args)
	{
		// 3. ask the user what color they would like the tortoise to draw
	String colors = JOptionPane.showInputDialog("What are 2 colors you would like the tortoise to draw? Only color red, green, and purple. the 2 colors need to be different. "
			+ "If you don't choose one of these colors, you will get black.");
		// 4. use an if/else statement to set the pen color that the user requested (minimum of 2 colors)
		if (colors.equals ("red")){
			Tortoise.setPenColor(PenColors.Reds.Crimson);
		}
		else if(colors.equals("green")){
			Tortoise.setPenColor(PenColors.Greens.Green);
			
		}
		else if(colors.equals("purple")){
			Tortoise.setPenColor(PenColors.Purples.BlueViolet);
		}
		else{}
		// 2. set the pen width to 10
	Tortoise.setPenWidth(10);
	Tortoise.setSpeed(5);
		// 1. make the tortoise draw a shape

		for (int i = 0; i < 4; i++) {
			
		Tortoise.move(100);
		Tortoise.turn(90);

	}}
}

