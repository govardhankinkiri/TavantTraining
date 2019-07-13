package Day1;
import java.util.Scanner;

public class Temperature {

	  static double convertToFarenheit(double c)
	{
		return (c*9/5)+32;
	}
	  static double convertToCelsius(double f)
	{
		return (f-32)*5/9;
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
System.out.println("Celsius =" );
double c,f;
c=sc.nextDouble();
System.out.println("Fahrenheit =" );
f=sc.nextDouble();
System.out.println(" Convert To Fahrenheit ="+convertToFarenheit(c));

System.out.println(" Convert To Celsius ="+convertToCelsius(f));
sc.close();



	}

}
