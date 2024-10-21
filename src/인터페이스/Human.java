package 인터페이스;

public class Human extends Animal implements Speak , Swim{

	
	@Override
	public void move() {
		System.out.println("두발로 걸어다닙니다.");
	}

	@Override
	public void speaking() {
		System.out.println("ㅎㅇㅎㅇ");
	}

	@Override
	public void barking() {
		System.out.println("왈왈");
		
	}

	@Override
	public void Swimming() {
		System.out.println("수영장에서 수영합니다.");
		
	}
	
	
}
