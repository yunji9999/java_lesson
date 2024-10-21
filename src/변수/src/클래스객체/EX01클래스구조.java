package 클래스객체;

public class EX01클래스구조 {

	public static void main(String[] args) {
		// 메인메소드: 프로그램 시작점
		
		//1. 인간에 대한 설계도 만들기
		// person.java에 만들었음

		//2. 설계도 기반 실제 인간들 생성
		
		// 2-1 레퍼런스 변수, 객체 생성
		
		//scanner. sc = new scanner();-> 객체를 계속 만들고 있었던 거임
		person miri = new person();
		
		// 2-2. 실제 객체에 데이터 할당
		// 객체에 이름과 나이를 적어줘야하는데 객체 +. 하면 바로 나옴
		miri.age = 20;
		miri.name = "미리";

		miri.eat();
		
		
		person m = new person ();
		
		m.age = 18;
		m.name = "dd";
		
		m.eat();
		
		miri.introduce();
		m.introduce();
		
		miri.hello(" 방가방가");
		
		
	}

}
