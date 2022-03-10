import java.util.Scanner;

class smallerNumber
{
	private static Scanner scan=new Scanner(System.in);
	public static void main(String []adianth)
	{
		System.out.print("Enter 1st Number=");
		int num1=scan.nextInt();
		System.out.print("Enter 2nd Number=");
		int num2=scan.nextInt();
		System.out.print("Enter 3rd Number=");
		int num3=scan.nextInt();
		if(num1<=num2 && num1<=num3)
		{
			System.out.print("Smaller Number="+num1);
		}
		else if(num2<=num1 && num2<=num3)
			{
			System.out.print("Smaller Number="+num2);
		}
		else
			{
			System.out.print("Smaller Number="+num3);
		}
	}
}