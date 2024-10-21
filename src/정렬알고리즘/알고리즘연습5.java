package 정렬알고리즘;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import 이차원배열.Array;

public class 알고리즘연습5 {

	public static void main(String[] args) {
//		[5] 머쓱이보다 키 큰 사람
//		- 키 순으로 줄을 설 때 몇 번째로 서야 하는지 궁금해졌습니다.
//		  머쓱이네 반 친구들의 키가 담긴 정수 배열 array와 머쓱이의 키 height가 변수로 주어질 때, 
		//머쓱이보다 키 큰 사람 수를 출력해주세요!
//		※ array가 {149, 180, 192, 170} 이고,  int height=167 일때, 3 출력 
//		※ array가 {180, 120, 140} 이고,  int height=190 일때, 0 출력 

		Scanner sc = new Scanner(System.in);
		
		System.out.print("친구들 키 개수: ");
		
		int n = sc.nextInt();
		
		int[] arr = new int [n];
		
		
		System.out.print("친구들 키 : ");
		
		
		for (int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print("내 키 : " );
		int h = sc.nextInt();
		
		
		
		
		for(int l=arr.length-1;l>=0;l--){
			for (int j=0; j<l; j++) {
				if(arr[j]<h) {
					int temp = arr[j];
					arr[j]=h;
					h=temp;
			}
			}
		}   System.out.println(Arrays.toString(arr));
		
		
		

		 // 선택 정렬 메서드
	    public static void selectionSort(int[] array) {
	        int n = array.length;
	        for (int i = 0; i < n - 1; i++) {
	            int minIndex = i;
	            for (int j = i + 1; j < n; j++) {
	                if (array[j] < array[minIndex]) {
	                    minIndex = j;
	                }
	            }
	            // Swap
	            if (minIndex != i) {
	                int temp = array[i];
	                array[i] = array[minIndex];
	                array[minIndex] = temp;
	            }
	        }
	    }

	    // 머쓱이보다 키가 큰 사람 수를 세는 메서드
	    public static int countTallerPeople(int[] array, int height) {
	        int count = 0;
	        for (int h : array) {
	            if (h > height) {
	                count++;
		
		
		
		
		
		
		
		
		
	}

}
