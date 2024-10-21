import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class 메소드예제5 {

	public static void main(String[] args) {
		// startValue~endValue까지 완전수 출력
		// getPerfecNumber()구현하기
		// StartValue:2
		// endValue:1000
		// 2<=n<=1000

		int startValue = 2;
		int endValue = 1000;

		getPerfectNumber(startValue, endValue);

		// k=완전수
	}

	public static void getPerfectNumber(int a, int b) {
		for (int i = a; i <= b; i++) {
			int sum = 0;
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					sum += j;
				}
			}
			if (sum == i) {
				System.out.println(sum);
			}

		}

	}
}