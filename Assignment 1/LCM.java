import java.util.*;
class LCM
{	
	public static void main(String []adianth)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter First number=");
		int a=sc.nextInt();
		System.out.print("Enter Second number=");
		int b=sc.nextInt();
		int lcm=(a>b)?a:b;
		
		while(true)
		{
			if(lcm%a==0 && lcm%b==0)
			{
				System.out.print("LCM of "+a+" and "+b+" is ="+lcm);
				break;
			}
			++lcm;
		}
	}
}
				
			