package com.spring.mvc.board.commons;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SearchVO extends PageVO {
	
	private String keyword;
	private String condition;

}
