package 조건문;

import java.util.Scanner;

public class homework3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int angle = sc.nextInt();
		
		if (angle>0 && angle <89) {
			System.out.println("예각입니다");
		}
		
		else if (angle==90) {
			System.out.println("직각입니다");
		}
		
		else if (angle==180) {
			System.out.println("평각입니다");
			
		}
		
		else if (angle>90 && angle<180) {
			System.out.println("둔각입니다");
		}

		else System.out.println("0");
	}

}
