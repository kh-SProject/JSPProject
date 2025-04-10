package edu.kh.memo.model.service;

import java.util.List;

import edu.kh.memo.model.dto.Member;
import edu.kh.memo.model.dto.MemoList;

public interface MemoService {

	int memoUpdate(int memoNo, String memoTitle, String memoDetail) throws Exception;

	Member login(String memberId, String memberPw) throws Exception;


	MemoList selectOne(int memoNo) throws Exception;

	int memoDelete(int memo) throws Exception;

	int memoAdd(String memoTitle, String memoDetail) throws Exception;


	int memberUpdate(String memberId, String memberPw, int memberNo) throws Exception;

	List<MemoList> selectByMemberNo(int memberNo) throws Exception;


}
