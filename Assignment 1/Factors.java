import java.util.Scanner;

class Factors {
   public static void main(String args[]){
      int n;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number ::");
      n = sc.nextInt();
	  for(int i=1; i<=n; i++)
	  {
		  if(n%i==0)
		  {
			  System.out.println("Factors fo number ::"+i);
		  }
	  }
   }
}
			  
     