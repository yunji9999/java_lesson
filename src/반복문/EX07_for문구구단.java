package 반복문;

import java.util.Scanner;

public class EX07_for문구구단 {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("몇단?");
//		int a = sc.nextInt();
//		System.out.print("어디까지?");
//		int b = sc.nextInt();
//		
//	
//		for (int i=1; i<=b; i++)
//		
//			
//			System.out.println(a+"*"+i+"="+a*i);
////		num = sc.nextInt();
//		count += num;

		
//		//i*count의 값을 그때그때 누적해서 더해야함
//		count 여기 들어올 때마다 -1씩 감소
		
		Scanner sc = new Scanner(System.in);
		
		//77~1
		int count = 77;
		//곱셈 값을 누적해서 더 해줄 변수
		int sum = 0;
		
		for (int i=1; i<=77; i++) {
			 sum = sum+(count*i);
			 count--;
		}
				
			
			
		System.out.print(sum);
		
			
		
		
	}

}
