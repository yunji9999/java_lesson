package 조건문;

import java.util.Scanner;

public class homework2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int price = sc.nextInt();
	
		if (price>=100000) {
			System.out.print(price*0.95);
		}
		else if (price>=300000) {
			System.out.print(price*0.9);
		}
	
		else if (price>=500000) {
			System.out.print(price*0.8);
		}
		
		
		else {
			System.out.print(price);}
	
	
		}
	}


