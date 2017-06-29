package com.application.dao;


import java.util.List;
import com.application.model.*;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository("userDetailsDAO")
public class UserDetailsDAOImpl implements UserDetailsDAO
{
	@Autowired
	private SessionFactory sessionFactory;
	public UserDetailsDAOImpl(SessionFactory sessionFactory){
		try {
			this.sessionFactory = sessionFactory;
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	
	
	@Transactional
	public List<UserDetails> list() {
		@SuppressWarnings("unchecked")
		List<UserDetails> list = (List<UserDetails>) sessionFactory.getCurrentSession().createCriteria(UserDetails.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		System.out.println("UD DaoImpl:::list method");
		return list;
	}

	
	

	
	@Transactional
	public void saveOrupdate(UserDetails userDetails)
	{
		//sessionFactory.getCurrentSession().saveOrUpdate(userDetails);
		Session s1=sessionFactory.openSession();
		Transaction t1=s1.beginTransaction();
		s1.saveOrUpdate(userDetails);
		t1.commit();
		System.out.println("UD DaoImpl:::saveorupdate");
		s1.close();
	}
	
	@Transactional
	public UserDetails get(int id) {
		String hql = "from UserDetails where id="+ "'" + id+"'";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<UserDetails> list = (List<UserDetails>) query.list();
		if(list != null && !list.isEmpty() ){
			System.out.println("UD DaoImpl:::get method");
			return list.get(0);
		}
		System.out.println("UD DaoImpl:::get method");
		return null;
	}
	
	@Transactional
	public boolean isValidUserDetails(int id, String password) {
		String hql = "from UserDetails where id='"+id+"' and " + "password='"+password+"'";
		//finally string produced is from UserDetails where id=' ' and password=' ';
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<UserDetails> userlist = (List<UserDetails>) query.list();
		System.out.println("This is what list contains"+userlist);
		if(userlist != null && !userlist.isEmpty() ){
			System.out.println("UD DaoImpl:::isValidUserDetails");

			return true;
		}
		System.out.println("UD DaoImpl:::isValidUserDetails");

		return false;
	}
		
	}
	

