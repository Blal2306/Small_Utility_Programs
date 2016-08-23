import java.util.Scanner;
import java.util.Stack;


public class EvaluateExpression {

	public static double evaluate(String expression)
	{
		//TWO STACKS FOR NUMBERS AND OPERATIONS
		Stack<Double> numbers = new Stack<Double>();
		Stack<Character> operations = new Stack<Character>();
		
		
		Scanner input = new Scanner(expression);
		String next; //NEXT PIECE OF EXPRESSION
		while(input.hasNext())
		{
			next = input.next(); //Get the next piece of expression
			if(Character.isDigit(next.charAt(0)))
			{
				numbers.push(new Double (next));
			}
			else{// IT'S A SYMBOL
				
				switch(next.charAt(0))
				{
					case '+':
					case '-':
					case '*':
					case '/':
						operations.push(next.charAt(0));
						break;
						
					case ')':
						evaluateStackTops(numbers, operations);
						break;
					case '(':
						break;
					default :
						throw new IllegalArgumentException("No good ...");
					
				}
				
			}
		}
		if(numbers.size() != 1)
			throw new IllegalArgumentException("INPUT NO GOOD ...");
		return numbers.pop();
	}
	
	public static void evaluateStackTops(Stack<Double> numbers, Stack<Character> operations)
	{
		if((numbers.size() < 2) || (operations.isEmpty())) 
			throw new IllegalArgumentException("Crap! ...");
		
		double o1, o2;
		o1 = numbers.pop();
		o2 = numbers.pop();
		
		switch(operations.pop())
		{
			case '+': 
				numbers.push(o1+o2);
				break;
			case '-':
				numbers.push(o1-o2);
				break;
			case '*':
				numbers.push(o1*o2);
				break;
			case '/':
				numbers.push(o1/o2);
				break;
			default :
				
				throw new IllegalArgumentException("Crap! ...");
				
		}
	}
	
	//MAIN METHOD
	public static void main(String[] args)
	{
		
		System.out.println(evaluate("( ( 54.5 + 8 ) + 4 )"));
	}
}
