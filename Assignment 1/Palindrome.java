import java.util.*;
class Palindrome
{	
	public static void main(String []adianth)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter The number=");
		int a=sc.nextInt();
		String X= Integer.toString(a);
		String s=""; 
		String q,r;
		int Q,R;
		while(a>0)
		{
			R=a%10;
			s=s+Integer.toString(R);
			Q=a/10;
			a=Q;
		}
		if(X.equals(s))
		{
			System.out.print("Number is Palindrome");
		}
		else
			System.out.print("Number is Not Palindrome");
	}
}
		
			
			
		