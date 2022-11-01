package Dailyfivecodes;

import java.util.Scanner;

public class Recursion {
	public static int function1(int n)
	{
		if(n<1)
		{
			return 0;
		}
		else
			return n+function1(n-1);		
	}
	
	//Recursion logic is n+funtion(n-1) for add+  or mul* whatever 

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your number :");
		int n=scan.nextInt();
		System.out.println(function1(n));

	}

}
