import java.util.Scanner;


public class MetersToFoot 
{
	public static void main(String[] args) 
	{
		double foot;
		double Meters;
		System.out.print("Enter Meters :");
		Scanner keyboard = new Scanner (System.in);
		Meters = keyboard.nextDouble();
		
		foot = Meters/0.305;
		System.out.println("It is "+foot+" Foot");

	}
}
