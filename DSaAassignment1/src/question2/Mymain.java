package question2;

import java.util.Scanner;

public class Mymain {
    public static void main (String[] args) 
    {          
        Scanner input = new Scanner (System.in);
        int[] numbers = new int[5];
    
        for (int i = 0; i < 5; i++)
        { 
            System.out.printf("Enter a number between 1 and 30: ");
            int number = input.nextInt();
            numbers[i] = number;
        }
    
        for (int i = 0; i < 5; i++)
        {
        for (int j = 0; j < numbers[i]; j++) 
            System.out.printf("*");

        System.out.println();
        }
    }

}
