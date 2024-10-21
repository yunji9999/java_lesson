package 반복문;

public class EX08_이중FOR문 {

	public static void main(String[] args) {
		//바깥쪽 i for문 (0~5)
		for(int i=0; i<6; i++) {
			System.out.println("i는"+i);
			//안쪽 j for문 (0~5)
			//i for문에 한번 들어오면 안쪽 j for문이 끝가지 다 돌아야 i for문 빠져나갈 수 있음
			for(int j=0; j<6; j++) {
				System.out.print("j는"+j+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
