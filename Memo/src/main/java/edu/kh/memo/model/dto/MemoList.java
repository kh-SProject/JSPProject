package edu.kh.memo.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MemoList {
	private int memoNo;
	private String memoTitle;
	private String memoDetail;
	private String memoDate;
	private String memoUpdate;
}
