import java.util.Scanner;


public class FootToMeters {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		double foot;
		double Meters;
		System.out.print("Enter foot :");
		Scanner keyboard = new Scanner (System.in);
		foot = keyboard.nextDouble();
		
		Meters = foot*0.305;
		System.out.println("It is "+Meters+" Meters");

	}

}
