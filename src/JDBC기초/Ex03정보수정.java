package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Ex03정보수정 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("id 입력 >> ");
		String id = sc.next();
		System.out.println("pw 입력 >> ");
		String pw = sc.next();
		System.out.println("새 나이를 입력하세요 >> ");
		int age = sc.nextInt();
		//->id, pw가 일치하는 데이터의 나이 수정
		
		
		
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "nthnew";
		String password = "12345";
		Connection conn = DriverManager.getConnection(url, user, password);
		
		
		if(conn != null) {
			System.out.println("연결 성공");
		} else {
			System.out.println("연결 실패");
			
		} 
		
		 String sql = "UPDATE DCXSTU SET AGE=? WHERE ID=? AND PW=?";
		 PreparedStatement psmt = conn.prepareStatement(sql);
		 psmt.setInt(1,age);
		 psmt.setString(2,id);
		 psmt.setString(3, pw);
		
		 
		 // sql전송
		 int result = psmt.executeUpdate();
		 
		 if(result>0) {
			 System.out.println("회원정보수정 성공");
		 }else 
			 System.out.println("회원정보수정 실패");
		}
		
		catch (Exception e) {
			
		}

		
		
		
		
		
		
		
		
		
		
	}
		
		
		
	}

