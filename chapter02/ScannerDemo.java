package chapter02;

import java.util.Scanner;

//Coding By 김용선.

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int x = in.nextInt();
		int y = in.nextInt();
		System.out.printf("%d * %d은 %d입니다.\n",x,y,x*y);
	}

}
