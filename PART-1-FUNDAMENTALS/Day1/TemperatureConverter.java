import java.util.Scanner;

public class TemperatureConverter{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the temperature in Farenheit: ");
		
		double farenheit = sc.nextDouble();
		
		double celsius = (5.0/9.0) * (farenheit - 32);
		
		System.out.println("Temperature in celsius: " + celsius);
		
	}
	
}