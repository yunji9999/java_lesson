package 정렬알고리즘;

import java.util.Arrays;

public class EX02SelectionSort {

	public static void main(String[] args) {
		
		//선택정렬
				//가장 크거나 작은 원소를 찾아서
				//배열의 처음부터 끝 교체해나가는 정렬방법
				
				// step 1
				// 기준 인덱스:0
				// 가장 큰 수에 해당하는 인덱스 번호
		
		int[] array = {46, 2, 15, 86, 31};
		
		System.out.println(Arrays.toString(array));
	
		int max = 0;
		int s=0;
		
		
		for(int k=array.length;k>0;k--) {//==========>해보기
			s=k;
			
			for(int i=0;i<array.length;i++) {
			if(max<array[i]) {
				max=array[i];
				
				s=array[0];
				array[0]=max;
				array[i]=s;
			}
			
				
			
		}
		
		
	
		}System.out.println(Arrays.toString(array));
		
		//2단계
	      //기준 인덱스(=방번호) : 0
	      //가장 큰 수에 해당하는 인덱스 번호
		
		
//	      int[] ar= {46,2,15,86,50};
//	     
//	      int max = 0;
//	      
//	         for(int i=max;i<ar.length;i++) {
//	            if(ar[max]<ar[i]) {
//	               max=i;
//	            }
//	         }
//	      
//	         int temp = ar[0];
//	         ar[0]=ar[max];
//	         ar[max]=temp;
//	         
//	      
//	      max = 1;
//	         
//	         for(int i=max;i<ar.length;i++) {
//	            if(ar[max]<ar[i]) {
//	               max =i;
//	            }
//	         }
//	      
//	         temp = ar[1];
//	         ar[1]=ar[max];
//	         ar[max]=temp;   
//	   
//	      System.out.println("최종 값: "+Arrays.toString(ar));
//	      

		
		for(int i=maxIndex; i<array.length; i++) {
	         System.out.println(maxIndex +"와 "+i+" 인덱스끼리 비교");
	         if(array[maxIndex] < array[i]) {
	            System.out.println(i+"가 더 크다");
	            // 기준 인덱스보다 큰 데이터가 있으면 치환
	            // 최대 인덱스 번호만 찾아서 나가기
	            maxIndex = i;
	            System.out.println("최대 인덱스는" + i);
	         }
	      }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
