import java.util.Scanner;


public class FehrenheitToCelsius {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
		double F; 
		double C;
		
		System.out.print("Enter the temperature in Fehrenheit : ");
		Scanner keyboard = new Scanner(System.in);
		F = keyboard.nextDouble();
		C = (5.0/9)*(F-32);
		
		System.out.println("The temperature in Celsius is : "+C);
	}

}
