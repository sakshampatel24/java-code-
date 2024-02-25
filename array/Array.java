package array;

public class Array {
public static void main(String[]args) {
	int[] Number = {10,20,40,50,67};
	int evenCount = 0;
	for(int num: Number) {
	if(num%2 == 0) {
		 evenCount++;
		}
	}
	System.out.println("Number of even number in the array: "+evenCount);	
	}
}
