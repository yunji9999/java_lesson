package 인터페이스;

public class Whale extends Animal implements Swim{

	@Override
	public void move() {
		System.out.println("꼬리를 흔듭니다.");
		
	}

	@Override
	public void Swimming() {
		System.out.println("바다에서 수영합니다.");
		
	}

}
