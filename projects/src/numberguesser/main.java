package numberguesser;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int attempt = 1;
		int number = 0;
		int secretNumber = (int)(Math.random()* 99 + 1);
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to GuessNumber Game \nYou will be asked to guess a number to win the game \nYou have maximum 5 attempts");
		do {
			System.out.print("Enter a guess number between 1 to 100\n");
			if(scan.hasNext()) {
				number = scan.nextInt();
				if(number == secretNumber) 
				{
					System.out.println("Your number is correct.");
					break;
				}
				else if(number < secretNumber)
					System.out.println("Your number is smaller.");
				else if(number > secretNumber) 
					System.out.println("Your number is greater.");
				if(attempt == 5) {
					System.out.println("You have exceeded the maximum attempts.Try again");
					break;
				}
				attempt++;
				
			} else {
				System.out.println("Enter a valid integer number.");
				break;
			}
		}
		while (number != secretNumber);
		

	}

}
