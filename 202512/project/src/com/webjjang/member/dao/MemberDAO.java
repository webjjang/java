package com.webjjang.member.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.webjjang.member.vo.LoginVO;
import com.webjjang.member.vo.MemberVO;

public class MemberDAO {
	
	// DB필요한 객체
	// DB 연결 객체 - DB 회사에서 제공하는 드라이버를 사용한다.
	// 드라이버가 필요하다. 오라클인 경우 설치하면 폴더 안에 존재한다. - 라이브러리로 등록 시킨다.
	Connection con = null;
	// 쿼리를 실행하는 객체
	PreparedStatement pstmt = null;
	// 결과를 저장하는 객체 - select 일때만 사용되는 객체
	ResultSet rs = null;
	
	// DB 연결 정보
	final String DRIVER = "oracle.jdbc.OracleDriver";
	final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	final String UID = "java";
	final String UPW = "java";
	

	// 1-1. 로그인 처리 - 데이터 가져오기(R) - 1개 데이터 가져오기.(view)
	public LoginVO login(LoginVO userVO) throws Exception{
		LoginVO vo = null;
		
		// 1. 드라이버 확인
		Class.forName(DRIVER);
		// 2. 연결 객체
		con = DriverManager.getConnection(URL, UID, UPW);
		// 3. SQL 작성
		String sql = "select m.id, m.name, m.gradeNo, g.gradeName from member m, grade g "
				+ " where (id = ? and pw = ?) and (m.gradeNo = g.gradeNo)";
		// 4. 실행 객체 & 데이터 세팅
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, userVO.getId());
		pstmt.setString(2, userVO.getPw());
		// 5. 실행
		rs = pstmt.executeQuery();
		// 6. 저장
		if(rs != null && rs.next()) {
			vo = new LoginVO();
			vo.setId(rs.getString("id"));
			vo.setName(rs.getString("name"));
			vo.setGradeNo(rs.getInt("gradeNo"));
			vo.setGradeName(rs.getString("gradeName"));
		}
		// 7. 닫기
		if(con != null) con.close();
		if(pstmt != null) pstmt.close();
		if(rs != null) rs.close();
		
