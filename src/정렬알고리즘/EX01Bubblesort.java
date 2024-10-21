package 정렬알고리즘;

import java.util.Arrays;

public class EX01Bubblesort {

	public static void main(String[] args) {
		//정렬 알고리짐 : 원소들을 일정한 순서대로 열거하는 알고리즘
		//BubbleSort: 두 인접한 원소끼리 비교해서 정렬하는 방법
		//->속도는 느리지만 코드 단순
		
		int[] array = {82, 45, 25, 12, 7};
		
		System.out.println("변경 전 : " + Arrays.toString(array));
		
	//step 1	
		for(int i=0; i<array.length-1; i++){
			//기준 인덱스가 더 크면 값 치환
			if(array[i]>array[i+1]) {
				//값 치환 로직
				int temp = array[i];
				array[i] = array[i+1];
				array[i+1] = temp;
						
			}
		}System.out.println("1차 : " + Arrays.toString(array));
	
		
		//step2
		
		for(int i=0; i<array.length-2; i++){
			//3까지만 보면 되니까 2를 빼줘야됨
			if(array[i]>array[i+1]) {
				//값 치환 로직
				int temp = array[i];
				array[i] = array[i+1];
				array[i+1] = temp;}
		}
		
			System.out.println("2차 : " + Arrays.toString(array));
		
			for(int i=0; i<array.length-3; i++){
				if(array[i]>array[i+1]) {
					int temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;}
			}
			
				System.out.println("3차 : " + Arrays.toString(array));
		
		
				for(int i=0; i<array.length-4; i++){
					if(array[i]>array[i+1]) {
						int temp = array[i];
						array[i] = array[i+1];
						array[i+1] = temp;}
				}
				
					System.out.println("4차 : " + Arrays.toString(array));
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
