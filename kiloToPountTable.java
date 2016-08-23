
public class kiloToPountTable {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		System.out.println("Kilograms\tPounds");
		System.out.println("---------\t------");
		
		for (int i = 1; i < 200; i++)
		{
			if (i % 2 != 0)
			{
				System.out.print(i);
				System.out.printf("\t\t%.2f",(i*2.2));
				System.out.println();
			}
		}
	}

}
