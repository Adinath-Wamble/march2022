import java.util.Scanner;
class Q12{
	public static void main(String []args){
		//System.out.println("Enter three number that you want to find his average::=> ");
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first Number ::: ");
		int n1=sc.nextInt();
		System.out.print("Enter Second Number ::: ");
		int n2=sc.nextInt();
		System.out.print("Enter Third Number :::: ");
		int n3=sc.nextInt();
		int avg=(n1+n2+n3)/3;
		System.out.print("Average of all three Number is : " +avg);
		
	}
}