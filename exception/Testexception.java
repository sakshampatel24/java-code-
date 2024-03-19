package exception;

public class Testexception {
	public static void main(String[]args) {
		int k,l;
		  k=12;
		  l=1;
		  
		  int[] arr = {1,3,4,6,9};
		 
		  
		  try {
		  System.out.println(k/l);
		  System.out.println(arr[5]);
		  }
		  catch(Exception e) {
			  System.out.println("Please enter bigger number than 0") ;
		  }
		  
	}

}
