package 조건문;

import java.util.Scanner;

public class switch_case예제 {

	public static void main(String[] args) {
		
	      Scanner sc = new Scanner(System.in);

	      String id = "test";
	      String pw = "test1234";
	      String userId = "";
	      String userPw = "";
	      
	      // 로그인시도 횟수 카운트
	      int count = 0;

	      do {
	         System.out.print("아이디입력");
	         userId = sc.next();
	         System.out.print("비밀번호입력");
	         userPw = sc.next();

	         if (id.equals(userId) && pw.equals(userPw)) {
	            System.out.println("로그인성공!");
	            break;
	         } else {
	            System.out.println("뭔가틀렸음..");
	         }
	         count++;
	         if(count==3) {
	            System.out.println("기회를 다 썼습니다!");
	            break;
	         }
	      } while (true);
