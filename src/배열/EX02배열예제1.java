package 배열;

import java.util.Arrays;
import java.util.Scanner;

public class EX02배열예제1 {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		a= sc.nextString();
		
		
		int[] numbers = new int [5];
		
	    int max = 0;
		int min = 100; //array[0]
		double avg = 0;
		int sum = 0;
	System.out.println();
		System.out.print("1번째 입력 >>");	
		int a = sc.nextInt();
		System.out.print("2번째 입력 >>");
		int b= sc.nextInt();
		System.out.print("3번째 입력 >>");
		int c = sc.nextInt();
		System.out.print("4번째 입력 >>");
		int d = sc.nextInt();
		System.out.print("5번째 입력 >>");
		int e = sc.nextInt();
		
		numbers [0] = a;
		numbers [1] = b;
		numbers [2] = c;
		numbers [3] = d;
		numbers [4] = e;
			
		System.out.print("입력된 점수 : " );
		
		for(int i=0;i<=4;i++) {
		System.out.print(numbers [i] + " ");	
		}
		
		System.out.println();
		
		for(int i=0;i<=4;i++) {
		//배열이름.length => 해당하는 배열의 길이	
			if (max <= numbers [i]) {
				max = numbers [i];
			} 
			
			if (min >= numbers [i]) {
				min = numbers [i];
			} 
		}
		System.out.print("최고 점수 : ");
		System.out.println(max);
		System.out.print("최저 점수 : ");
		System.out.println(min);
			
		for (int j=0;j<=4;j++) {
		sum += numbers[j];
			
		} 
		avg = sum/5.0;
		
		System.out.print("평균 : ");
		System.out.println(sum);
		System.out.println(avg);
				
				
				
				
				
				
	}

}
