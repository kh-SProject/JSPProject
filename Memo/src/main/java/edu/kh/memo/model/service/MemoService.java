package edu.kh.memo.model.service;

import edu.kh.memo.model.dto.MemoList;

public interface MemoService {

	int memoUpdate(int memoNo, String memoTitle, String memoDetail) throws Exception;

	int memoAdd(String memoTitle, String memoDetail) throws Exception;
	
}
