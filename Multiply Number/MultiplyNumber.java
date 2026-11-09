import java.util.Scanner;
public class MultiplyNumber{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number you need to Multiply: "); // User Input take
		int number = in.nextInt();
		
		//Multiply and print the output
		for (int i = 1; i <= 12; i++){
			System.out.printf("%d x %2d = %3d%n", number, i, number * i);
		}
		
	}
}