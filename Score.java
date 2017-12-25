
package assignment;
import java.util.Scanner;

public class Score
{
	public static int score1;
	public static int score2;
	public static int score3;
	public static float score_avg;
	static int score_sum;
	int total;
	public static void main(String[] args) 
	{
		Scanner keyboard=new Scanner(System.in);
		System.out.println("Enter Your First Score :");
		score1 = keyboard.nextInt();

		System.out.println("Enter Your Second Score :");
		score2 = keyboard.nextInt();

		System.out.println("Enter Your Third Score :");
		score3 = keyboard.nextInt();

		score_sum =score1+score2+score3;
		score_avg= score_sum/3;
		System.out.println("Your 1st Score is:"+score1);
		System.out.println("Your 2nd Score is:"+score2);
		System.out.println("Your 3rd Score is:"+score3);
		System.out.println("Your Total Score is:"+ score_sum);
		System.out.println("Your Average is:"+score_avg);
		
	}
}