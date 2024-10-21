package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Model.MemberDTO;

public class MemberDAO {

	// DAO(Data Access Object)
	// - 데이터에 접근한느 것 도와줌

	// -DB에 연결해서 insert, delete, select 등 기능 할 수 있는 코드의 모음집
	// -메소드 형태로 코드 작성

	public void con(MemberDTO dto) {
		try {
			// 1. DB드라이버 꺼내기
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2. DB-JAVA 연결
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "nthnew";
			String password = "12345";
			Connection conn = DriverManager.getConnection(url, user, password);

			if (conn != null) {
				System.out.println("연결");
			} else
				System.out.println("연결x");
		} catch (Exception e) {

		}
		;
	}

	// join이라는 메소드 (회원가입 메소드)
	public int join(MemberDTO dto) {
		// 우리가 만든 객체를 매개변수로 넣어서 가지고와서 join 실행
		int result = 0;
		try {
			// 1. DB드라이버 꺼내기
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2. DB-JAVA 연결
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "nthnew";
			String password = "12345";
			Connection conn = DriverManager.getConnection(url, user, password);

			if (conn != null) {
				System.out.println("연결");
			} else
				System.out.println("연결x");
			// 3. 쿼리문 전송
			String sql = "INSERT INTO DCXSTU(ID, PW, NAME, AGE) VALUES (?,?,?,?)";
			// INSERT 문법에서 알고잇는거면 다 넣으면 되는데 모르면 괄호 안에서 명칭을 지정해줘야함

			PreparedStatement psmt = conn.prepareStatement(sql);

			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getpw());
			psmt.setString(3, dto.getname());
			psmt.setInt(4, dto.getage());

			result = psmt.executeUpdate();

		} catch (Exception e) {

		}
		return result;

	}

	public int delete(MemberDTO dto) {

		int result = 0;
		try {
			// 1. DB드라이버 꺼내기
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2. DB-JAVA 연결
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "nthnew";
			String password = "12345";
			Connection conn = DriverManager.getConnection(url, user, password);

			if (conn != null) {
				System.out.println("연결");
			} else
				System.out.println("연결x");
			// 3. 쿼리문 전송
			String sql = "DELETE FROM DCXSTU WHERE ID=? AND PW=?";
			// INSERT 문법에서 알고잇는거면 다 넣으면 되는데 모르면 괄호 안에서 명칭을 지정해줘야함

			PreparedStatement psmt = conn.prepareStatement(sql);

			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getpw());
			result = psmt.executeUpdate();

		} catch (Exception e) {

		}
		return result;

	}

	public ArrayList<MemberDTO> selectAll() {

		// MemberDTO 타입의 객체 배열 생성
		// arraylist 처럼 길이가 가변적
		ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2. DB-JAVA 연결
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "nthnew";
			String password = "12345";
			Connection conn = DriverManager.getConnection(url, user, password);

			if (conn != null) {
				System.out.println("연결");
			} else
				System.out.println("연결x");
			// 3. 쿼리문 전송
			String sql = "SELECT * FROM DCXSTU";

			PreparedStatement psmt = conn.prepareStatement(sql);

			ResultSet rs = psmt.executeQuery();

			// ResultSet 형태로 되어있는 결과물을 객체배열형태로 저장

			while (rs.next()) {
				String id = rs.getString("ID");
				String name = rs.getString("NAME");
				int age = rs.getInt("AGE");

				MemberDTO dto = new MemberDTO(id, name, age);
				
				//그 생성한 객관리
				
				list.add(dto);
			}
		} catch (Exception e) {

		}
			return list;
	}
}
