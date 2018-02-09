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
	System.out.print("Enter A :: ");
	a = keyboard.nextInt();
	System.out.print("Enter B :: ");
	b = keyboard.nextInt();
	System.out.print("Enter C :: ");
	c = keyboard.nextInt();
	Quadratic One = new Quadratic (a,b,c);
	One.setEquation(a,b,c);
	One.print();
	
	System.out.print("\n" + "Enter A :: ");
	a = keyboard.nextInt();
	System.out.print("Enter B :: ");
	b = keyboard.nextInt();
	System.out.print("Enter C :: ");
	c = keyboard.nextInt();
	Quadratic Two = new Quadratic (a,b,c);
	Two.setEquation(a,b,c);
	Two.print();
	
	System.out.print("\n" + "Enter A :: ");
	a = keyboard.nextInt();
	System.out.print("Enter B :: ");
	b = keyboard.nextInt();
	System.out.print("Enter C :: ");
	c = keyboard.nextInt();
	Quadratic Three = new Quadratic (a,b,c);
	Three.setEquation(a,b,c);
	Three.print();
	
	//add test cases
   	
   	
		
		
	}
}