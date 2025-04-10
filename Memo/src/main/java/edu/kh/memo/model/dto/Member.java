package edu.kh.memo.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Member {
	private int memberNo;
	private String memberId;
	private String memberPw;
	private String memberName;
}
