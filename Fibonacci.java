package Dailyfivecodes;
//Fibanacci series code implementation
public class Fibonacci {
	public static void main(String[] args) {
		int n=10, firstNo=0,secondNo=1;
		System.out.println("Fibonacci series till "+n+" terms");	
		for(int i=0;i<=n;i++)
		{
			System.out.print(firstNo+", ");
				
		int NextNo=firstNo+secondNo;
		firstNo=secondNo;
		secondNo=NextNo;
	}

}
}