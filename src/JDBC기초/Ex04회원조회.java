package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Ex04회원조회 {

	public static void main(String[] args) {
	
		
		Connection conn = null;
		PreparedStatement psmt = null;
		
		try {
			//System.out.println(0);//디버깅코드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "nthnew";
			String password = "12345";
			
			System.out.println(1);
			conn = DriverManager.getConnection(url, user, password);
			
			if(conn != null) {
				System.out.println("연결");
			}else 
				System.out.println("연결x");

			
			String sql = "SELECT * FROM DCXSTU";
			
			
			System.out.println(2);
			psmt = conn.prepareStatement(sql);
			System.out.println(3);
			
			//4. sql 전송
			//ResultSet 객체 : JDBC에서 쿼리 결과를 정장하고 처리할 수 있게 도와줌
			ResultSet rs = psmt.executeQuery();
			
			//5.결과를 이용한 작업 처리
			//->사용자에게 어떤 모습을 보여줄 지 정의
			
			System.out.println("----전체 유저 조회----");
				while(rs.next()) {
					String id = rs.getString("ID");
					String name = rs.getString("NAME");
					int age = rs.getInt("AGE");
					System.out.println(id+"\t"+name+"\t"+age);
					
				}
			
			
		} catch (Exception e) {
			
	
	}}

}
