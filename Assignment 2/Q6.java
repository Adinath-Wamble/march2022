class Q6{
	 public static void main (String args[])
	 {
		 
		 
		 int choise=1;
		 int n1=125, n2=24, result;
		 switch (choise)
		 {
		 case 1: 
		         result=n1+n2;
		         System.out.println(result);
				 
		 case 2 : result=n1-n2;
		         System.out.println(result);
				 
		 case 3 : result=n1*n2;
		         System.out.println(result);
				 
		 case 4: 
		         result=n1/n2;
		         System.out.println(result);
				 
		 case 5: 
		         result=n1%n2;
				 System.out.println(result);
				 break;
				 
		default :System.out.println("INVALID CHOISE");
				
		 }
	 }
 }