package timeToGame;
import java.util.Scanner;
import java.util.Random;

public class RandoGame {
	static int randNum;
	static int userNum = -1;
	static boolean flag = true;
	static int chances = 7;

	public static void main(String[] args) {
		//The game output
		System.out.println("Welcome to the Random Game 9000.\n");

		//create the random number
		Random rand = new Random();
		//assign range from 0-100 for random value
		randNum = rand.nextInt(101);

		System.out.println(randNum); //FIXME this is to reveal number.

		//set input value
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter any positive number between 0-100. You have 7 chances to guess the correct answer.");

		//check input
		while (flag) {
			try {
				userNum = input.nextInt();		
			} 
			catch (Exception e) {
				System.out.println("Please enter a valid number. You have " + chances + " chances left.");	
			}


			if (chances >= 0) {
				if (randNum < userNum) {
					System.out.println("Too High. Guess again!. You have " + chances + " chances left.");
					chances--;
				}
				
				else if (randNum == userNum) {
					System.out.println("You Win! The correct answer was: " + userNum);
					flag = false;
				}
				
				else if (randNum > userNum){
					System.out.println("Too Low. Guess again! You have " + chances + " chances left.");
					chances--;
				}
			}

			else {
				System.out.println("You have run out of lives. Thank you for playing. " + randNum + " was the random number.");
				flag = false;
			}
		}
		input.close();
	}
}

