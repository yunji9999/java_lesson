package 이차원배열;

public class EX01이차원배열기초 {

	public static void main(String[] args) {
		//이차원 배열 생섬법
		
		 int count = 1;
	      
	      // 이차원 배열 생성법
	      int[][] arr = new int[5][5];
	      
	      // 각각의 인덱스에 값을 지정
	      // arr[0][0] = 1;
	      // arr[0][1] = 2;
	      
	      // for문을 활용해서 값을 저장
	      
	      // arr[0][0] = 1;
	      // arr[0][1] = 1;
	      // arr[0][2] = 1;
	      // arr[0][3] = 1;
	      // arr[0][4] = 1;

	      
	      // arr[1][0] = 1;
	      // arr[1][1] = 1;
	      // arr[1][2] = 1;
	      // arr[1][3] = 1;
	      // arr[1][4] = 1;
	      
	      // arr[2][0] = 1;
	      // arr[2][1] = 1;
	      // arr[2][2] = 1;
	      // arr[2][3] = 1;
	      // arr[2][4] = 1;
	      
	      // arr[i][?]
	      // i가 0~2까지
	      for(int i=0; i<5; i++) {
	         //arr[i][0~4까지]
	         for(int j=0; j<5; j++) {
	            arr[i][j] = count++;
	         }
	      }
	      
	      // 출력
	      for(int i=0; i<5; i++) {
	         //arr[i][0~4까지]
	         for(int j=0; j<5; j++) {
	            System.out.print(arr[i][j] + "\t");
	         }
	         System.out.println();
	      }
}}