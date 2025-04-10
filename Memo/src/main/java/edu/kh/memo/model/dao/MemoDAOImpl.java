package edu.kh.memo.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;


import edu.kh.memo.common.JDBCTemplate;
import edu.kh.memo.model.dto.Member;
import edu.kh.memo.model.dto.MemoList;

import static edu.kh.memo.common.JDBCTemplate.*;

public class MemoDAOImpl implements MemoDAO {

	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;

	private Properties prop;

	@Override
	public int memoUpdate(Connection conn, int memoNo, String memoTitle, String memoDetail) throws Exception {

		int result = 0;

		try {
			String sql = prop.getProperty("memoUpdate");

			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, memoTitle);
			pstmt.setString(2, memoDetail);
			pstmt.setInt(3, memoNo);

			result = pstmt.executeUpdate();

		} finally {
			close(pstmt);

		}

		return result;
	}

	@Override
	public int memberUpdate(Connection conn, int memberNo, String memberId, String memberPw) throws Exception {

		int result = 0;

		try {

			String sql = prop.getProperty("memberUpdate");

			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, memberId);
			pstmt.setString(2, memberPw);
			pstmt.setInt(3, memberNo);

			result = pstmt.executeUpdate();

		} finally {
			close(pstmt);
		}

		return result;
	}

	@Override
	public Member login(Connection conn, String memberId, String memberPw) throws Exception {

		Member member = null;

		try {
			String sql = prop.getProperty("loginMember");

			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, memberId);
			pstmt.setString(2, memberPw);

			rs = pstmt.executeQuery();

			while (rs.next()) {

				member = Member.builder().memberNo(rs.getInt("MEMBER_NO")).memberId(rs.getString("MEMBER_ID"))
						.memberPw("MEMBER_PW").memberName(rs.getString("MEMBER_NAME")).build();

			}

		} finally {
			JDBCTemplate.close(pstmt);
		}

		return member;
	}

	@Override
	public MemoList selectOne(Connection conn, int memoNo) throws Exception {
		
		MemoList memo = null;

	    String sql = "SELECT * FROM TB_MEMO WHERE MEMO_NO = ?";

	    PreparedStatement pstmt = conn.prepareStatement(sql);
	    pstmt.setInt(1, memoNo);
	    ResultSet rs = pstmt.executeQuery();

	    if (rs.next()) {
	    	memo = MemoList.builder()
	    		    .memoNo(rs.getInt("MEMO_NO"))
	    		    .memoTitle(rs.getString("MEMO_TITLE"))
	    		    .memoDetail(rs.getString("MEMO_DETAIL"))
	    		    .memoDate(rs.getString("MEMO_DATE"))
	    		    .memoUpdate(rs.getString("MEMO_UPDATE"))
	    		    .build();
	    }

	    rs.close();
	    pstmt.close();

	    return memo;
	}

	@Override
	public int memoDelete(Connection conn, int memo) throws Exception {

		int result = 0;
		
		try {
			
			String sql = prop.getProperty("memoDelete");
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, memo);
			
			result = pstmt.executeUpdate();
			
		} finally {

			JDBCTemplate.close(pstmt);
      
     }
  
  @Override
	public int memoAdd(Connection conn, String memoTitle, String memoDetail) throws Exception {
		
		int result = 0;
		
		try {
			String sql = prop.getProperty("memoAdd");
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, memoTitle);
			pstmt.setString(2, memoDetail);
			
			result = pstmt.executeUpdate();
			
		}finally {
			
			close(pstmt);
		}
		
		return result;
	}
