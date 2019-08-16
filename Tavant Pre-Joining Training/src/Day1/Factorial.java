package day1;

import java.util.Scanner;

public class Factorial {
	public int CalculateFactorial(int number)
{
	int i,p=1;
	if (number<0) return 0;
	
	for(i=1;i<=number;i++)
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
		Factorial factorial = new Factorial();
		System.out.println("Factorial = "+factorial.CalculateFactorial(number));
		scanner.close();
		}
        
        

}

