package kr.co.jsp.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class MembersManager {

	private static Scanner sc = new Scanner(System.in);
	private static Connection conn;
	private static PreparedStatement pstmt;
	private static ResultSet rs;
	
	
	public static void main(String[] args) {

		while(true) {
			System.out.println("\n### 회원 관리 프로그램 ###");
			System.out.println("# 1. 회원 정보 등록하기");
			System.out.println("# 2. 전체 회원 정보 조회하기");
			System.out.println("# 3. 개인 회원 정보 조회하기");
			System.out.println("# 4. 회원 정보 수정하기");
			System.out.println("# 5. 회원 정보 삭제하기");
			System.out.println("# 6. 프로그램 종료");
			
			System.out.print("# 메뉴를 입력하세요: ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				insert();
				break;
			case 2:
				selectAll();
				break;
			case 3:
				selectOne();
				break;
			case 4:
				update();
				break;
			case 5:
				delete();
				break;
			case 6:
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				System.exit(0);
			default:
				System.out.println("메뉴를 잘못 입력하셨습니다.");
			} //end switch
					
		} //end while true
		
		
	} // end main
	
	
	//Connection 객체를 제공하는 메서드.
	private static Connection getConnection() throws Exception {
		
		String driverName = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String uid = "hr";
		String upw = "hr";
		
		Class.forName(driverName);
		
		return DriverManager.getConnection(url, uid, upw);
		
	}
	
	//1. 회원 정보를 INSERT하는 메서드.
	private static void insert() {
		
		System.out.println("# 회원 정보를 입력하세요: ");
		System.out.print("# 아이디: ");
		String id = sc.next();
		
		System.out.print("# 비밀번호: ");
		String pw = sc.next();
		
		System.out.print("# 이름: ");
		String name = sc.next();
		
		System.out.print("# 이메일: ");
		String email = sc.next();
		
		String sql = "INSERT INTO members VALUES(?,?,?,?)";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			pstmt.setString(3, name);
			pstmt.setString(4, email);
			
			int rn = pstmt.executeUpdate();
			
			if(rn == 1) {
				System.out.println("회원 정보 저장이 완료되었습니다.");
			} else {
				System.out.println("회원 정보 저장에 실패했습니다.");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}			
		}
		
	} //insert 끝
	
	//2. 전체 회원 정보를 SELECT 하는 메서드
	private static void selectAll() {
		
		String sql = "SELECT * FROM members ORDER BY id ASC";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			System.out.println("========== 전체 회원 정보 ==========");
			while(rs.next()) {
				System.out.println("아이디: " + rs.getString("id"));
				System.out.println("비밀번호: " + rs.getString("pw"));
				System.out.println("이름: " + rs.getString("name"));
				System.out.println("이메일: " + rs.getString("email"));
				System.out.println("=========================================");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close(); pstmt.close(); conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	//3. 개별 회원 정보를 SELECT 하는 메서드
	private static void selectOne() {
		
		System.out.println("조회하실 ID를 입력하세요.");
		System.out.print("> ");
		String id = sc.next();
		
		String sql = "SELECT * FROM members WHERE id=?";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				System.out.println("========== 회원 정보 ===========");
				System.out.println("아이디: " + rs.getString("id"));
				System.out.println("비밀번호: " + rs.getString("pw"));
				System.out.println("이름: " + rs.getString("name"));
				System.out.println("이메일: " + rs.getString("email"));
				System.out.println("=========================================");
			} else {
				System.out.println("해당 회원 정보는 존재하지 않습니다.");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close(); pstmt.close(); conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	//4. 개인 회원 정보를 수정하는 메서드
	private static void update() {
		System.out.println("수정하실 ID를 입력하세요.");
		System.out.print("> ");
		String id = sc.next();
		
		System.out.println("수정할 값을 입력하세요.");
		
		System.out.print("이름: ");
		String cName = sc.next();
		
		System.out.print("이메일: ");
		String cEmail = sc.next();
		
		String sql = "UPDATE members SET name=?, email=? WHERE id=?";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, cName);
			pstmt.setString(2, cEmail);
			pstmt.setString(3, id);
			
			int rn = pstmt.executeUpdate();
			
			if(rn == 1) {
				System.out.println("회원정보가 수정되었습니다.");
			} else {
				System.out.println("회원 정보 수정에 실패했습니다.");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close(); conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
			
	}
	
	//5. 회원 정보를 삭제하는 메서드
	private static void delete() {
		
		System.out.println("삭제할 회원의 ID를 입력하세요.");
		System.out.print("> ");
		String id = sc.next();
		
		String sql = "DELETE FROM members WHERE id=?";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			
			int rn = pstmt.executeUpdate();
			
			if(rn == 1) {
				System.out.println("회원 ID: " + id + "이(가) 정상 삭제되었습니다.");
			} else {
				System.out.println("DB에 회원 정보 삭제를 실패했습니다.");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close(); conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
	

}

















