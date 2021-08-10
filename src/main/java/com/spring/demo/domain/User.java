package com.spring.demo.domain;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter 
@Setter
public class User {
	private Long id;
	private String name;
	private String email;
	private String password;	
	private List<Request> request = new ArrayList<Request>();	
	private List<RequestState> states = new ArrayList<RequestState>(); 
}
