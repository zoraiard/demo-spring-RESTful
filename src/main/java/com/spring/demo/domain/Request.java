package com.spring.demo.domain;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

import com.spring.demo.domain.enums.RequestState;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Request {
	private Long id;
	private String subject;
	private String description;
	private Date creaionDate;
	private RequestState state;
	private User user;
	private List<RequestState> states = new ArrayList<RequestState>();
}
