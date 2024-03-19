package array1;

public class Array {
	    public static void main(String[] args) {
	        int[] numbers = {12, 100, 23, 56, 15, 722, 202, 2, 78, 89};
	        int max = numbers[0];
    
	        for (int i = 1; i < numbers.length; i++) {
	            if (numbers[i] > max) {
	                max = numbers[i];
	            }
	        }

	        System.out.println("The largest number in the array is: " + max);
	    }
	}
