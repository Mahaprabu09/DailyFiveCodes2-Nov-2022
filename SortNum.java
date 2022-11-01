package Dailyfivecodes;
import java.util.Arrays;
import java.util.Scanner;
/*Find Minimum Number
 *Find Maximum Number
 *Find Third Minimum Number
 *Find Third maximum Number
 */
public class SortNum {
		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			int num=scan.nextInt();

			
			int [] Array=new int [num];
			for(int i=0;i<num;i++) {
				Array[i]=scan.nextInt();
			}
			
			Arrays.sort(Array);
			
			System.out.println("Minimum Number:"+Array[0]);
			System.out.println("Maximum Number:"+Array[Array.length-1]);
			System.out.println("Third Minimum Number:"+Array[2]);
			System.out.println("Third maximum Number:"+Array[Array.length-3]);

		}

	}


