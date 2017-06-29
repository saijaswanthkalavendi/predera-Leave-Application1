package com.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.application.dao.UserDetailsDAO;
import com.application.model.UserDetails;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	UserDetailsDAO dao;
	
	
	@Transactional
	public List<UserDetails> list() {
		System.out.println("udservice:::list");
		return dao.list();
	}

	@Transactional
	public void saveOrupdate(UserDetails userDetails)
	{
		System.out.println("udservice:::saveorupdate");
		dao.saveOrupdate(userDetails);
	}
	
	@Transactional
	public UserDetails get(int id) {
		System.out.println("udservice:::get");
		return dao.get(id);
	}
	
	

}
