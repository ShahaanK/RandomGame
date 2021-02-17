package timeToGame;
import java.util.Scanner;
import java.util.Random;

public class RandoGame {
	static int randNum;
	static int userNum = -1;
	static int flag = 0;

	private static void giveNum() {
		//creates a scanner object
		Scanner q = new Scanner(System.in);
		//check if its the first time running it
		if (userNum == -1) {
			//assigns the value entered to userNum
			userNum = q.nextInt();
		}
		else if (flag == 0) {
			q.close();
		}
		//if it isn't the first time running the program, then go here
		else {
			System.out.println("Please enter your next guess.");
			userNum = q.nextInt();
		}
	}
	
	private static void checkPos() {

		if (randNum > userNum) {
			System.out.println("Too High, Guess again");
		}
		else if (randNum == userNum) {
			System.out.println("You Win! The correct answer was: " + userNum);
			flag = 0;
		}
		else {
			System.out.println("Too Low");
		}

	}



	public static void main(String[] args) {
		System.out.println("Welcome to the random Game 9000, please enter any positive number between 0-100.");
		
		//create the random number
		Random rand = new Random();
		randNum = rand.nextInt(101);
		//System.out.println(randNum); FIXME this is to reveal number.
		
		//input
		Scanner q = new Scanner(System.in);
		
		while (flag == 0) {
			userNum = q.nextInt();
			
			if (randNum < userNum) {
				System.out.println("Too High, Guess again");
			}
			else if (randNum == userNum) {
				System.out.println("You Win! The correct answer was: " + userNum);
				flag = 1;
			}
			else {
				System.out.println("Too Low");
			}
			
			
		}
		
		q.close();
		//check if its higher or lower recursively
	}
}
