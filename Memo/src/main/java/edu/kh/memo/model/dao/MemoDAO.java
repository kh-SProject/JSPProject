package edu.kh.memo.model.dao;

import java.sql.Connection;

public interface MemoDAO {

	int memoUpdate(Connection conn, int memoNo, String memoTitle, String memoDetail) throws Exception;

	int memberUpdate(Connection conn, int memberNo, String memberId, String memberPw) throws Exception;

	int memoAdd(Connection conn, String memoTitle, String memoDetail) throws Exception;

}
