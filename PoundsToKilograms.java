import java.util.Scanner;


public class PoundsToKilograms {

	public static void main(String[] args) 
	{
		double k;
		double p;
		
		System.out.print("Enter pounds : ");
		Scanner x = new Scanner(System.in);
		p=x.nextDouble();
		
		k=p*0.454;
		
		System.out.println("It is "+k+" kilograms");

	}

}
