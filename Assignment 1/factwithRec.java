import java.util.Scanner;

public class factwithRec {
	public static int FactorialWithRecursion(int num)
	{
		if(num ==0||num==1)
			return 1;
		else 
			num=num*FactorialWithRecursion(num-1);
		return num;
	}
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
		
	System.out.println("Factorial of Number is ="+FactorialWithRecursion(num) );
	}
}