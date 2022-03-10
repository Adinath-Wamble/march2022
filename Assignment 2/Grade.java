import java.util.Scanner;
class Grade{
	
	public static void main(String []adianth)
	{
		System.out.println("Enter Grade");
		Scanner sc =new Scanner(System.in);
		int Grade=sc.nextInt();
        if(Grade>=90&&Grade<100)
         System.out.println("Grade A+");
		
           else if(Grade >=80&&Grade<=90)
				  System.out.println("Grade A");
		   
		   else if(Grade >=70&&Grade<=80)
				System.out.println("Grade B");
				
			else if(Grade >=60&&Grade<=70)
				System.out.println("Grade C");
			
			else if(Grade >=50&&Grade<=60)
				System.out.println("Grade D");
			
			else if(Grade<=50)
				System.out.println("Fail");
			
			else
				System.out.println("invalid marks");
		}
		
		}