package 이차원배열;

import java.util.Arrays;

public class 예제2 {

	public static void main(String[] args) {
//		int [] arr = {1,2,3,4,5};
//		
//		int [] newarr = new int [5];
//		
//		 for(int i=0;i<arr.length;i++) {
//			 newarr [i] = arr [arr.length-i-1];
//			 
//		 } System.out.println(Arrays.toString(arr));
//		System.out.println(Arrays.toString(newarr));
		
		
//  // 1. 1,2,3,4,5를 담는 배열 생성
//	      int[] arr = {1,2,3,4,5};
//	      // System.out.println(Arrays.toString(arr));
//	      
//	      // 2. newArr 생성
//	      int[] newArr = new int[5];
//	      
//	      // newArr의 인덱스 번호를 늘려주는 count변수
//	      int count = 0;
//	      
//	      // 3. for문을 활용해서 newArr에 데이터 넣기
//	      // arr을 마지막 방부터 시작해서 데이터를 차례대로
//	      // newArr에 담아주는 작업(대입)
//	      for(int i=4; i>=0; i--) {
//	         newArr[count] = arr[i];
//	         count++;
//	      }
//	      
//	      // 4. arr, newArr 출력
//	      System.out.println(Arrays.toString(arr));
//	      System.out.println(Arrays.toString(newArr));

//		 
		// 배열 두배 만들기
		
		 int [] arr = {1,2,3,4,5};
		 
		 int[] newarr = new int[5];
		 
		 for(int i=0; i<arr.length;i++) {
			 newarr[i]=arr[i]*2;
			 
		 } System.out.println(Arrays.toString(newarr));
		 
		 
		
		
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
