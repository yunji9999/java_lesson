package 상속;


//상속 받는 방법
//-> 클래스 이름 뒤에 extends 상속받을클래스이름

public class FeaturePhone extends Phone {
	
// phone의 데이터/로직을 그대로 물려받고,
// 사진찍기 (photo) 로직을 추가해보자!
	public void photo() {
		System.out.println("사진 찍기!");
	}
	
}
