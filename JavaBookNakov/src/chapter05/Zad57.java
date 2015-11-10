package chapter05;
import java.io.Console;
import java.util.Scanner;

class Zad57    
{
    static void Main(String[] args)
    {
    	Scanner scanner = new Scanner (System.in);
        int NUMBERS_COUNT = 5;
        double[] number = new double[5];
        boolean subsetFound = false;
                    
           System.out.println("Please input a number for a:");
            number[0] = scanner.nextDouble();
            System.out.println("Please input a number for b:");
            number[1] = scanner.nextDouble();
            System.out.println("Please input a number for c:");
            number[2] = scanner.nextDouble();
            System.out.println("Please input a number for d:");
            number[3] = scanner.nextDouble();
            System.out.println("Please input a number for e:");
            number[4] = scanner.nextDouble();
     
        for (int startPos = 0; startPos < NUMBERS_COUNT; startPos++)
        {
            double sum = 0;
            for (int endPos = startPos; endPos < NUMBERS_COUNT; endPos++)
            {
                sum += number[endPos];
                if (sum == 0)
                {
                   System.out.printf("Subset found: ");
                    subsetFound = true;
                    for (int iterator = startPos; iterator <= endPos; iterator++)
                    {
                    	System.out.printf("{0} ", number[iterator]);
                    }
                    System.out.println();
                }
            }
        }
        if (subsetFound == false)
        {
        	System.out.printf("No subset found.");
        }
    }
}
