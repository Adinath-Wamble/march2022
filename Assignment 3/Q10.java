class Q10{
	public static void main(String args[])
	{
		int c = 69;
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			
			int ab = c;
			
			for(int k=1;k<=i;k++)
			{
				
				char ch = (char)ab;
				System.out.print(ch+" ");
				ab++;
				
			}
			c--;
			
			System.out.println();
		}
	}
}