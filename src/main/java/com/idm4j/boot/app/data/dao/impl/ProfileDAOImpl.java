package com.idm4j.boot.app.data.dao.impl;

import java.util.List;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.Transaction;
import javax.transaction.Transactional;

import com.idm4j.boot.app.data.dao.ProfileDAO;
import com.idm4j.boot.app.data.model.Profile;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class ProfileDAOImpl implements ProfileDAO {

	// Autowired SessionFactory to inject it and perform CURD operation
	@Autowired
	private SessionFactory sessionFactory;

	public ProfileDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Profile get(int id) {
		// TODO Auto-generated method stub
		try {
			return (Profile) sessionFactory.getCurrentSession().get(Profile.class, id);
		} catch (Exception ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
		return new Profile();
	}

	@Override
	public Profile saveOrUpdate(Profile user) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(user);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;

	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		Profile user = (Profile) sessionFactory.getCurrentSession().get(Profile.class, id);
		if (user != null) {
			sessionFactory.getCurrentSession().delete(user);
		}

		return;

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Profile> findAll() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("FROM Profile ORDER BY id").list();

	}

	@Override
	public Profile findByUserName(String userId) {
		return (Profile) sessionFactory.getCurrentSession().createQuery("FROM Profile u WHERE u.userId = :userid ")
				.setString("userid", userId).uniqueResult();

	}

}
