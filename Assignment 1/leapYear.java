import java.util.Scanner;

class leapYear
{
	private static Scanner scan=new Scanner(System.in);
	public static void main(String []adianth)
	{
		System.out.print("Enter Year=");
		int year=scan.nextInt();
		if(year%400==0 || year%4==0 && year%100 !=0)
		{
			System.out.println("It is a leap year ");
		}
		else 
			System.out.println("It is not a leap year ");
	}
}