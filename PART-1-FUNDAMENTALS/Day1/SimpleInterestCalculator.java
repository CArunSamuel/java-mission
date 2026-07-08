public class SimpleInterestCalculator 
{
    public static void main (String [] args )
       {
	SimpleInterest si1 = new SimpleInterest();
          si1.principal= 50;
          si1.numberofYears= 4;
          si1.rateofInterest= 10.5;	
          double interest1 = si1.calculate();

         SimpleInterest si2 = new SimpleInterest();
          si2.principal= 500;
          si2.numberofYears= 3;
          si2.rateofInterest= 10;
          double interest2 =si2.calculate();

	
	  double TotalInterest = interest1 +  interest2;

	 System.out.println ("SIMPLE INTEREST IS = " + TotalInterest);
			
       }
}

class SimpleInterest{
	int principal;
	double rateofInterest;
	int numberofYears;
	
	
    double calculate(){
        return (principal*rateofInterest*numberofYears)/100;
    }

}


          
