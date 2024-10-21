package 상속;

public class AnimalMain {

	public static void main(String[] args) {
		
		// Animal 클래스 기반으로 만든 객체
		Animal a = new Animal();
		
		// Dog 클래스 기반으로 만든 객체
		Dog b = new Dog();
		
		
		// Cat 클래스 기반으로 만든 객체
		Cat c = new Cat();
		
		
		a.cry();
		b.cry();
		c.cry();
		
		// 업캐스팅을 하면 상위 클래스의 매소드만 사용할 수 있고
		//하위 클래스에서 추가로 구현해놓은 매소드느 사용 불가
		//->상위 클래스에서는 공통적으로 사용되는 메소드를 정의하고
		// 하위 클래스에서는 구현만
		// Dog를 업캐스팅
		// Dup은 Animal로 형변환 되었기 때문에
		// Dog에만 있는 기능은 쓸 수 없음
		Animal dUP = new Dog();
		dUP.cry();
		//dUP.walk();
		//->안되는 이유: dUP에 자료형이 Animal이기 때문
		
		//다운캐스팅
		//->다시 원래 자료형으로 되돌리는 작업
		
		Dog dDown = (Dog)dUP;
	}

}
