import java.util.Scanner;

class SumofDigits
{
	private static Scanner scan=new Scanner(System.in);
	public static void main(String []adianth)
	{
		int sum=0,digits;
		System.out.print("Enter Number=");
		int num=scan.nextInt();
		while(num>0)
		{
			digits=num%10;
			num=num/10;
			sum=sum+digits;
		}
		System.out.print("Digits of a Given Number="+sum);
	}
}