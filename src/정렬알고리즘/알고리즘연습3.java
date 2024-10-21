package 정렬알고리즘;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 알고리즘연습3 {

	public static void main(String[] args) {
//		최댓값 만들기(1)
//		- 정수 배열이 있을 때, 그 배열의 데이터 중 두 개를 곱해서 만들 수 있는 최대값을 출력해주세요!
//		※ 배열이 {1,2,3,4,5} 일 때 20 출력
//		※ 배열이 {0, 31, 24, 10, 1, 9}일 때 744 출력
		
//		for(int i=0; i<array.length;i++) {
//		if(max<array[i]) {
//			max=array[i];
//		}
//		for(int j=0; j<array.length-1;j++) {
//			if(max2<array[j]) {
//				max2=array[j];
//		}
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("배열 총 몇개?(k) : ");
		Random ran = new Random();
		
		int k = sc.nextInt();
		int[] array = new int[k];
		
		for(int i = 0; i < array.length; i++) {
            array[i] = ran.nextInt(100) + 1; // 1 ~ 100 사이의 랜덤 숫자
        }
		
		int max = 0;
		int max2 = 0;

			for(int i = 0; i < array.length; i++) {
	            if(max < array[i]) {
	                max2 = max;;
	            	max2 = max; // 기존 최대값을 max2로 이동
	                max = array[i]; // 새로운 최대값 갱신
	            } else if(max2 < array[i]) {
	                // max보다 작은 값 중에서 가장 큰 값이 max2
	                max2 = array[i];
	            }
	        }

		System.out.println(Arrays.toString(array));
		System.out.println(max);
		System.out.println(max2);
		System.out.println(max*max2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
