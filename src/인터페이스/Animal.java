package 인터페이스;

public abstract class Animal extends Creature {

	//Creature의 추상메소드를 재정의
	public void alive() {
		System.out.println("숨을 쉬면서 살아있어요.");
	}
	//Animal의 추상 메소드
	public abstract void move();
	
	//추상클래스에서 일반 메소드도 작성 가능
	public void run() {
		System.out.println("달립니다.");
	}
}
