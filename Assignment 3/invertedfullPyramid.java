class invertedfullPyramid
{
	public static void main (String []args){
		for(int i =7; i>=1; i--)
		{
			for(int s=7 ; s>=i; s--)
			{
					System.out.print(" ");
			}
			for(int j=1; j<=i; j++)
			{
					System.out.print("*");
			}
			for(int e=1; e<=i-1; e++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		}
}