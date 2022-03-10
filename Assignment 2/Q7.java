import java.util.Scanner;
class Q7{
	 public static void main (String args[])
	 {
		 int i,num;
		 Scanner sc=new Scanner(System.in);
		 System.out.print("Enter Number ::: ");
		 num=sc.nextInt();
		 for(i=1;i<=10;i++)
		 {
			 
			 System.out.println(num+ "X" +i+"="+(num*i));
		 }
	 }
}