
public class Cons {

	//만약 개발자가 생성자를 정리하지 않았으면
	//자동으로 기본 생선자가 정의됨 (컴파일러에 의해)
	String name;
	int age;
	
	
	//기본 생성자
	public Cons() {
		this.name = "이름 없음";
		this.age = 0;
	}
	
	
	//생성자로 데이터 값 미리 정의
	public Cons(String n, int a) {
		this.name = "n";
		this.age = a;
	}
	
	
	//생성자 오버로딩
	//- 생성자끼리 이름이 동일하나, 각자 매개변수의 타입과 개수가 다르면 별개의 생성자로 인식
	// *** 메소드에서도 별개의 메소드로 인식(오버로딩 가능)!!!!!
	
	
	
	
	
	
	
}
