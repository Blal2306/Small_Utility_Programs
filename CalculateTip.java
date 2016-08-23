import java.util.Scanner;


public class CalculateTip {

	
	public static void main(String[] args) 
	{
		double tip;
		double total;
		System.out.print("Enter subtotal : ");
		Scanner x = new Scanner(System.in);
		
		total = x.nextDouble();
		
		tip = (15.0/100)*total;
		
		total = total + tip;
		
		System.out.println("The total with the tip is : "+total);

	}

}
