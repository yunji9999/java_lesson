package 정렬알고리즘;

import java.util.Scanner;

public class 알고리즘연습2 {

	public static void main(String[] args) {
		
//		어떤 세균은 1시간에 두배만큼 증식한다고 합니다. 
//		  t시간 후 세균의 수를 출력해주세요!
//		※ n이 2, t가 10일때 2048 출력
//		※ n이 7, t가 15일때 229376 출력	
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("n 입력 : ");
		int n = sc.nextInt();
		System.out.print("t 입력 : ");
		int t = sc.nextInt();
		
		for(int i=1;i<=t;i++) {
			//i를 t로 두고 i가 1씩 커지면 n은 두배가 됨
			// ex i=1 -> 2*n 
			// i=2 -> 2(2*n)
			// i=3 -> 2(2(2*n))
		
			
			n *= 2;
			
		}System.out.println(n);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
