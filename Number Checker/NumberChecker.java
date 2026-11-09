import java.util.Scanner;
public class NumberChecker{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int number = 0;
		System.out.println("Enter a number: ");
		
		//Input Validation process - Number must be an integer
		while(!in.hasNextInt()) {
			System.out.println("Invalid Number Try again!");
			in.next();
		}

		//Value Assign to var
		number = in.nextInt();

		//Check number is positive or negative
		if (number < 0){
			System.out.println("It's a Negative number");
		} else {
			System.out.println("It's a Postive number");
		}

		//Check number is Odd or Even
		if (number%2 == 0){
			System.out.println("It's also an Even number");
		} else {
			System.out.println("It's also an Odd number");
		}
	
		//close Inputer handler
		in.close()
		
	}
}