package 추상화;

public class Student2 extends Student {

	
	String name;
	String position;
	
	public Student2(String n, String p) {
		this.name = n;
		this.position = p;
	}
	
	
	@Override
	public void study() {
	 System.out.println(position + "공부하는 중");
		
	}

	
	
}
