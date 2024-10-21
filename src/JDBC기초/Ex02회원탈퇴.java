package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Ex02회원탈퇴 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("id 입력 >> ");
		String id = sc.next();
		System.out.println("pw 입력 >> ");
		String pw = sc.next();

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
			
			
			//3. 쿼리
			//회원 탈퇴 -> delte
			
			String sql = "DELETE FROM DCXSTU WHERE ID=? AND PW=?";
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);
			int result = psmt.executeUpdate();
			
			if(result>0) {
				System.out.println("성공");
			}else 
				System.out.println("실패");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
