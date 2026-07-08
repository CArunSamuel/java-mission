import java.util.Scanner;

public class input 
{
    public static void main(String [] args)
       {
        Scanner sc = new Scanner(System.in);
			System.out.println("what is your name ?");
		String name = sc.nextLine();
			System.out.println ("How old are you ? ");
		int Age    = sc.nextInt();
			
			System.out.println ("My Name is " + name + " in next year i will be " + (Age-1));
		
        
        
	   } 

}
    

    
 