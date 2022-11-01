package Dailyfivecodes;
import java.util.Scanner;
public class printdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number :");
		int num=scan.nextInt();
		String digit=Integer.toString(num);
		
		for(int i=0;i<=digit.length()-1;i++)
		{
			System.out.println(digit.charAt(i));
		}
		

	}

}
