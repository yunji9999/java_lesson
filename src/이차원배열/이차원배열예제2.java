package 이차원배열;

public class 이차원배열예제2 {

	public static void main(String[] args) {
		int count = 21;
		int[][] arr = new int[5][5];

		for (int i=0;i<5;i++) {
			
			for (int j=0;j<5;j++) {
				arr[i][j] = count++ ;
			}
		}
				
				for(int i=0; i<5; i++) {
			         for(int j=0; j<5; j++) {
			            System.out.print(arr[j][i] + "\t");
			         }
			         System.out.println();
			      }
				
				
			

	}

}
