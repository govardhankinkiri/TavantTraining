package Day1;

import java.util.Scanner;

public class MarkValidation1 {
    
	 public static String markGrade(int m)
	 {
		 for(int i=1;i<=4;i++)
		 {
			 switch(i)
			 {
			 case 1: if(m>=90) return "Grade A";
			 break;
			 case 2: if(m>=75&&m<90) return "Grade B";
			 break;
			 case 3: if(m>=60&&m<75) return "Grade C";
			 break;
			 case 4: if(m<60) return "Grade D";	 
			 }
		 }
		return null;
	}

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		int m;
		System.out.println("Mark");
		m=sc.nextInt();
		System.out.println(markGrade(m));
		sc.close();
	}

}
