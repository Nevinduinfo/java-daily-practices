public class FizzBuzz{
	public static void main(String[] args){
		for (int i = 0; i <= 100; i++){   //loop runs until 100
			if (i % 5 == 0 & i % 3 == 0){	//find number can divide from 3 and 5
				System.out.println("Fizz Buzz");
			}else if (i % 5 == 0){	//find number can divide by 5
				System.out.println("Buzz");
			}else if (i % 3 == 0){	//find number can divide by 3
				System.out.println("Fizz");	
			} else {		//else print the number
				System.out.println(i);
			}
		}
		
	}
}