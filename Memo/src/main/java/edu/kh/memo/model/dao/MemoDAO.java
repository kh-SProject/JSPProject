package edu.kh.memo.model.dao;

import java.sql.Connection;

public interface MemoDAO {

	int memoUpdate(Connection conn, int memoNo, String memoTitle, String memoDetail) throws Exception;

}
