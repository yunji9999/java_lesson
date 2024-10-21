package 클래스객체;

import java.util.Scanner;

public class EX02통장예제 {

	public static void main(String[] args) {
		// 1. 통장 클래스 설계
		// 2. 객체 생성
		bank mrBank = new bank();

		// 통장 잔액 설정
		// mrBank.money = 1000;

//		//잔액 조회
//		System.out.println(mrBank.showmoney());
//		//mrBank.showmoney()라고 쓰면 보여지지는 않기 때문에 프린트를 꼭 해줘야함
//				
//		//입금
//		mrBank.deposit(10000);
//		
//		System.out.println(mrBank.showmoney());
//		
//		//출금
//		mrBank.outmoney(15000);
//		
//		System.out.println(mrBank.showmoney());

		Scanner sc = new Scanner(System.in);

		System.out.println("============국 민 은 행============");

		while (true) {
			System.out.println();
			System.out.println();
			System.out.println("메뉴를 선택해주세요");
			System.out.println("[1]잔액조회 [2]입금 [3]출금 [4]종료");
			System.out.print(">>");
			int choice = sc.nextInt();

			if (choice == 1) {
				// 잔액조회
				System.out.println();
				System.out.println("잔액은 "+ mrBank.showmoney() + "원 입니다.");
				
			} else if (choice == 2) {
				// 입금기능
				System.out.println();
				
				System.out.println("얼마를 입금하시겠습니까?");
				int dMoney = sc.nextInt();
				mrBank.deposit(dMoney);
				System.out.println();
				
			} else if (choice == 3) {
				// 출금기능
				System.out.println();
				
				System.out.println("얼마를 출금하시겠습니까?");
				int oMoney = sc.nextInt();
				mrBank.outmoney(oMoney);
				System.out.println();
				
			} else if (choice == 4) {
				// 종료
				break;
				
			} else {
				System.out.println();
				System.out.println("다시 입력해주세요");
			}
		}

	}

}
