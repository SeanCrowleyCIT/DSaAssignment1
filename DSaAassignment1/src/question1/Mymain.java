package question1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner; 

public class Mymain {
	public static void main(String[] args) throws IOException {		
		Scanner input = new Scanner(System.in);
		int num, num1, num2, num3, num4, num5;
		System.out.print("Enter One Number of 5 Digits: "); //prompt
		num = input.nextInt();

		num1 = num / 10000;
		num2 = (num % 10000) / 1000;
		num3 = ((num % 10000) % 1000) / 100;
		num4 = (((num % 10000) % 1000) % 100) / 10;
		num5 = (((num % 10000) % 1000) % 100) % 10;

        System.out.printf("%d%s%d%s%d%s%d%s%d%n", num1, "   ", num2, "   ", num3, "   ", num4, "   ", num5);

		input.close();
	}
}
