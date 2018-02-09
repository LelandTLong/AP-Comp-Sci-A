//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Lab03d
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		int x1;
		int y1;
		int x2;
		int y2;
		System.out.print("Enter X :: ");
		x1 = keyboard.nextInt();
		System.out.print("Enter Y :: ");
		y1 = keyboard.nextInt();
		System.out.print("Enter X :: ");
		x2 = keyboard.nextInt();
		System.out.print("Enter Y :: ");
		y2 = keyboard.nextInt();
		Distance One = new Distance(x1,y1,x2,y2);
		One.calcDistance();
		One.print();
		
		System.out.print("\n\n" + "Enter X :: ");
		x1 = keyboard.nextInt();
		System.out.print("Enter Y :: ");
		y1 = keyboard.nextInt();
		System.out.print("Enter X :: ");
		x2 = keyboard.nextInt();
		System.out.print("Enter Y :: ");
		y2 = keyboard.nextInt();
		Distance Two = new Distance(x1,y1,x2,y2);
		Two.calcDistance();
		Two.print();
		
		System.out.print("\n\n" + "Enter X :: ");
		x1 = keyboard.nextInt();
		System.out.print("Enter Y :: ");
		y1 = keyboard.nextInt();
		System.out.print("Enter X :: ");
		x2 = keyboard.nextInt();
		System.out.print("Enter Y :: ");
		y2 = keyboard.nextInt();
		Distance Three = new Distance(x1,y1,x2,y2);
		Three.calcDistance();
		Three.print();
		//add test cases
		
		
		
		
			
	}
}