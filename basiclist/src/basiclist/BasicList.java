package basiclist;

import java.util.Scanner;
public class BasicList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int[] num = new int[5];
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<5; i++) {
			num[i] = scanner.nextInt();
		}
		for(int i=0; i<5; i++) {
			System.out.print(num[i]);
		}
		
		
		

}
}
