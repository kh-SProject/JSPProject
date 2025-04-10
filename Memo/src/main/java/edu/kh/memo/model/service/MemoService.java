package edu.kh.memo.model.service;

import edu.kh.memo.model.dto.Member;
import edu.kh.memo.model.dto.MemoList;

public interface MemoService {

	int memoUpdate(int memoNo, String memoTitle, String memoDetail) throws Exception;

	Member login(String memberId, String memberPw) throws Exception;


	
}
