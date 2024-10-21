import java.util.Random;
import java.util.Scanner;

public class 다마 {

	// 상태창 정보
	//체력 (health), 행복도 (happy)
	
	// 기능
	// 밥(eat), 잠(sleep), 놀기(play)
	// 밥 : health + 5
	// 잠 : health + 10 happy -20
	// 놀기 : health -20 happy +30
	// 초기화 : health, happy 데이터 초기화
	
	Scanner sc = new Scanner(System.in);
	// 상태창 정보
	private int health;
	private int happy;
	
	
	
	// 밥 기능
	
	public void eat() {
		
		//this 키워드: 자기 자신을 의미함
		this.health += Math.random() * 10;
		
		System.out.println("health가 상승했습니다.");
		
	}
	
	
	public void sleep() {
		this.health += 10;
		this.happy -= 20;
		System.out.println("zzz");
		System.out.println("health +10  happy -20");
		
	}
	
	public void play() {
		this.health -= 20;
		this.happy += 30;
		System.out.println("해피해피");
		System.out.println("health -20  happy +30");
	}
	
	public void renew() {
		this.health = 0;
		this.happy = 0;
		System.out.println("모든 상태가 초기화 됩니다.");
	}
	
	public void ShowStatus() {
		System.out.println("체력은 "+this.health);
		System.out.println("행복도는 "+ this.happy);
	}
	
	
	//이름 설정, 바꾸기
	public void name() {
		String name = sc.next();
		System.out.println();
		System.out.println();
		System.out.println(">>>>"+name+" 키우기 s͟͞t͟͞a͟͞r͟͞t͟͞");
		
	}
	
	public void khealth() {
		if (health==0) {
		 == 6
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
