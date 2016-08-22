package javaapplication2;

import javax.swing.JOptionPane;


public class JavaApplication2 {

    public static void main(String[] args) 
    {
        long input = Long.parseLong(JOptionPane.showInputDialog("ENTER UPPER BOUND TO GENERATE THE PRIME NUMBERS"));

        long n=0;
        do
        {
            long i=2;
            n=n+1;
            //test to determine if n is a prime number
            for (; i <= Math.sqrt(n); i++)
		if (n % i == 0)
                {
			break;
                }
            if (i>Math.sqrt(n))
		System.out.println(n);
        }
        while (n<input);
    }
    
}
