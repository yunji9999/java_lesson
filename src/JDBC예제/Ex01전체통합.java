package JDBC예제;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Ex01전체통합 {

	public static void main(String[] args) {
		// 1. 로그인
		// 성적 조회할 수 있게
		// 성적 수정

		System.out.println("===스마트인재개발원===");
		System.out.println("[1] 로그인  [2] 종료");

		Scanner sc = new Scanner(System.in);

		System.out.println("ID를 입력하세요 >> ");
		String id = sc.next();
		System.out.println("PW를 입력하세요 >> ");
		String pw = sc.next();
		String score;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "nthnew";
			String password = "12345";
			Connection conn = DriverManager.getConnection(url, user, password);

			while (true) {
				if (conn != null) {
					System.out.println(id + "님 환영합니다.");
					break;
				} else
					System.out.println("다시 입력해주세요");
			}

			System.out.println("[1] 성적조회하기 [2] 성적수정하기 [3] 종료");

			int s = sc.nextInt();

//				System.out.println("score을 입력하세요 >> ");
//				int score = sc.nextInt();

			while (true) {
				if (s == 1) {
					String sql = "SELECT * FROM DCXSTU WHERE ID =? AND PW = ?";
					PreparedStatement psmt = conn.prepareStatement(sql);

					psmt.setString(1, id);
					psmt.setString(2, pw);

					ResultSet rs = psmt.executeQuery();
					rs.next();
					score = rs.getString("SCORE");
					
					System.out.println(id + "의 점수는 " + score + "점 입니다.");

					break;
					
					
				} else if (s == 2) { // 수정
					System.out.println("수정할 점수를 적어주세요 >> ");
					score = sc.next();
					
					String sql1 = "UPDATE DCXSTU SET AGE=? WHERE ID=? AND PW=?";
					PreparedStatement psmt = conn.prepareStatement(sql1);
					
					
					psmt.setString(1, id);
					psmt.setString(2, pw);
					psmt.setString(3, score);
					
					int result = psmt.executeUpdate();
	
					System.out.println(id + "의 수정된 점수는 " + score + "점 입니다.");

					break;


				} else if (s == 3) {
					break;
				} else
					System.out.println("다시 입력해주세요.");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
