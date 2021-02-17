package timeToGame;
import java.util.Scanner;

public class RandoGame {
	int num;
	int temp;
	int high;
	int low;
	int userNum = -1;

	private void giveNum() {
		//creates a scanner object
		Scanner q = new Scanner(System.in);
		//check if its the first time running it
		if (this.userNum == -1) {
			//assigns the value entered to userNum
			this.userNum = q.nextInt();
		}
		//if it isn't the first time running the program, then go here
		else {
			System.out.println("Please enter your next guess.");
			this.userNum = q.nextInt();
		}
		q.close();
	}
	private void checkPos(int x) {

		if (x > this.userNum) {

		}
		else if (x == this.userNum) {

		}
		else {
			System.out.println("Too Low");
		}

	}




	public void main(String[] args) {
		System.out.println("Welcome to the random Game 9000, please enter any whole number.");
		giveNum();

		//check if its higher or lower recursively
	}



}
