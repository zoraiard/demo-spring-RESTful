package com.spring.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.spring.demo.domain.Request;
import com.spring.demo.domain.User;
import com.spring.demo.domain.enums.RequestState;

import java.util.List;
import java.util.Optional;

@Repository
public interface RequestStateRepository extends JpaRepository<RequestState, Long>{
	
	public List<Request> findAllByRequestId(Long id);
}
