package 정렬알고리즘;

import java.util.Arrays;

public class ㅋ {

	public static void main(String[] args) {
		
//		int[] array = {82, 45, 25, 12, 7};
//		
//		for(int j=array.length-1; j>0; j--) {
//			
//			for(int i=0; i<j; i++){
//				//기준 인덱스가 더 크면 값 치환
//				if(array[i]>array[i+1]) {
//					//값 치환 로직
//					int temp = array[i];
//					array[i] = array[i+1];
//					array[i+1] = temp;
//							
//				}
//			}
		
		

		      // 정렬 알고리즘 : 원소들을 일정한 순서대로 열거하는 알고리즘
		      // BubbleSort : 두 인접한 원소끼리 비교해서 정렬하는 방법
		      // -> 속도는 느리지만 코드가 단순하다

		      int[] array = { 82, 45, 25, 12, 7 };

		      System.out.println("변경 전: " + Arrays.toString(array));

		      for (int j = 1; j < array.length; j++) {

		         // 반복
		         for (int i = 0; i < array.length - j; i++) {
		            // 0-1방 비교
		            // 1-2방 비교
		            // 2-3방 비교
		            // 3-4방 비교
		            // 기준인덱스가 더 크면 값을 치환
		            if (array[i] > array[i + 1]) {
		               // 값 치환 로직
		               int temp = array[i];
		               array[i] = array[i + 1];
		               array[i + 1] = temp;
		            }
		         }
		      }
		      
		      System.out.println("변경 후 " + Arrays.toString(array));
		      
		      
		      

//		      // Step1
//		      for (int i = 0; i < array.length - 1; i++) {
//		         // 0-1방 비교
//		         // 1-2방 비교
//		         // 2-3방 비교
//		         // 3-4방 비교
//		         // 기준인덱스가 더 크면 값을 치환
//		         if (array[i] > array[i + 1]) {
//		            // 값 치환 로직
//		            int temp = array[i];
//		            array[i] = array[i + 1];
//		            array[i + 1] = temp;
//		         }
//		      }
		//
//		      System.out.println("1차 : " + Arrays.toString(array));
		//
//		      // Step2
//		      // 0-1, 1-2, 2-3까지 비교
//		      for (int i = 0; i < array.length - 2; i++) {
//		         if (array[i] > array[i + 1]) {
//		            // 값 치환 로직
//		            int temp = array[i];
//		            array[i] = array[i + 1];
//		            array[i + 1] = temp;
//		         }
//		      }
//		      System.out.println("2차 : " + Arrays.toString(array));
		//
//		      // Step3
//		      // 0-1, 1-2 비교
//		      for (int i = 0; i < array.length - 3; i++) {
//		         if (array[i] > array[i + 1]) {
//		            // 값 치환 로직
//		            int temp = array[i];
//		            array[i] = array[i + 1];
//		            array[i + 1] = temp;
//		         }
//		      }
//		      System.out.println("3차 : " + Arrays.toString(array));
		//
//		      // Step4
//		      // 0-1 비교
//		      for (int i = 0; i < array.length - 4; i++) {
//		         if (array[i] > array[i + 1]) {
//		            // 값 치환 로직
//		            int temp = array[i];
//		            array[i] = array[i + 1];
//		            array[i + 1] = temp;
//		         }
//		      }
//		      System.out.println("4차 : " + Arrays.toString(array));

		
		
		
		
		
		
//		
//		}System.out.println("1차 : " + Arrays.toString(array));
	}
}
