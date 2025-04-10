package edu.kh.memo.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

import edu.kh.memo.common.JDBCTemplate;

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
			JDBCTemplate.close(pstmt);

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
			JDBCTemplate.close(pstmt);
		}

		return result;
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
		
		return result;
	}


}
