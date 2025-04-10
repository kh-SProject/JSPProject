package edu.kh.memo.model.service;

import static edu.kh.memo.common.JDBCTemplate.close;
import static edu.kh.memo.common.JDBCTemplate.commit;
import static edu.kh.memo.common.JDBCTemplate.getConnection;
import static edu.kh.memo.common.JDBCTemplate.rollback;

import java.sql.Connection;

import edu.kh.memo.common.JDBCTemplate;
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
	public MemoList selectOne(int memoNo) throws Exception {
		
		Connection conn = JDBCTemplate.getConnection();
		
	    MemoList memo = memoDAO.selectOne(conn, memoNo);
	    
	    JDBCTemplate.close(conn);
	    
	    return memo;
	}

	
	

}
