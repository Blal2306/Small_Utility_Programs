
public class milesToKmTable {

	public static void main(String[] args) 
	{
		System.out.println("Miles\tkilometers");
		System.out.println("-----\t----------");
		
		for (int i = 1; i < 11; i++)
		{
			System.out.println(i+"\t"+(i*1.609));
		}

	}

}
