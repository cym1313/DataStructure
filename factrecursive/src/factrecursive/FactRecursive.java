package factrecursive;

import java.util.Scanner;

public class FactRecursive {
	
	public static long fact(long n) {
	      if (n <= 1)
	         return 1;
	      else
	         return n * fact(n - 1);
	   }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		
		Scanner scanner = new Scanner(System.in);
		System.out.printf("정수 값 입력 :");
		num = scanner.nextInt();
		System.out.printf("팩토리얼 값 출혁 :" + fact(num));
		
		
	}

}
