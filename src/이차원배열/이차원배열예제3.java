package 이차원배열;

public class 이차원배열예제3 {

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
			        	 if(i%2==0) {
			        		 System.out.print(arr[i][j] + "\t");
			 			}
			        	 
			        	 else {
			        		 
			        	 System.out.print(arr[i][4-j] + "\t");
			         }
				      
			      } System.out.println();

	}

}

}
