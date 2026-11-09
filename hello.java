import java.util.Scanner;
public class MultiplyNumber{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number you need to Multiply: ");
		int number = in.nextInt();

		for (int i = 1; i <= 12; i++){
			System.out.println(number + " x " +  i  + " = " + number * i);
		}
		
	}
}