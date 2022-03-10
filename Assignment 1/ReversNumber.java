import java.util.Scanner;

class ReversNumber
{
	private static Scanner scan=new Scanner(System.in);
	public static void main(String []adianth)
	{
		int sum=0,digits ,r=0;
		System.out.print("Enter Number=");
		int num=scan.nextInt();
		while(num>0)
		{
			digits=num%10;
			System.out.print(digits);
			num=num/10;
			sum=sum+digits;
			
		}
		
	}
}