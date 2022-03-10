import java.util.Scanner;
class Q5{
    public static void main (String args[]){
		Scanner sc=new Scanner (System.in);
		System.out.print("Input first number : ");
		int a=sc.nextInt();
		System.out.print("Input Second number : ");
		int b=sc.nextInt();
		int result=a*b;
		System.out.println("Multiplication of " +a+ " and " +b+ " is " +result);
		
	}
}