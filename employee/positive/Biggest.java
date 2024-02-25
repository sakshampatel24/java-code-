package positive;

public class Biggest {
 public static void main(String[]args) {
	 int number1 = 12, number2 = 14, number3 = 15;
	  int max = number1;
	 switch(max) {
	  case 10:
if(number2>max) {
             max = number2;
		   }
	    case 20:
		   if(number3 > max) {
			   max = number3;
		   }
		   break;
	   }
	   System.out.println("The biggest number is:" +max);
   }

}
