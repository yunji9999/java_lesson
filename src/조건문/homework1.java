package 조건문;

import java.util.Scanner;

public class homework1 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		
		int age = sc.nextInt();
		
		if (0<age && age<120)
		{
			System.out.println((2024-age)+1);
		}
		else {
			System.out.println("잘못된 수 입니다");
		}
	}

}
