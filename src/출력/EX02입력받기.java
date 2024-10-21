package 출력;

import java.util.Scanner;

public class EX02입력받기 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 >> ");
		int a = sc.nextInt();
		System.out.println(a);
		
		
		
		System.out.println("문자를 입력해주세요 >>");
		String b = sc.next();
		System.out.println(b);
		
		
		
		
	}

}
