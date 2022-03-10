import java.util.Scanner;

class Circle
{
	private static Scanner scan=new Scanner(System.in);
	public static void circle()
	{
		//int Radius=scan.nextInt();
		
		double Radius = 7.5;
		final double Pi=3.14159;
		double Area =Pi * Radius*Radius;
		double Perimeter =2*Pi*Radius;
		System.out.println("Area of Circle is      " +Area);
		System.out.println("Perimeter of Circle is " +Perimeter);
	}
	
	
	public static void main(String []adianth)
	{
		circle();
	}
}