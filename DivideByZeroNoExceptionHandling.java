package assignment;
import java.util.Scanner;

public class DivideByZeroNoExceptionHandling 
{

		public static int quotient(int num, int den)
		{
			return num/den;
			
		}
	
		public static void main(String[] args)
		{
			
			Scanner sc= new Scanner(System.in);
			System.out.println("Please Enter Numerator");
			int num= sc.nextInt();
			
			System.out.println("Please Enter Denomitor");
			int den= sc.nextInt();
			
			int result =quotient(num,den);
			System.out.printf("%n Result: %d / %d= %d%n", num,den,result);
		}
}
