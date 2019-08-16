package day1;

import java.util.Scanner;

public class Factorial {
	
static int CalculateFactorial(int a)
	{
		int i,p=1;
		for(i=1;i<=a;i++)
		{
		p=p*i;
		}
 return p;
	}
        public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number;
		System.out.println("Enter The No:");
		number=scanner.nextInt();
		System.out.println("Factorial = "+CalculateFactorial(number));
		scanner.close();
		}

}

