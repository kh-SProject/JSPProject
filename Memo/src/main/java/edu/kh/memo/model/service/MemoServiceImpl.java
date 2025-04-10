package edu.kh.memo.model.service;

import java.sql.Connection;

import static edu.kh.memo.common.JDBCTemplate.*;
import edu.kh.memo.model.dao.MemoDAO;
import edu.kh.memo.model.dao.MemoDAOImpl;
import edu.kh.memo.model.dto.MemoList;

public class MemoServiceImpl implements MemoService {

	private MemoDAO memoDAO = new MemoDAOImpl();

	@Override
	public int memoUpdate(int memoNo, String memoTitle, String memoDetail) throws Exception {

		Connection conn = getConnection();
		
		int result = memoDAO.memoUpdate(conn, memoNo, memoTitle, memoDetail);
		
		if(result > 0) commit(conn);
		else 		 rollback(conn);
		
		close(conn);
		
		return result;
	}

	@Override
	public MemoList memoDetail(int memoNO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int memoDelete(int memo) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
