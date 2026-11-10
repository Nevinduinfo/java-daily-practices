public class FindLargeSmallNumber{
	public static void main(String[] args){
		int[] numList = {10 , 12, 6, 55, 22, 3, 6 ,55, 77,1,32,6,7,8,9};
		int largest = 0;
		int smallest = numList[1];
		int secLarge = 0;
		for (int i = 0; i <= numList.length - 1; i++){
			if (numList[i] > largest) {
				largest = numList[i];
			} else if (numList[i] > secLarge) {
				secLarge = numList[i];
			}else if (numList[i] < smallest) {
				smallest = numList[i];
			}
		}
		System.out.println(largest);
		System.out.println(smallest);
		System.out.println(secLarge);		
	}
}