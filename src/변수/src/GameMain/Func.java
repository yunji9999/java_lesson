package GameMain;

import java.util.Random;
import java.util.Scanner;

public class Func {

	//게임에 들어가는 로직들을 정의
	//로직들을 가져다 쓰기 위해 정의 하는 거여서
	//객체 생성할 필요는 없음
	// ---> static 형태로 메소드 정의해보자
	
	public static int fight(int hp) {
		//가상의 적과 싸워서 
		//이기면 경험치(level) +30 비기면 15 지면 5
		//경험치 (int)로 return
	    Kirby a = new Kirby();
	    
		  Random rand = new Random();
	      int mon = rand.nextInt(50);
		
	      System.out.println("싸움이 시작됩니다.");
	      System.out.println("상대 hp는 " + mon);
	      
		if(mon<a.hp) {
			a.level += 30;
			System.out.println("이겼습니다");
		}else if(mon==a.hp) {
			a.level += 15;
			System.out.println("비겼습니다");
		}else { 
		}	a.level += 5;
			System.out.println("졌습니다");
	
		System.out.println("경험치가 올랐습니다.");
	     return a.level;
	    	
	}
	
	public static int eat(String food) {
	
		Kirby a = new Kirby();
		//사용자에게 먹일 음식을 매개변수로 받아와서
		//커비가 좋아하는 음식이면 경험지 +50
		//다른 음식들이면 경험치 -10
		//경험치 return
		//좋아하는 음식: 사과
		
		Scanner sc = new Scanner(System.in);
		
		
		//메뉴판: 사과 바나나 키위 포도
		if((a.food2).equals(a.food)) {
			a.hp += 50;
			System.out.println(a.name + "가 좋아하는 음식을 입력하셨습니다.");
		}else {
			a.hp -= 10;
	    	System.out.println(a.name + "가 좋아하는 음식이 아니에요");
	    	System.out.println("hp가 달라졌습니다");
	    }
		
		return a.hp;
		    
	}
	

}
