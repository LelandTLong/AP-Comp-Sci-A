//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Quadratic
{
	private int a, b, c;
	private double rootOne;
	private double rootTwo;
	public double topadd;
	public double topminus;
	public double bottom;
	
	public Quadratic()
	{
		

	}

	public Quadratic(int quadA, int quadB, int quadC)
	{
		setEquation(quadA, quadB, quadC);
		calcRoots();
	}

	public void setEquation(int quadA, int quadB, int quadC)
	{
		
		a = quadA; 
		b = quadB;
		c = quadC;
		topadd = -b + Math.sqrt((b * b) - (4 * a * c));
		topminus = -b - Math.sqrt((b * b) - (4 * a * c));
		bottom = 2 * a;
		
 	}

	public void calcRoots( )
	{
		rootOne = topadd/bottom;
		rootTwo = topminus/bottom;

	}

	public void print( )
	{
		System.out.print("root one :: ");
		System.out.printf("%.2f\n",rootOne);
		System.out.print("root two :: ");
		System.out.printf("%.2f\n",rootTwo);

	}
}