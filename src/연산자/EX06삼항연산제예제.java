package 연산자;

import java.util.Scanner;

import javax.swing.Spring;

public class EX06삼항연산제예제 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("농구공의 개수를 입력하세요 : ");
		
		int num = sc.nextInt();
		int result = num%5==0? num/5 : num/5+1;
				
		System.out.print("필요한 상자의 수 : " + result);
		
		
		
		
		

	}

}
