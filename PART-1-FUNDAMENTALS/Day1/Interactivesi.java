import java.util.*;
public class Interactivesi
{
    public static void main(String [] args)
{

      Scanner in = new Scanner(System.in);
      System.out.print("Enter the principal = ");
      int principal = in.nextInt();
      System.out.print("Enter the number of years = ");
      int NumberOfYears = in.nextInt();
      System.out.print("Enter the ROI = ");
      int ri = in.nextInt();
      int si = (principal*NumberOfYears*ri/100);
      System.out.print("Simple Interest = "+si);
     
      



      
      

       
        
   }
}