import java.util.Scanner;

public class EX03다마고치 {

	public static void main(String[] args) {
		// 다마고치 게임 만들기
		
		// 1. 시작 메뉴 만들기
		//- 내 다마고치 상태 확인하기
		//- 밥 주기
		//- 재우기
		//- 놀아주기
		//- 다마고치 초기화하기
		//- 종료하기
		// FOR문 , 종료 조건 
		
		다마 ddDama = new 다마();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 설정해주세요");
		ddDama.name();
		
		System.out.println("︵‿︵‿︵((ฅ)　(ฅ))︵‿︵‿︵\r\n"
				+ "");
		System.out.println();
		
		while (true) {
		System.out.println();
		System.out.println("[0] 이름 바꾸기\r\n"+"① 내 다마고치 상태 확인하기\r\n"+"② 밥주기\r\n"+"③ 재우기\r\n"+"④ 놀아주기\r\n"+"⑤ 다마고치 초기화하기\r\n"+"⑥ 종료하기"); 
		System.out.println();
		System.out.print(">>");
		
		int choice = sc.nextInt();
		
		System.out.println("");
		
		    
		if(choice == 1) {
			ddDama.ShowStatus();
			
		}else if(choice == 0) {
			System.out.print("이름을 입력해주세요: ");
			ddDama.name();
			ddDama.khealth();
				
	
		}else if(choice == 2) {
			ddDama.eat();
			ddDama.khealth();
	
		}else if(choice == 3) {
			ddDama.sleep();
			ddDama.khealth();
			
		}else if(choice == 4) {
			ddDama.play();
			ddDama.khealth();
				
		}else if(choice == 5) {
			ddDama.renew();
			
			
		}else if(choice == 6) {
			System.out.println("종료");
			break;
			
		}else 
			System.out.println("다시 입력해주세요");

		}

	}

}
