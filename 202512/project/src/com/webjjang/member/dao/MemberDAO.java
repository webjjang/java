package com.webjjang.member.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
	

	// 로그인 처리 - 데이터 가져오기(R) - 1개 데이터 가져오기.(view)
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
	
	// 3. 회원가입
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

	// 아이디 찾기 처리 - 데이터 가져오기(R) - 1개 데이터 가져오기.(view)
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
	
	// 비밀번호 찾기 정보 확인 - 데이터 가져오기(R) - 1개 데이터 가져오기.(view)
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
	
	// 비밀번호 변경
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


} // 클래스의 끝
