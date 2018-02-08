//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Lab03c
{
	public static void main( String[] args )
   {
	Scanner keyboard = new Scanner(System.in);
	int a;
	int b;
	int c;
	System.out.println("Enter A:");
	a = keyboard.nextInt();
	System.out.println("Enter B:");
	b = keyboard.nextInt();
	System.out.println("Enter C:");
	c = keyboard.nextInt();
	Quadratic One = new Quadratic (a,b,c);
	One.setEquation(a,b,c);
	One.print();
	//add test cases
   	
   	
		
		
	}
}