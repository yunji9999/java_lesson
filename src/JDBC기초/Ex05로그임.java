package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Ex05로그임 {

	public static void main(String[] args) {
		//0. 사용자에게 로그인하고 싶은 id, pw 입력받고
		//1. tray~~catch 안에서
		//2. 드라이버 로딩
		//3. DB연결
		//4. 미완성 SQL에 정보 넣고
//		5. SELECT문 실행
//		6. 결과를
//		ResultSte rs= psmt.executeQuery();
//		에 담기 까지
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("id 입력 >>");
		String id = sc.next();
		System.out.println("pw 입력 >>");
		String pw = sc.next();
		
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "nthnew";
			String password = "12345";
			Connection conn = DriverManager.getConnection(url, user, password);
			
			if(conn != null) {
				System.out.println("연결");
			}else 
				System.out.println("연결x");
			
			
			String sql = "SELECT * FROM DCXSTU WHERE ID =? AND PW = ?";
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			 psmt.setString(1,id);
			 psmt.setString(2, pw);
			 
			 ResultSet rs= psmt.executeQuery();
			
			 
			 
			 
			 //rs.next() 했을 때, 조회환 결과가 있으면 true가 돌아옴
			 //만약에 rs.next()했는데, 결과가 여러 행이라면 while 문으로 돌릴 수 있음
			 //--> 한번 반복할 때마다 계속 그 다음 행으로 넘어가서 실행
			 // 	마지막행까지 실행하면 끝
			 
			 
			 if(rs.next()) {
				 System.out.println(rs.getString("name")+"님 환영합니다.");
			 }else {
				 System.out.println("존재하는 회원 정보가 없습니다.");
			 }
			 
			 
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	
	
	
	
	
	
	
	}

}
