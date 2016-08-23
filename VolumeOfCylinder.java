import java.util.Scanner;


public class VolumeOfCylinder {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		double r;
		double l;
		double a;
		double v;
		
		System.out.print("Enter the radius : ");
		
		Scanner keyboard = new Scanner(System.in);
		r = keyboard.nextDouble();
		a = r * r * Math.PI;
		
		System.out.print("Enter the length : ");
		l = keyboard.nextDouble();
		
		v = a*l;
		
		System.out.println("The area of the cylindar is : "+a+"\n and the volume is : "+v);
		
		
	}

}
