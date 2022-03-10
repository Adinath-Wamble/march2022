class pyramidPattern6
{
	public static void main (String []args){
		for(int i =10; i>=1; i--)
		{
			for(int s=10 ; s>=i; s--)
			{
					System.out.print(" ");
			}
			for(int j=1; j<=i; j++)
			{
					System.out.print(" *");
			}
			
			System.out.println();
		}
		}
}