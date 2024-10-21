package 인터페이스;

public class Parrot extends Animal implements Speak {

	@Override
	public void move() {
		System.out.println("날개를 움직여 날아다닙니다.");
		
	}

	@Override
	public void speaking() {
		System.out.println("안녕안녕");
		
	}

	@Override
	public void barking() {
		System.out.println("짹짹");
		
	}
	
	

}