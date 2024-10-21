package 이차원배열;

public class 이차원배열예제1 {

	public static void main(String[] args) {
//		1. 이차원 배열 생성
//		2. 배열에 값을 저장 (for문)
//		3. 출력 (행/열 정리 잘해서 )
		int count = 1;
		int[][] arr = new int[5][5];

		for (int i=0;i<5;i++) {
			
			for (int j=0;j<5;j++) {
				arr[i][j] = count++;
			}
		}
				
				for(int i=0; i<5; i++) {
			         //arr[i][0~4까지]
			         for(int j=0; j<5; j++) {
			            System.out.print(arr[i][j] + "\t");
			         }
			         System.out.println();
			      }
				
				
			}
				
	

}
