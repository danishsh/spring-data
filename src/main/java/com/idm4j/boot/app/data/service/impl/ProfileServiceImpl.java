package com.idm4j.boot.app.data.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idm4j.boot.app.data.dao.ProfileDAO;
import com.idm4j.boot.app.data.model.Profile;
import com.idm4j.boot.app.data.service.ProfileService;

@Service
public class ProfileServiceImpl implements ProfileService {

	@Autowired
	private ProfileDAO profileDAO;
	
	public ProfileServiceImpl() {
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public Profile get(int id) {
		// TODO Auto-generated method stub
		return profileDAO.get(id);
	}

	@Override
	public Profile saveOrUpdate(Profile user) {
		// TODO Auto-generated method stub
		return profileDAO.saveOrUpdate(user);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
	   profileDAO.delete(id);
	}

	@Override
	public List<Profile> findAll() {
		// TODO Auto-generated method stub
		 return profileDAO.findAll();
	}

	@Override
	public Profile findByUserName(String userId) {
		// TODO Auto-generated method stub
		 return profileDAO.findByUserName(userId);
	}

}
