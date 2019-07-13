package Day1;

import java.util.Scanner;

public class MarkValidation {

	public static String isPass(int m)
	{
		
		if(m>=40) 
		return "Pass";
		else
		return "Fail";
		
	}
	public static String markGrade(int m)
	{
		if(m>=90)
		return "Grade A";
		else if(m>=75&&m<90)
		return "Grade B";
		else if(m>=60&&m<75)
	    return "Grade C";
		else
		return  "Grade D";	
	}
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
      int m;
      System.out.println("Mark=");
      m=sc.nextInt();
      System.out.println(isPass(m));
      System.out.println(markGrade(m));
      sc.close();
	} 

}
