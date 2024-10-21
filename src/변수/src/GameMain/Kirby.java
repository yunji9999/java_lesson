package GameMain;

import java.util.Scanner;

public class Kirby {
	
	String name;
	int level = 1;
	int hp = 30;
	String food;
	String food2;

	
	public void start() {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("커비의 이름을 입력하세요.");
		
		this.name = sc.next();
		
		System.out.println("커비가 좋아하는 음식을 입력하세요");
		
		this.food = sc.next();
		// 1. 사용자에게 커비 이름 + 좋아하는 음식 입력받기
		// 2. 레벨은 초기값 1
		// 3. hp는 초기값 30
		
		
		System.out.println(this.name + "이 길을 떠납니다..");
		
		
		
	    System.out.println("어떤 음식을 먹을가요?");
	    this.food2 = sc.next();
	    
	    this.level += Func.eat(food);
		//전투 발생!
		// Func에 fight라는 메소드 생성 + 사용
		// *fight 메소드 완성시켜보기*
		
	    System.out.println("전투가 시작됩니다");
	    
		this.level += Func.fight(hp);
		
		// 식사하기
		// Func에 eat이라는 메소드를 생성 + 사용
		// *먹일 음식 입력 받아서 매개변수로 eat에 보내기*
		// *eat 메소드 완성시키기*
		System.out.println(this.name + "님의 최종 레벨은: "+ this.level);
		System.out.println(this.name + "님의 남은 hp는: "+ this.hp);
		
		
	}
}
