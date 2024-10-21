import java.util.Scanner;

public class 메소드예제2 {

	public static void main(String[] args) {
		// 키보드로부터 입력받은두 개의 정수를 인자(매개변수)로 넘겨받아 
	      // num1에서 num2를 뺀 결과값을 절대값으로 바꾸어 출력하는
	      // getAbsoluteValue() 메소드를 구현하세요.
	      
	      Scanner sc = new Scanner(System.in);
	      System.out.print("첫번째 정수 입력 >> ");
	      int num1 = sc.nextInt();
	      System.out.print("두번째 정수 입력 >> ");
	      int num2 = sc.nextInt();
	      
	      int abs = getAbsoluteValue(num1, num2);
	      System.out.println("결과 확인 : " + abs);

	}
	
	
	public static int getAbsoluteValue(int num1, int num2) {
		int ga=num1-num2;
		if(num1>num2) {
			ga=num1-num2;
			return ga;
		}
		else if(num2>num1) {
			ga=num2-num1;
			return ga;
		}
		else {
			ga=0;
		return ga;
		}
	}

}
