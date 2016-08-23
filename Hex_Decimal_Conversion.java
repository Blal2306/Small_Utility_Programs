
public class q1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "123456673922021ABCFGMLSLLDKKDKDKDKDKDKDKDKDKDKDKDKD";
		try{
		hexToDecimal(a);
		}
		catch (Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	public static String hexToDecimal(String hexString) throws NumberFormatException
	{
		String cleanedString = null;
		char temp;
		for(int i = 0; i <hexString.length(); i++)
		{
			temp = hexString.charAt(i);
			if((temp <= 'F') && (temp >= 'A'))
			{
				System.out.print(temp);
			}
			else if((temp <= '9') && (temp >= '0'))
			{
				System.out.print(temp);
			}
			else
			{
				System.out.println();
				System.out.println(temp+" is not a HEX DIGIT");
				throw  new NumberFormatException("CAUGHT IN THE METHOD");
			}
		}
		return cleanedString;
	}

}
