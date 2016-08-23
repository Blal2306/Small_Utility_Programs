import java.util.Scanner;


public class CelsiustoFehrenheit {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		double F; 
		double C;
		
		System.out.print("Enter the temperature in Celsius : ");
		Scanner keyboard = new Scanner(System.in);
		C = keyboard.nextDouble();
		F = (9.0/5) * C + 32;
		
		System.out.println("The temperature in Fehrenheit is : "+F);

	}

}
