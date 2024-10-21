package 조건문;

import java.util.Scanner;

public class EX04_ifelse예제3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("상품의 갯수를 입력하세요 : ");

		int price = 100000;
		int a = sc.nextInt();
		
		if (a<11) {
			System.out.println(price * a);}
			
			else {
				System.out.println((10*price)+((price*0.8)*(a-10)));
			
		}
	}

}
