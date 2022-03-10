class pyramidPattern5{
	public static void main(String args[])
	{
		int c=9;
		
		for(int i=1;i<=9;i++)
		{
			for(int j=9;j>=i;j--)
			{
				System.out.print("  ");
			}
			
			int a=c;
			for(int k=1;k<=i;k++)
			{
				System.out.print(a+" ");
				a++;
			}
			c--;
			
			int d = 8;
			for(int l=1;l<=i-1;l++)
			{
				if(i==1)
					continue;
				
				System.out.print(d+" ");
				d--;
			}
			
			System.out.println();
		}
	}
}