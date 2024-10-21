package 클래스객체;

public class bank {
	
	//통장 필요한 데이터 : 잔액
	//기능: 입금, 출금
	
	//속성- 필드
	private int money; // 잔액
	//private : 접근제한자, 외부 파일에서 이 데이터를 건드릴 수 없도록 조치하는 거-> 같은 파일에서만 수정 가능 데이터 보호 가능
	//=캡슐화
	
	
	//기능- 메소드
	
	//입금 기능
	public void deposit(int m) {
		money += m;
		System.out.println("입금 완료");
	}
	
	public int showmoney() {
		return money;
		
	}
	
	//출금 기능
	
	public void outmoney(int k) {
		if(money<k) {
			System.out.println("출금 불가");
		}else {
		money -= k;
		System.out.println("출금 완료");
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
