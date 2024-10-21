package 배열;

import java.util.Arrays;
import java.util.Random;

public class EX04배열예제3 {

	public static void main(String[] args) {
		
		//랜덤 도구 꺼내기
		Random ran = new Random();
		
		//배열 생성
		int[] array = new int[5];
		array[0] = ran.nextInt(5)+1;
		// ex) array의 0번방 데이터를 랜덤수로 초기화
		
		for (int i=0;i<array.length;i++) {
			//0~4번 인덱스에 랜덤값 넣는 작업
			array[i]=ran.nextInt(5)+1;
			//넣었는데 혹시 이 전 데이터들이랑 중복?
			for (int j=0;j<array.length;j++) {
				if(i>j) {
				if (array [i] == array [j]) {
					i=i-1; //i--;
					
				}  }
				
				
				}
		
			
}System.out.println(Arrays.toString(array));
}}
