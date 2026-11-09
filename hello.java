import java.util.Scanner;
public class hello{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = in.nextInt();
		
		int sum = 0;
		while (number > 0) {
			sum += number % 10;
			number = number/10;
		}
		System.out.println(sum);
		
	}
}