class Pattern5
{
	public static void main (String []args){
		for(int i=1;i<=5;i++)
		{
			for(int k=5; k>=i; k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			for(int l=i-1; l>=1; l--)
				{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
/*class Pattern5
{
	public static void main (String []args){
		for(int i=1;i<=5;i++)
		{
			for(int k=4; k>=i; k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<2*i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}*/