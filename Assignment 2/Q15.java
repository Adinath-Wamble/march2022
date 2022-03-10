import java.util.Scanner;
class Q15{
public static void main(String []args){
      Scanner sc=new Scanner (System.in);
	  System.out.print("ENTER FIRST NUMBER A = ");
	  int a= sc.nextInt();
	  System.out.print("ENTER SECOND NUMBER B = ");
	  int b=sc.nextInt();
	  System.out.println("BEFORE SAWPPING A = "+a+" & B = "+b);
	  a=a+b;
	  b=a-b;
	  a=a-b;
	  System.out.println("AFTER SAWPPING A = "+a+" & B = "+b);
}
}