package 조건문;

import java.util.Scanner;

public class EX03_ifelse예제 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 : ");
			int grade = sc.nextInt();
			
			if (grade>=60) {System.out.println("합격입니다");
			} else {System.out.println("불합격입니다");}
			


}
}