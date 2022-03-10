import java.util.Scanner;

class addtwoNumber
{
	private static Scanner scan=new Scanner(System.in);
	public static void main(String []adianth)
	{
		System.out.print("Enter 1st Number=");
		int a =scan.nextInt();
		System.out.print("Enter 2nd Number=");
		int b =scan.nextInt();
	
	for(int i=1; i<=b;i++)
	{
		a++;
	}
	System.out.print(a);
		
		System.out.print("Addition Two Number Without Airthmatic Operator="+a);
	
	}
	
}
