package Model;

public class MemberDTO {
	//Model: 데이터를 관리하는 코드 모음
	//DTO(Data Tranfer object)
	//-데이터 가져오거나(getter), 변경하기(setter)
	
	//1. 필드 ->아이디, 비번, 이름, 나이 (private)
	private String id;
	private String pw;
	private String name;
	private int age;
	
	
	//2. 메소드
	
	//생성자 메소드
	public MemberDTO(String id, String pw, String name, int age) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
		
	
	}
	
	//회원탈퇴 메소드
	public MemberDTO(String id, String pw) {
		this.id = id;
		this.pw = pw;
		
	
	}
	
	//아이디, 이름, 나이만 저장할 수 있는 생성자 만듬
	public MemberDTO(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	//id, pw, 이름, 나이 데이터를 요청하면 return으로 돌려주는 메소드
	public String getId() {
		return id;	
	}

	public String getpw() {
		return pw;
	}
	
	public String getname() {
		return name;
	}
	
	public int getage() {
		return age;
	}
}
