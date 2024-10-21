package ArrayList;

import java.util.ArrayList;

public class Ex01ArrayList사용법 {

	public static void main(String[] args) {
		// ArrayList
//		- 배열의 상위호환
//		- 데이터를 여러개 담을 수 있는 자료구조의 일종
//		
//		ArrayList 특징
//		- 다른 자료형끼리도 저장이 가능 ->int, string 같이 가능
//		- 들어가 있는 데이터 크기만큼 길이가 자동으로 맞춰져서 길이 설정 안해줘도 됨(=가변적)
//		- 길이가 가변적이기 때문에 추가와 삭제가 가능
//		- 데이터들 사이에 빈공간 들어갈 수 없음 중간에 데이터 삭제하더라도 뒤에 데이터가 앞으로 당겨짐
//
//		
//		ArrayList 만들기
		ArrayList list = new ArrayList();
		
		// 데이터 추가:  add라는 메소드 사용 ->add()
		
		list.add("미리");
		list.add("희진");
		
		//데이터 중간 삽입
		list.add(1, "승겸");
	
		list.add("재영");
		
		//리스트 출력
		System.out.println(list);
		
		//특정 인덱스 요소 알아내기
		System.out.println(list.get(1));
		
		
		//요소 삭제
		list.remove(0);
		System.out.println(list);
		
		
		//특정 인덱스 요소 수정
		list.set(2, "정환");
		System.out.println(list);
		
		
		//리스트의 모든 요소 삭제
		list.clear();
		System.out.println();
		
		//리스트의 길이 구하기
		System.out.println(list.size());
	

	
	
	
	}

}
