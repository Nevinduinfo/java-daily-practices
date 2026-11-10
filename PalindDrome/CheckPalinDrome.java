import java.util.Scanner;
public class CheckPalinDrome{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a string or phrase: ");
		String original = scanner.nextLine();
		
		String cleaned = original.replaceAll("\\s","").toLowerCase();

		String reversed = new StringBuilder(cleaned).reverse().toString();

		if (cleaned.equals(reversed)) {
            		System.out.println("\"" + original + "\" IS a palindrome!");
       		 } else {
           		 System.out.println("\"" + original + "\" is NOT a palindrome.");
        }
	}
}