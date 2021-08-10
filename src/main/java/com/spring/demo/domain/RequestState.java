package com.spring.demo.domain;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class RequestState {
	private Long id;
	private Date realizationDate;	
	private String description;
	private RequestState state;
	private User user;	
}
