package View;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Scanner;

import Controller.MemberDAO;
import Model.MemberDTO;

public class MemberMain {

	public static void main(String[] args) {
		//디자인 패턴
		//: 계속 같은 문제가 발생해서, 이 문제를 해결하고자 형식이나 규칙을 지정해놓은 것
		// 프로그램 등 개발할 때 좀 더 쉽고 편리하게 사용할 수 있게 만든 방법들
		
		
		//NVC(Model-View-Controller)패턴
		//- 프로그램을 Model, View, Controller 3가지 요소로 구분하는 개발방법론
		
		
		//Model: 데이터를 저장하고, 조작하기 위한 코드들
		//View: 사용자에게 직접적으로 보여지는 코드들
		//Controller: Model과 View 사이에서 데이터 흐름을 제어
		 				
		Scanner sc =  new Scanner(System.in);
		
		while (true) {
			
		
		System.out.println("=======SMHRD 회원관리 프로그램=======");
		
		//int choice = 사용자가 입력한 메뉴번호
		
//		6. 1~5 이외의 숫자를 입력하면 프로그램 종료 else
		
		

		
		System.out.println("[1]회원가입 [2]로그인 [3]회원탈퇴 [4]전체회원조회 [5]회원정보수정");
		int input = sc.nextInt();
		
		if(input==1) {
//		1. 회원가입
			// id pw name age 입력 받아서 변수 저장
			System.out.println("ID 입력 >> ");
			String id = sc.next();
			System.out.println("PW 입력 >> ");
			String pw = sc.next();
			System.out.println("이름 입력 >> ");
			String name = sc.next();
			System.out.println("나이 입력 >> ");
			int age = sc.nextInt();
			
			
			//회원가입에 필요한 정보를 받았으니 
			//DTO에 정보를 채우기
			MemberDTO dto = new MemberDTO(id, pw, name, age);
			
			
			// DAO기능 사용하기 위해 객체 생성
			MemberDAO dao = new MemberDAO();
			
			int result = dao.join(dto);
			
			
			//성공 여부 확인을 위해 join의 리턴값 저장
			if(result>0) {
				System.out.println("회원가입성공!");
			}else {
				System.out.println("회원가입실패!");
			}
			
			
			
			
		}else if(input==2) {
//		2. 로그인
			
		}else if(input==3) {
//		3. 회원탈퇴
		// 사용자에게 ID와 PW 입력받기
		System.out.println("id입력>> ");
		 String id = sc.next();
		System.out.println("pw입력>> ");
		 String pw = sc.next();
		 
		 //dao, dto 객체 쟁성
		 
		 //회원 탈퇴에 필요한 정보: id, pw 뿐이기 때문에
		 //dto 생성자도 id, pw 정보만 초기화 시키는 생성자
		 // 하나 새로 만들기
		//회원탈퇴에 필요한 정보를 받았으니 
			//DTO에 정보를 채우기
			MemberDTO dto = new MemberDTO(id, pw);
			
			
			// DAO기능 사용하기 위해 객체 생성
			MemberDAO dao = new MemberDAO();
			
			
			
			int result = dao.delete(dto);
			
			
			//성공 여부 확인을 위해 delete의 리턴값 저장
			if(result>0) {
				System.out.println("회원탈퇴성공!");
			}else {
				System.out.println("회원탈퇴실패!");
			}
		 
		 
		}else if (input==4) {
//		4. 전체회원조회
			System.out.println("ID \t 이름 \t 나이 \t");
			//dao 객체 필요
			
			MemberDAO dao = new MemberDAO();
			
			ArrayList<MemberDTO>list = dao.selectAll();
			
			//for-each문: 배열의 크기만큼 반복되는 반복문
				for(MemberDTO dto : list) {
					System.out.print(dto.getId()+"\t");
					System.out.print(dto.getname()+"\t");
					System.out.print(dto.getage()+"\t");
					System.out.println();
				}
			
			dao.selectAll();
			
			
			
		}else if(input==5) {
//		5. 회원정보 수정
			
		}else {
			System.out.println("다시 입력해주세요");
		}
		break;}
	}

}
