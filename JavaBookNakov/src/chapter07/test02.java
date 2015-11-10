package chapter07;
public class test02 {

	public static void main(String[] args) {
		
		    int numberArg = 3;
	 		    printNumberr(numberArg);     // Copying the value 3 of the                                                       // argument numberArg to the
	                                              // parameter numberParam
		    System.out.println("in the main() method number is: " +
		        numberArg);

		}
	public static void printNumberr(int numberParam) {
		 
	    // Modifying the primitive-type parameter
	    numberParam = 5;
  		    System.out.println("in printNumber() method, after the "
	                + "modification, numberParam is: " + numberParam);

	}

	}

