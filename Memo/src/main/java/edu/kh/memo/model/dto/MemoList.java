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
	private int memberNo;
	
	
	  public int getMemoNo() {
	        return memoNo;
	    }

	    public void setMemoNo(int memoNo) {
	        this.memoNo = memoNo;
	    }

	    public String getMemoTitle() {
	        return memoTitle;
	    }

	    public void setMemoTitle(String memoTitle) {
	        this.memoTitle = memoTitle;
	    }

	    public String getMemoDetail() {
	        return memoDetail;
	    }

	    public void setMemoDetail(String memoDetail) {
	        this.memoDetail = memoDetail;
	    }

	    public String getMemoDate() {
	        return memoDate;
	    }

	    public void setMemoDate(String memoDate) {
	        this.memoDate = memoDate;
	    }

	    public String getMemoUpdate() {
	        return memoUpdate;
	    }

	    public void setMemoUpdate(String memoUpdate) {
	        this.memoUpdate = memoUpdate;
	    }
	
}