		return vo;
	} // login()의 끝
	
	// 1-2. 로그아웃 처리 - DB 사용하지 않음.
	
	// 2-1. 회원가입
	public Integer write(MemberVO vo) throws Exception {
		Integer result = 0;
		
		// 1. 드라이버 확인
		Class.forName(DRIVER);
		// 2. 연결객체
		con = DriverManager.getConnection(URL, UID, UPW);
		// 3. SQL 작성
		String sql = "insert into member(id, pw, name, gender, birth, tel, email) "
				+ " values(?,?,?,?,?,?,?)";
		// 4. 실행객체 & 데이터 세팅
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, vo.getId());
		pstmt.setString(2, vo.getPw());
		pstmt.setString(3, vo.getName());
		pstmt.setString(4, vo.getGender());
		pstmt.setString(5, vo.getBirth());
		pstmt.setString(6, vo.getTel());
		pstmt.setString(7, vo.getEmail());
		// 5. 실행 //6. 데이터 저장
		// select - executeQuery() : rs, insert, update, delete - executeUpdate() : Integer
		result = pstmt.executeUpdate();
		// 7. 닫기
		if(con != null) con.close();
		if(pstmt != null) pstmt.close();
		
		return result;
	} // write()의 끝

	// 3-1 . 아이디 찾기 처리 - 데이터 가져오기(R) - 1개 데이터 가져오기.(view)
	public String searchId(MemberVO vo) throws Exception{
		String id = null;
		
		// 1. 드라이버 확인
		Class.forName(DRIVER);
		// 2. 연결 객체
		con = DriverManager.getConnection(URL, UID, UPW);
		// 3. SQL 작성
		String sql = "select id from member where name = ? and email = ?";
		// 4. 실행 객체 & 데이터 세팅
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, vo.getName());
		pstmt.setString(2, vo.getEmail());
		// 5. 실행
		rs = pstmt.executeQuery();
		// 6. 저장
		if(rs != null && rs.next()) {
			id = rs.getString("id");
		}
		// 7. 닫기
		if(con != null) con.close();
		if(pstmt != null) pstmt.close();
		if(rs != null) rs.close();
		
		return id;
	} // seachId()의 끝
	
	// 4-1. 비밀번호 찾기 정보 확인 - 데이터 가져오기(R) - 1개 데이터 가져오기.(view)
	public String checkPw(MemberVO vo) throws Exception{
		String id = null;
		
		// 1. 드라이버 확인
		Class.forName(DRIVER);
		// 2. 연결 객체
		con = DriverManager.getConnection(URL, UID, UPW);
		// 3. SQL 작성
		String sql = "select id from member where id = ? and name = ? and birth = ?";
		// 4. 실행 객체 & 데이터 세팅
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, vo.getId());
		pstmt.setString(2, vo.getName());
		pstmt.setString(3, vo.getBirth());
		// 5. 실행
		rs = pstmt.executeQuery();
		// 6. 저장
		if(rs != null && rs.next()) {
			id = rs.getString("id");
		}
		// 7. 닫기
		if(con != null) con.close();
		if(pstmt != null) pstmt.close();
		if(rs != null) rs.close();
		
		return id;
	} // checkPw()의 끝
	
	// 3-2. 비밀번호 변경
	// user = 1 로그인한 사용자가 변경하고 있다. 현재 비밀번호를 붙인다.
	// user = 0 비밀번호 찾기에서 임시비밀번호를 저장해야 하므로 현재 비밀번호가 없다.
	public Integer changePw(MemberVO vo, Integer user) throws Exception {
		Integer result = 0;
		
		// 1. 드라이버 확인
		Class.forName(DRIVER);
		// 2. 연결객체
		con = DriverManager.getConnection(URL, UID, UPW);
		// 3. SQL 작성
		String sql = "update member set pw = ? where id = ? ";
		if(user == 1) sql += " and pw = ?";
		// 4. 실행객체 & 데이터 세팅
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, vo.getNewPw());
		pstmt.setString(2, vo.getId());
		if(user == 1) pstmt.setString(3, vo.getPw());
		// 5. 실행 //6. 데이터 저장
		// select - executeQuery() : rs, insert, update, delete - executeUpdate() : Integer
		result = pstmt.executeUpdate();
		// 7. 닫기
		if(con != null) con.close();
		if(pstmt != null) pstmt.close();
		
		return result;
	} // changePw()의 끝

	// ---------------- 관리자 메뉴 ----------------
	// 5. 회원 리스트
	public List<MemberVO> list() throws Exception {
		List<MemberVO> list = null;
		
		list = new ArrayList<>();
		
		// 1. 드라이버 확인 - static으로 선언된 내용이 자동으로 올라간다.
		Class.forName(DRIVER);
		
		// 2. 연결 객체 - 정보를 넣고 서버에 다녀온다.
		// getConnection() - static
		con = DriverManager.getConnection(URL, UID, UPW);
		
		// 3. 실행할 쿼리 작성
		String sql = "select m.id, m.name, m.gender, to_char(m.birth, 'yyyy-mm-dd') birth, "
				+ " m.tel, m.email, m.gradeNo, g.gradeName "
				+ " from member m, grade g where (m.gradeNo = g.gradeNo) order by id";
		
		// 4. 실행 객체 & 데이터 세팅
		pstmt = con.prepareStatement(sql);
		
		// 5. 실행 : select :executeQuery() -> rs, insert / update / delete :executeUpdate() -> Integer
		rs = pstmt.executeQuery();
		
		// 6. DB에서 가져온 데이터 채우기
		if(rs != null) {
			while(rs.next()) { // 데이터가 있는 만큼 반복 실행
				// 저장할 객체를 생성한다.
				MemberVO vo = new MemberVO();
				vo.setId(rs.getString("id"));
				vo.setName(rs.getString("name"));
				vo.setGender(rs.getString("gender"));
				vo.setBirth(rs.getString("birth"));
				vo.setTel(rs.getString("tel"));
				vo.setEmail(rs.getString("email"));
				vo.setGradeNo(rs.getInt("gradeNo"));
				vo.setGradeName(rs.getString("gradeName"));
				
				list.add(vo);
			}// while의 끝
		}// if의 끝

		// 7. DB 닫기
		con.close();
		pstmt.close();
		rs.close();
		
		return list;
	} // list()의 끝

} // 클래스의 끝
