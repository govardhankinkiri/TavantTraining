package Day1;

import java.util.Scanner;

public class SumOfNumbers {
	
	 static int SumOfEvenNumber(int s,int f)
		{
			int i,p=0;
			for(i=s;i<=f;i++)
			{
				if(i%2==0)
				{
					p=p+i;
				}
			}
			return p;
			
		}
	 static int SumOfOddNumber(int s,int f)
		{
			int i,p=0;
			for(i=s;i<=f;i++)
			{
				if(i%2!=0)
				{
					p=p+i;
				}
			}
			return p;
			
		}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s,e;
		System.out.println("Start=");
		s=sc.nextInt();
		System.out.println("End=");
		e=sc.nextInt();
		
		System.out.println("Sumofeven="+SumOfEvenNumber(s,e) );
		System.out.println("Sumofodd="+SumOfOddNumber(s,e) );
		sc.close();
		
		
		

	}

}
