package 정렬알고리즘;

import java.util.Arrays;
import java.util.Random;

public class 정렬예제 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int [] arr = new int [10];
		
		
		int temp = 0;
		
		//중복 없애기
		//정렬
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = ran.nextInt(100)+1;
		}
		  for(int k=1;k<arr.length;k++) {
			for(int j=0;j<k;j++) {
				if(arr[j]>arr[j+1]) {
		               temp = arr[j];
		               arr[j] = arr[j + 1];
		               arr[j + 1] = temp;
			
		}
				
			}
	}System.out.println(Arrays.toString(arr));
	
	
	
	
	}
}
