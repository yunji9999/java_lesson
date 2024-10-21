package 조건문;

import java.util.Scanner;

public class homework4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int slice = sc.nextInt();
		int num = sc.nextInt();
		
		if (num%slice==0) {
			System.out.println(num/slice);
		
		}
		else {
			System.out.println(num/slice+1);
		}

	}

}
