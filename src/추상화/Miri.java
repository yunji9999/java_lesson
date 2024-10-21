package 추상화;


//추상 클래스인 Student를 상속받는 Miri 클래스

public class Miri extends Student{

	String name;
	String position;
	
	//생성자
	public Miri(String n, String p){//(생성자랑 클래스 이름 똑같이 맞춰야 함))
	 this.name = n;
	 this.position = p;
	}
	
	@Override
	public void study() {
		//상속 받은 Student 추상 클래스의 추상 메소드인 Study는 
		//반드시 자식클래스인 Miri에서 오버라이딩(재정의)해줘야 함
		System.out.println(this.position + "으로 향하는 여정....");
	}

	
	
	
	
	
	
	
	
	
	
}
