import java.util.Scanner;


public class KilogramsToPounds {

	public static void main(String[] args) 
	{
		double k;
		double p;
		
		System.out.print("Enter kilograms : ");
		Scanner x = new Scanner(System.in);
		k=x.nextDouble();
		
		p=k/0.454;
		
		System.out.println("It is "+p+" pounds");

	}

}
