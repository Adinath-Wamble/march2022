import java.util.Scanner;
class one2ten
{
   public int  onetoten(int num)
	{
		if(num==11)
		{
			return num;
		}
		System.out.print(num+ " ");
		num++;
		onetoten(num);
		return num;
	}
	
	public static void main(String []adianth)
	{
		one2ten o1=new one2ten();
		int n1=o1.onetoten(1);
	}
}