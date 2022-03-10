import java.util.Scanner;
class PositiveandNegative
{
	private static Scanner sc = new Scanner(System.in);
	public static void main(String []args)
	{
		System.out.print("Enter a Number: ");
		int x = sc.nextInt();
		if (x > 0)
            System.out.println("Positive");
 
        else if (x < 0)
            System.out.println("Negative");
 
        else
            System.out.println("Zero");
	}
}