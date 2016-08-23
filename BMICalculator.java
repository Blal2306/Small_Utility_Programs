import java.util.Scanner;


public class BMICalculator {

	
	public static void main(String[] args) 
	{
		double bmi;
		double wPounds;
		double hInches;
		double wKG;
		double hMeters;
		
		System.out.print("Enter weight in Pounds : ");
		
		Scanner x=new Scanner(System.in);
		
		wPounds = x.nextDouble();
		
		System.out.print("Enter height in Inches : ");
		
		hInches = x.nextDouble();
		
		wKG = wPounds* 0.45359237;
		hMeters = hInches*0.0254;
		
		bmi = wKG/(hMeters*hMeters);
		
		System.out.println("Your BMI is : " + bmi);

	}

}
