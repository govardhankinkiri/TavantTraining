package Day1;

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
		Scanner sc = new Scanner(System.in);
		int f;
		System.out.println("Enter The No:");
		f=sc.nextInt();
		System.out.println("Factorial = "+CalculateFactorial(f));
		sc.close();
		}

}
