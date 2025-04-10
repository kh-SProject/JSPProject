package edu.kh.memo.model.dao;

import java.sql.Connection;

import edu.kh.memo.model.dto.MemoList;

public interface MemoDAO {

	int memoUpdate(Connection conn, int memoNo, String memoTitle, String memoDetail) throws Exception;

	int memberUpdate(Connection conn, int memberNo, String memberId, String memberPw) throws Exception;

	MemoList selectOne(Connection conn, int memoNo) throws Exception;

	int memoDelete(Connection conn, int memo) throws Exception;

	int memoAdd(Connection conn, String memoTitle, String memoDetail) throws Exception;


}



    
