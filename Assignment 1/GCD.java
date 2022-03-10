import java.util.*;
class GCD
{	
	public static void main(String []adianth)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter First number=");
		int a=sc.nextInt();
		System.out.print("Enter Second number=");
		int b=sc.nextInt();
		int temp;
		int A=a,B=b;
		while(b!=0)
		{
			temp=b;
			b=a%b;
			a=temp;
		}
		System.out.print("The GCD of "+A+" and "+B+" is = "+a);
	}
}
			
	