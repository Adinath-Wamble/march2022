import java.util.Scanner;
class swappingofNumbers
{
	private static Scanner sc = new Scanner(System.in);
	public static void main(String []args)
	{
		System.out.print("Enter first number: = ");
		int num = sc.nextInt();
		System.out.print("Enter Second number: = ");
		int num2 = sc.nextInt();
		num=num+num2; 
		num2=num-num2;
		num=num-num2;
		System.out.print("After Swapping First Number is "+num+" & Second Number is "+num2);
	}
}
		
		