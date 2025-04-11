package edu.kh.memo.model.service;

import static edu.kh.memo.common.JDBCTemplate.close;
import static edu.kh.memo.common.JDBCTemplate.commit;
import static edu.kh.memo.common.JDBCTemplate.getConnection;
import static edu.kh.memo.common.JDBCTemplate.rollback;

import java.sql.Connection;
import java.util.List;

import edu.kh.memo.common.JDBCTemplate;

import edu.kh.memo.model.dao.MemoDAO;
import edu.kh.memo.model.dao.MemoDAOImpl;
import edu.kh.memo.model.dto.Member;
import edu.kh.memo.model.dto.MemoList;

public class MemoServiceImpl implements MemoService {

	private MemoDAO memoDAO = new MemoDAOImpl();

	@Override
	public int memoUpdate(int memoNo, String memoTitle, String memoDetail) throws Exception {

		Connection conn = getConnection();

		int result = memoDAO.memoUpdate(conn, memoNo, memoTitle, memoDetail);

		if (result > 0)
			commit(conn);
		else
			rollback(conn);

		close(conn);

		return result;
	}

	@Override
	public Member login(String memberId, String memberPw) throws Exception {

		Connection conn = getConnection();

		Member member = memoDAO.login(conn, memberId, memberPw);

		close(conn);

		return member;

	}

	
	public MemoList selectOne(int memoNo) throws Exception {
		
	    Connection conn = getConnection();
	    
	    MemoList memo = memoDAO.selectOne(conn, memoNo);
	    
	    close(conn);
	    
	    return memo;
	}

	@Override
	public int memoDelete(int memo) throws Exception {
		Connection conn = getConnection();

		
		int result =  memoDAO.memoDelete(conn, memo);
		
		if(result > 0) commit(conn);
		else rollback(conn);
		
		close(conn);
		
		return result;
    
	}
		

	@Override
    public int memoAdd(String memoTitle, String memoDetail, int memberNo) throws Exception {

        Connection conn = getConnection();

        // 회원 번호도 함께 DAO로 전달
        int result = memoDAO.memoAdd(conn, memoTitle, memoDetail, memberNo);

        if (result > 0)
            commit(conn);
        else
            rollback(conn);

        close(conn);

        return result;
    }

	@Override
	public int memberUpdate(String memberId, String memberPw, int memberNo) throws Exception {

		Connection conn = getConnection();
		
		int result = memoDAO.memberUpdate(conn, memberId, memberPw, memberNo);
		
		if(result > 0) commit(conn);
		else 			rollback(conn);
		
		close(conn);
		
		return result;
	}

	@Override
	public List<MemoList> selectByMemberNo(int memberNo) throws Exception {
	    
		Connection conn = getConnection();
		List<MemoList> list = memoDAO.selectByMemberNo(conn, memberNo);

	    close(conn);
	    return list;
	}

}

}

