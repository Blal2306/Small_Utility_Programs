import java.util.Scanner;

public class BinaryToHex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("ENTER BINARY SEQUENCE : ");
		Scanner x = new Scanner(System.in);
		String input = x.next();
		System.out.println("THE HEX CODE IS : "+binaryToHex(input));
		
	}
	public static String binaryToHex(String x)
	{
		StringBuffer data = new StringBuffer(x);
	
		StringBuffer output = new StringBuffer();
		if(data.length()%4 != 0)
		{
			do
			{
				data.insert(0, "0");
			}
			while (data.length()%4!=0);
		}
		
		for(int i = 0; i <=data.length()-1; i+=4)
		{
			String temp = data.substring(i, i+4);
			char insert = binarToHexDigit(temp);
			output.insert(0, insert);
		}
		output.reverse();
		return output.toString();
	}
	public static char binarToHexDigit(String x)
	{
		if (x.equals("0000")) 
			return '0';
		else 
			if (x.equals("0001")) return '1';
		else 
			if (x.equals("0010")) return '2';
		else 
			if (x.equals("0011")) return '3';
		else 
			if (x.equals("0100")) return '4';
		else 
			if (x.equals("0101")) return '5';
		else if (x.equals("0110")) return '6';
		else if (x.equals("0111")) return '7';
		else if (x.equals("1000")) return '8';
		else if (x.equals("1001")) return '9';
		else if (x.equals("1010")) return 'A';
		else if (x.equals("1011")) return 'B';
		else if (x.equals("1100")) return 'C';
		else if (x.equals("1101")) return 'D';
		else if (x.equals("1110")) return 'E';
		else if (x.equals("1111")) return 'F';
		
		return '0';
		
		
	}

}
