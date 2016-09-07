public class p2 {

	public static void main(String[] args)
	{
		
		
		reverseDisplay(12345);
		
		
		
	}
	public static void reverseDisplay(int value)
	{
		int length = getLength(value);
		int ans = reverse(value, length);
		
		System.out.println(ans);
		
		
	}
	public static int reverse(int value, int length)
	{
		int temp; //holds the cut off of the last digit
		if(length == 1)
			return value;
		else
		{
			//cut of the digit
			temp = value % 10;
			
			return temp*length + reverse(value/10 , length/10);
		}
	}
	public static int getLength(int value)
	{
		//how many digits does the value have
				int dev  = 1; // the number that will divide the value
				for(int i = 1; i < Integer.MAX_VALUE; i++ )
				{
				
					if(value / dev == 1)
						break;
					else
						dev = dev*10;
					
				}
				return dev;
	}
	public static int getNumberOfDigits(int length) //counts the number of digits in the given integer
	{
		int temp = length;
		int count = 1;
		while (temp != 1)
		{
			temp = temp / 10;
			count ++;
		}
		
		return count;
		
	}
	
}
