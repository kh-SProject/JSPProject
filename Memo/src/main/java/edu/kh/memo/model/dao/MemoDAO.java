package edu.kh.memo.model.dao;

import java.sql.Connection;

import edu.kh.memo.model.dto.Member;

public interface MemoDAO {

	int memoUpdate(Connection conn, int memoNo, String memoTitle, String memoDetail) throws Exception;

	int memberUpdate(Connection conn, int memberNo, String memberId, String memberPw) throws Exception;

	Member login(Connection conn, String memberId, String memberPw) throws Exception;

}
